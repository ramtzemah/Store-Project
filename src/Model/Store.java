package Model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
//written by ram
//17/2
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//import Model.FileWork.fileReadWrite;
import Model.Memento.Memento;
import Model.Obsrver.Message;
import Model.Obsrver.Observable;
import Model.Singleton.Singleton;
import View.menuView;
import javafx.application.Platform;

public class Store implements Observable {
	private Map<String, Product> productMap;
	private boolean mementoposabilty = false;
	private boolean isExit = false;
	private ArrayList<Client> clients;
	private menuView theView;
	// private static fileReadWrite file;
	private Singleton x;
	private ArrayList<Client> clientsWhantsToGetMSG;
	private  static Memento m;

	public Store(int Q,menuView theView) throws FileNotFoundException {
		this.theView=theView;
		x = Singleton.getInstance();
		clients = new ArrayList<Client>();
		clientsWhantsToGetMSG = new ArrayList<Client>();
		// file = new fileReadWrite("file.bin");
		switch (Q) {
		case 1:
			productMap = new TreeMap<String, Product>();
			break;
		case 2:
			productMap = new TreeMap<String, Product>(Collections.reverseOrder());
			break;
		case 3:
			productMap = new TreeMap<String, Product>(new Comparator<String>() {

				public boolean containsKey(Object key) {
					for (Map.Entry<String, Product> entry : productMap.entrySet()) {
						if (entry.getKey().equals(key)) {
							return true;
						}
					}

					return false;
				}

				@Override
				public int compare(String str1, String str2) {
					return -1;
				}
			});
			break;
		}
	}

	public void addToStore(Product pro) throws IOException {
		createMemento();

		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			if (entry.getKey().equals(pro.getBarcode())) {
				isExit = true;
				entry.setValue(pro);
				break;
			}
		}
		if (!isExit) {
			productMap.put(pro.getBarcode(), pro);
		}
		mementoposabilty = true;
		// file.writeProductToFile(pro);
		isExit = false;
		addClinetsToClientsList(pro.getBuyer());
		addObserver(pro.getBuyer());
	}

	public void showAllClients() {
		StringBuffer str = new StringBuffer();
	//	View.showAllClients sal = new View.showAllClients();
		for (int i = 0; i < clients.size(); i++) {
			if(!clients.get(i).equals(" ")) {
				str.append(clients.get(i)+"\n\n");
			}
		}theView.getSac().setLabel(str.toString());
		theView.getSac().start();
	}
	
	public void addClinetsToClientsList(Client client) {
		clients.add(client);
	}

	public ArrayList<Client> getClientList() {
		return clients;
	}


	public void ShowAllProducts() {
		StringBuffer str =  new StringBuffer();
		int i = 1;
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			str.append(i+")\n");
			i++;
			str.append(entry.getValue()+"\n\n");
		}
		theView.getSap().setLabel(str.toString());
		theView.getSap().start();
	}
	
	
	@Override
	public String toString() {
		StringBuffer str =  new StringBuffer();
		int i = 1;
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			str.append(i+")\n");
			i++;
			str.append(entry.getValue()+"\n\n");
		}
		return str.toString();
	}

	public Product getProduct(String barcode) {
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			if (barcode.equals(entry.getKey())) {
				theView.showSuccsessMessage(entry.getValue().toString());
				return entry.getValue();
			}
		}
		theView.showErrorMessage("there no such product");
		return null;
		}
	public Product getProfitByBarcode(String barcode) {
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			if (barcode.equals(entry.getKey())) {
				//System.out.println(entry.getValue());
				theView.showSuccsessMessage("for barcode "+entry.getKey()+"\nthe profit is: " +entry.getValue().getProfit());
				return entry.getValue();
			}
		}
		theView.showErrorMessage("there no such product");
		return null;
	}

	public int getProfitFromAllPruducts() {
		int sum = 0;
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			sum += entry.getValue().getProfit();
		}
		theView.showSuccsessMessage("the total profit is: " +sum);
		return sum;
	}

	public Memento createMemento() {
		m = new Memento(productMap, clients, clientsWhantsToGetMSG);
		return new Memento(productMap, clients, clientsWhantsToGetMSG);
	}

	public void setMemento() {
		if (mementoposabilty) {
			TreeMap<String, Product> temp = m.getMap();
			productMap.clear();
			
			for (Map.Entry<String, Product> entry : temp.entrySet()) {
				productMap.put(entry.getKey(), entry.getValue());
			}
			clients.clear();
			ArrayList<Client> tempClinets = m.getClientsMemento();
			for (int i = 0; i < tempClinets.size(); i++) {
				clients.add(tempClinets.get(i));
			}

			clientsWhantsToGetMSG.clear();
			ArrayList<Client> tempClinetsMSG = m.getClientsHowWantToGetMSGMemento();
			for (int i = 0; i < tempClinetsMSG.size(); i++) {
				clientsWhantsToGetMSG.add(tempClinetsMSG.get(i));
			}
			mementoposabilty = false;
			theView.showSuccsessMessage("success undo");
		} else {
			theView.showErrorMessage("you cant undo now");
		}
	}

	public void removeProduct(String barcode) {
		String clientName = "";
		int check =0;
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			if(barcode.equals(entry.getValue().getBarcode())) {
				clientName=entry.getValue().getBuyer().ClientName;
				check++;
			}
		}
		productMap.remove(barcode);
		for (int i = 0; i < clients.size(); i++) {
			if(clients.get(i).getClientName().equals(clientName)) {
				clients.remove(i);
			}
		}
		for (int i = 0; i < clientsWhantsToGetMSG.size(); i++) {
			if(clientsWhantsToGetMSG.get(i).getClientName().equals(clientName)) {
				clientsWhantsToGetMSG.remove(i);
			}
		}
		mementoposabilty = false;
		if(check==1) {
			theView.showSuccsessMessage("the product remove");
		}else theView.showErrorMessage("there is not such product");
	}

	public void removeAllProduct() {
		clients.clear();
		clientsWhantsToGetMSG.clear();
		productMap.clear();
		mementoposabilty = false;
	}

	@Override
	public void addObserver(Client c) {
		if (c.wantsUpdate) {
			clientsWhantsToGetMSG.add(c);
		}
	}

	@Override
	public void deleteObserver(Client c) {
		for (int i = 0; i < clientsWhantsToGetMSG.size(); i++) {
			if (c.phoneNumber.equals(clientsWhantsToGetMSG.get(i).phoneNumber)) {
				clientsWhantsToGetMSG.remove(i);
			}
		}
	}

	@Override
	public synchronized void notifyObservers(String msg) {
		StringBuffer str = new StringBuffer(""); 
		theView.getSms().setLabel(str.toString());
		theView.getSms().start();

		Thread thread = new Thread(()->{
		try {
			
			for (Client C : clientsWhantsToGetMSG) {
				
				Platform.runLater(() ->{
				str.append(x.receiveMSG(C, x.s, new Message(msg)));
				str.append("\n");
				theView.getSms().setLabel(str.toString());
				theView.getSms().start();
				});
				
				Thread.sleep(2000);
				}
			}catch (InterruptedException e) {
				System.out.println("store");
			} 
		});
		thread.start();
	}
	
}
