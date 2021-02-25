//writen by omer
//16.2.2021 , 15:50
//edit by ram 17/2 

package Model;

import View.menuView;

public class Product {
	private String barcode;
	private String ProductName;
	private int CostPrice; //the price that the store paid to the supplier
	private int SellingPrice; //the price in the store
	private Client buyer; // contains name , phone number , and a boolean - wants Updates

	public Product(String barcode,String ProductName,int CostPrice,int SellingPrice , String clientName,String clientPhoneNumber, boolean wantsUpdate){
		this.barcode = barcode;
		this.ProductName = ProductName;
		this.CostPrice = CostPrice;
		this.SellingPrice = SellingPrice;
		this.buyer = new Client(clientName, clientPhoneNumber, wantsUpdate);
	}
	public Product(String ProductName,String barcode,int CostPrice,int SellingPrice){
		this.barcode = barcode;
		this.ProductName = ProductName;
		this.CostPrice = CostPrice;
		this.SellingPrice = SellingPrice;
		this.buyer = new Client(" ", " ", false);

	}
	
	public String getBarcode() {
		return barcode;
	}
	public String getProductName() {
		return ProductName;
	}
	public int getCostPrice() {
		return CostPrice;
	}
	public int getSellingPrice() {
		return SellingPrice;
	}
	public Client getBuyer() {
		return buyer;
	}
	@Override
	public String toString() {
		StringBuffer str =new StringBuffer();
		str.append( "barcode:\t " + barcode + "\nProductName:\t " + ProductName + "\nCostPrice:\t " + CostPrice
				+ "\nSellingPrice:\t " + SellingPrice+"\n");
		return str.toString();
	}

	public int getProfit() {
		return (SellingPrice-CostPrice);
	}
	
	
	
	
}
