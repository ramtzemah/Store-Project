package Model.Command;

import Model.Store;

public class showAllProductCommand implements Command{
	private Store store;
	
	public showAllProductCommand(Store store) {
		this.store=store;
	}
	
	@Override
	public void execute() {
		try {
			System.out.println(store);
		} catch (Exception e) {
			System.out.println("showAllProductCommand");
		}
	}

	public Store getStore() {
		return store;
	}

	
}
