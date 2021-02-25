package Model.Command;

import Model.Store;
import View.showAllProducts;
import View.showTotalProfit;

public class showAllProductCommand implements Command{
	private Store store;
	
	public showAllProductCommand(Store store) {
		this.store=store;
	}
	
	@Override
	public void execute() {
		try {
			//System.out.println(store);
			//showAllProducts stp = new showAllProducts(store);
			store.ShowAllProducts();
		} catch (Exception e) {
			System.out.println("showAllProductCommand");
		}
	}

	public Store getStore() {
		return store;
	}

	
}
