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

public class Store implements Observable {
	private Map<String, Product> productMap;
	private boolean mementoposabilty = false;
	private boolean isExit = false;
	private ArrayList<Client> clients;
	// private static fileReadWrite file;
	private Singleton x;
	private ArrayList<Client> clientsWhantsToGetMSG;

	public Store(int Q) throws FileNotFoundException {
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
		addClinetsToClientsList(pro.buyer);
		addObserver(pro.buyer);
	}

	public void addClinetsToClientsList(Client client) {
		clients.add(client);
	}

	public ArrayList<Client> getClientList() {
		return clients;
	}

	@Override
	public String toString() {
		System.out.println("Store:");
		int i = 1;
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			System.out.println(i);
			i++;
			System.out.println(entry.getValue());
			System.out.println();
		}

		return " ";
	}

	public Product getProduct(String barcode) {
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			if (barcode.equals(entry.getKey())) {
				System.out.println(entry.getValue());
				return entry.getValue();
			}
		}
		return null;
	}

	public int getProfitFromAllPruducts() {
		int sum = 0;
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			sum += entry.getValue().getProfit();
		}
		return sum;
	}

	public Memento createMemento() {
		return new Memento(productMap, clients, clientsWhantsToGetMSG);
	}

	public void setMemento(Memento m) {
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
		} else {
			System.out.println("sorry but you cant undo right now");
		}
	}

	public void removeProduct(String barcode) {
		productMap.remove(barcode);
		mementoposabilty = false;
	}

	public void removeAllProduct() {
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
	public void notifyObservers(String msg) {
		for (int i = 0; i < clientsWhantsToGetMSG.size(); i++) {
			x.receiveMSG(clientsWhantsToGetMSG.get(i), x.s, new Message(msg));
		}
	}

}
