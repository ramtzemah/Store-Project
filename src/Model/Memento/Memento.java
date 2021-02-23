package Model.Memento;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import Model.Client;
import Model.Product;

public class Memento {
	
	private static TreeMap<String, Product> productMapMemento;
	private static ArrayList<Client> clientsMemento;
	private static ArrayList<Client> clientsHowWantToGetMSGMemento;

	public Memento(Map<String, Product> productMap, ArrayList<Client> clients, ArrayList<Client> clientsWhantsToGetMSG) {
		clientsMemento = new ArrayList<Client>();
		for (int i = 0; i < clients.size(); i++) {
			clientsMemento.add(clients.get(i));
		}
		clientsHowWantToGetMSGMemento =  new ArrayList<Client>();
		for (int i = 0; i < clientsWhantsToGetMSG.size(); i++) {
			clientsHowWantToGetMSGMemento.add(clientsWhantsToGetMSG.get(i));
		}
		productMapMemento = new TreeMap<String, Product>();
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			productMapMemento.put(entry.getKey(),entry.getValue());
		}
	}

	public TreeMap<String, Product> getMap() {
		return productMapMemento;
	}

	public static ArrayList<Client> getClientsMemento() {
		return clientsMemento;
	}

	public static ArrayList<Client> getClientsHowWantToGetMSGMemento() {
		return clientsHowWantToGetMSGMemento;
	}

	
}
