//written by ram
//17/2


package Model;

import Model.Memento.Memento;
import Model.Obsrver.Message;
import Model.Singleton.Singleton;

public class main {
	
	public static void main(String[] args) {
		Store store = new Store(3);
		Product pro1 = new Product("milk", "def",3,5);
		Product pro2 = new Product("apple", "abc",7,9);
		Product pro3 = new Product("orange", "ghi",1,6);
		
		store.addToStore(pro1);
		store.addToStore(pro2);
		store.addToStore(pro3);
		System.out.println(store.toString());
		store.addToStore(pro2);
		store.addToStore(pro2);
		store.addToStore(pro2);
		pro2.setCostPrice(6);
		store.addToStore(pro2);
		System.out.println(store.toString());

		
		
		
//		Memento mem = store.createMemento();
//		store.addToStore(pro3);
//		System.out.println(store.toString());
//		store.setMemento(mem);
//		System.out.println(store.toString());
//		store.setMemento(mem);
//		store.addToStore(pro2);
//		System.out.println(store.toString());
//		store.setMemento(mem);
//		System.out.println(store.toString());


		
//		Client c1 = new Client("ram", "0501111111", true);
//		Client c2 = new Client("omer", "05022222222", false);
//		Client c3 = new Client("mohamad", "0503333333", true);
//
//		Client[] cliens = new Client[3];
//		cliens[0]=c1;
//		cliens[1]=c2;
//		cliens[2]=c3;
//		Singleton x = Singleton.getInstance(); 
//		for (int i = 0; i < 3; i++) {
//			if(cliens[i].wantsUpdate) {
//			x.receiveMSG(cliens[i],x.s, new Message("3 b- 30, 5 b-50 "));
//			}
//		}
	//	System.out.println(pro1.getProfit());
	//	System.out.println(store.getProfitFromAllPruducts());
	}

	
	
}
