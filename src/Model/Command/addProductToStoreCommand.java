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
	private Client buyer;
	
	public addProductToStoreCommand(Store store){
		this.store = store;
	}
	
	@Override
	public void execute() {
		try {
			//Product pro = new Product(ProductName, barcode, CostPrice, SellingPrice,buyer.getClientName(),buyer.getPhoneNumber(),buyer.isWantsUpdate());
		//	store.addToStore(pro);
		} catch (Exception e) {
			System.out.println("addProductToStoreCommand");
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

	public void setBuyer(Client buyer) {
		this.buyer = buyer;
	}

	
	
	

}
