package Model.Command;

import Model.Store;

public class RemoveChoosenProductCommand implements Command {
	private Store store;
	private String barcode;
	
	public RemoveChoosenProductCommand(Store store) {
	this.store=store;
	}
	
	@Override
	public void execute() {
		try {
		store.removeProduct(barcode);
		} catch (Exception e) {
			System.out.println("RemoveChoosenProductCommand");
		}		
	}

	public Store getStore() {
		return store;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	
}
