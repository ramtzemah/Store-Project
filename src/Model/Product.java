//writen by omer
//16.2.2021 , 15:50
//edit by ram 17/2 

package Model;

public class Product {
	String barcode;
	String ProductName;
	int CostPrice; //the price that the store paid to the supplier
	int SellingPrice; //the price in the store
	Client buyer; // contains name , phone number , and a boolean - wants Updates
	
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
		System.out.println( "barcode " + barcode + "\nProductName " + ProductName + "\nCostPrice " + CostPrice
				+ "\nSellingPrice " + SellingPrice);
		if(buyer!=null) {
			System.out.println(buyer);
		}
		return " ";
	}

	public int getProfit() {
		return (SellingPrice-CostPrice);
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
