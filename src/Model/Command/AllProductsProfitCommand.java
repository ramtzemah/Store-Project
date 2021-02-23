package Model.Command;

import Model.Store;

public class AllProductsProfitCommand implements Command {
	private Store store;
	
	public AllProductsProfitCommand(Store store) {
		this.store=store;
	}
	
	@Override
	public void execute() {
		try {
			System.out.println(store.getProfitFromAllPruducts());
		} catch (Exception e) {
			System.out.println("AllProductsProfitCommand");
		}
	}

	public Store getStore() {
		return store;
	}

	
}
