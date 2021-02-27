package Model.Command;

import java.io.IOException;

import Model.Client;
import Model.Product;
import Model.Store;

public class addProductToStoreCommand implements Command {
	private Store store;
	private String barcode;
	private String ProductName;
	private int CostPrice;
	private int SellingPrice; 
	private String clientName;
	private String clientPhoneNumber;
	private boolean wantsGetMSG;
	
	public addProductToStoreCommand(Store store){
		this.store = store;
	}
	
	@Override
	public void execute() {
		try {
			Product pro = new Product(barcode, ProductName, CostPrice, SellingPrice,clientName,clientPhoneNumber,wantsGetMSG);
			store.addToStore(pro);
		} catch (Exception e) {
			//System.out.println("addProductToStoreCommand");
		}		
	}

	public Store getStore() {
		return store;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public void setCostPrice(int costPrice) {
		CostPrice = costPrice;
	}

	public void setSellingPrice(int sellingPrice) {
		SellingPrice = sellingPrice;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setClientPhoneNumber(String clientPhoneNumber) {
		this.clientPhoneNumber = clientPhoneNumber;
	}

	public void setWantsGetMSG(boolean wantsGetMSG) {
		this.wantsGetMSG = wantsGetMSG;
	}
	
	
}
