package Model.Command;

import java.util.ArrayList;

import Model.Client;
import Model.Store;
import Model.Obsrver.Message;

public class SendMessageCommand implements Command{
	private Store store;
	private String msg;
	
	public SendMessageCommand(Store store) {
		this.store=store;
	}
	
	@Override
	public void execute() {
		try {
			store.notifyObservers(msg);
		} catch (Exception e) {
			System.out.println("SendMessageCommand");
		}
	}

	public Store getStore() {
		return store;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
