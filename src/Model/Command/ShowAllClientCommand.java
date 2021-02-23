package Model.Command;

import java.util.ArrayList;

import Model.Client;
import Model.Store;

public class ShowAllClientCommand implements Command {
	private Store store;
	private ArrayList<Client> clients; 
	
	
	public ShowAllClientCommand(Store store) {
		this.store=store;
		clients = new ArrayList<Client>();
	}
	
	@Override
	public void execute() {
		try {
			store.showAllClients();
//			clients = store.getClientList();
//			for (int i = 0; i < clients.size(); i++) {
//				System.out.println(clients.get(i));
//			}
		} catch (Exception e) {
			System.out.println("ShowAllClientCommand");
		}
	}

	public Store getStore() {
		return store;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = store.getClientList();
	}

	
}
