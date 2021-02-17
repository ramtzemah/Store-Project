package Model;
//written by ram
//17/2
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import Model.Memento.Memento;


public class Store {
	private Map<String, Product> productMap;
	private	boolean mementoposabilty = false;
	private boolean isExit = false;

	public Store(int Q) {
		switch (Q) {
		case 1:
			productMap = new TreeMap<String, Product>();
			break;
		case 2:
			productMap = new TreeMap<String,Product>(Collections.reverseOrder());
			break;
		case 3:
			productMap = new TreeMap<String,Product>(new Comparator<String>() {
				
			    public boolean containsKey(Object key) {
			    		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
						if(entry.getKey().equals(key)) {
							return true;
						}
					}
					
					return false;	
				}
				@Override
				public int compare(String str1,String str2) {
					return -1;
				}			
			});
			break;
		default:
			break;
		}
	}
	
	public void addToStore(Product pro) {
		
 		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			if(entry.getKey().equals(pro.getBarcode())) {
				isExit = true;
				entry.setValue(pro);
				break;
			}
		}
		if(!isExit) {
		productMap.put(pro.getBarcode(), pro);
		}
		mementoposabilty = true;
		createMemento();
		isExit = false;
	}

	@Override
	public String toString() {
		 System.out.println("Store:");
		 int i = 1 ;
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			System.out.println(i);
			i++;
		     System.out.println(entry.getValue() );
		System.out.println();
		}
		
		return " ";		
	}
	
	public Product getProduct(String barcode) {
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			if(barcode.equals(entry.getValue().barcode)) {
				System.out.println(entry.getValue());
				return entry.getValue();
			}
		}
		return null;
	}

	public int getProfitFromAllPruducts() {
		int sum = 0;
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			sum+=entry.getValue().getProfit();
		}
		return sum;
	}

	public Memento createMemento() {
		return new Memento(productMap);
	}

	public void setMemento(Memento m) {
		if(mementoposabilty)
		{ 
			TreeMap<String, Product> temp = m.getMap();
			productMap.clear();
				for (Map.Entry<String, Product> entry : temp.entrySet()) {
					productMap.put(entry.getKey(),entry.getValue());
				}
			
		mementoposabilty= false;
		}else{
			System.out.println("sorry but you cant undo right now");
		}
	}
}

