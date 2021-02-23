package Model.Command;

import Model.Store;

public class RemoveAllProductCommand implements Command {
	private Store store;
	
	public RemoveAllProductCommand(Store store) {
	this.store=store;
	}
	
	@Override
	public void execute() {
		try {
		store.removeAllProduct();
		} catch (Exception e) {
			System.out.println("RemoveAllProductCommand");
		}		
	}

	public Store getStore() {
		return store;
	}

}
