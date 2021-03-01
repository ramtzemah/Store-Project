package Model;

import java.awt.BufferCapabilities.FlipContents;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
//written by ram
//17/2
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import Model.FileWork.FileIterator;
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
	private FileIterator files;
	private Singleton x;
	private ArrayList<Client> clientsWhantsToGetMSG;
	private static Memento m;
	private int checker = 1;

	public Store(int Q, menuView theView) throws IOException {
		File file = new File("products.txt");
		files = new FileIterator(file);
		this.theView = theView;
		x = Singleton.getInstance();
		clients = new ArrayList<Client>();
		clientsWhantsToGetMSG = new ArrayList<Client>();
		switch (Q) {
		case 1:
			productMap = new TreeMap<String, Product>();
			if (file.exists())
				readFromFile();
			break;
		case 2:
			productMap = new TreeMap<String, Product>(Collections.reverseOrder());
			if (file.exists())
				readFromFile();
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
			if (file.exists())
				readFromFile();
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
			addClinetsToClientsList(pro.getBuyer());
			addObserver(pro.getBuyer());
		}
		mementoposabilty = true;
		isExit = false;

		if (checker == 1)
			files.saveTofile(productMap);
	}

	public void showAllClients() {
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < clients.size(); i++) {
			if (!clients.get(i).equals(" ")) {
				str.append(clients.get(i) + "\n\n");
			}
		}
		theView.getSac().setLabel(str.toString());
		theView.getSac().start();
	}

	public void addClinetsToClientsList(Client client) {
		clients.add(client);
	}

	public ArrayList<Client> getClientList() {
		return clients;
	}

	public void ShowAllProducts() {
		StringBuffer str = new StringBuffer();
		int i = 1;
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			str.append(i + ")\n");
			i++;
			str.append(entry.getValue() + "\n\n");
		}
		theView.getSap().setLabel(str.toString());
		theView.getSap().start();
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		int i = 1;
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			str.append(i + ")\n");
			i++;
			str.append(entry.getValue() + "\n\n");
		}
		return str.toString();
	}

	public Product getProduct(String barcode) {
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			if (barcode.equals(entry.getKey())) {
				theView.getSpw().setHeadAllProd("the chosen product is:");
				theView.getSpw().setLabel(entry.getValue().toString());
				theView.getSpw().start();
				return entry.getValue();
			}
		}
		theView.showErrorMessage("there no such product");
		return null;
	}

	public Product getProfitByBarcode(String barcode) {
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			if (barcode.equals(entry.getKey())) {
				// System.out.println(entry.getValue());
				theView.getSpw().setHeadAllProd("for barcode " + entry.getKey());
				theView.getSpw().setLabel(
						"\nthe profit is: " + entry.getValue().getProfit());
				theView.getSpw().start();
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
		theView.getSpw().setHeadAllProd("the total profit is:");
		theView.getSpw().setLabel(""+sum);
		theView.getSpw().start();
		return sum;
	}

	public Memento createMemento() {
		m = new Memento(productMap, clients, clientsWhantsToGetMSG);
		return new Memento(productMap, clients, clientsWhantsToGetMSG);
	}

	public void setMemento() throws IOException {
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
			files.saveTofile(productMap);
			theView.showSuccsessMessage("success undo");
		} else {
			theView.showErrorMessage("you cant undo now");
		}
	}

	private void readFromFile() throws IOException {
		Iterator<Entry<String, Product>> fileitrator = files.iterator();
		if (!fileitrator.hasNext()) {
			checker = 1;
			return;
		}

		while (fileitrator.hasNext()) {
			checker = 0;
			Entry<String, Product> tmp = fileitrator.next();
			addToStore(tmp.getValue());
		}
		checker = 1;
	}

	public void removeProduct(String barcode) throws IOException {
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
		Iterator<Entry<String, Product>> itrator = files.iterator();
		while (itrator.hasNext()) {
			Entry<String, Product> tmp = itrator.next();
			if (tmp.getKey().equals(barcode)) {
				itrator.remove();
				readFromFile();
		mementoposabilty = false;
		if(check==1) {
			theView.showSuccsessMessage("the product remove");
		}else theView.showErrorMessage("there is not such product");
			}
		}
	}

	public void removeAllProduct() {
		clients.clear();
		clientsWhantsToGetMSG.clear();
		productMap.clear();
		Iterator<Entry<String, Product>> it = files.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
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

		Thread thread = new Thread(() -> {
			try {

				for (Client C : clientsWhantsToGetMSG) {

					Platform.runLater(() -> {
						str.append(x.receiveMSG(C, x.s, new Message(msg)));
						str.append("\n");
						theView.getSms().setLabel(str.toString());
						theView.getSms().start();
					});

					Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				System.out.println("store");
			}
		});
		thread.start();
	}

}
