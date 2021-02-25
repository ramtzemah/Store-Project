package Model.Command;

import Model.Store;
import Model.Memento.Memento;

public class MementoCommand implements Command {
	private Store store;
	private Memento mem;
	
	public MementoCommand(Store store) {
		this.store=store;
	}
	
	@Override
	public void execute() {
		try {
			store.setMemento();
		} catch (Exception e) {
			System.out.println("MementoCommand");
		}
	}

	public Store getStore() {
		return store;
	}
	
}
