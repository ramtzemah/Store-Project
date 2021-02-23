package Model.Command;

import Model.Store;

public class ChoosenProductProfitCommand implements Command {
	private Store store;
	private String barcode;
	
	public ChoosenProductProfitCommand(Store store) {
	this.store=store;
	}
	
	@Override
	public void execute() {
		try {
		store.getProduct(barcode).getProfit();
		} catch (Exception e) {
			System.out.println("ChoosenProductProfitCommand");
		}		
	}

	public Store getStore() {
		return store;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
}
