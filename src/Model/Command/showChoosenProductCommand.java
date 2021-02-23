package Model.Command;

import Model.Store;

public class showChoosenProductCommand implements Command {
	private Store store;
	private String barcode;
	
	public showChoosenProductCommand(Store store) {
		this.store = store;


	}


	@Override
	public void execute() {
		try {
			System.out.println(store.getProduct(barcode));
		} catch (Exception e) {
			System.out.println("showChoosenProductCommand");
		}			
	}


	public Store getStore() {
		return store;
	}


	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	
	
}
