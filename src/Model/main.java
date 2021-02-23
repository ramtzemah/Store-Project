//written by ram
//17/2


package Model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.AllPermission;

import Controller.Controller;
import Model.Command.AllProductsProfitCommand;
import Model.Command.ChoosenProductProfitCommand;
import Model.Command.Command;
import Model.Command.CommandOptions;
import Model.Command.MementoCommand;
import Model.Command.RemoveChoosenProductCommand;
import Model.Command.SendMessageCommand;
import Model.Command.ShowAllClientCommand;
import Model.Command.addProductToStoreCommand;
import Model.Command.showAllProductCommand;
import Model.Command.showChoosenProductCommand;
import Model.Memento.Memento;
import Model.Obsrver.Message;
import Model.Singleton.Singleton;
import View.menuView;
import View.menuView;
import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application{
	
	public static void main(String[] args) throws IOException {
		
		
		{
	    Application.launch(args);   
		}
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		menuView view = new menuView(primaryStage);
		Controller controller = new Controller(primaryStage,view);
		
//		view.start(primaryStage);	
	}
		
//		Store store = new Store(1);
//		Command addProductToStoreCommand = new addProductToStoreCommand(store);
//		Command AllProductsProfitCommand = new AllProductsProfitCommand(store);
//		Command ChoosenProductProfitCommand= new ChoosenProductProfitCommand(store);
//		Command MementoCommand = new MementoCommand(store);
//		Command RemoveAllProductCommand = new Model.Command.RemoveAllProductCommand(store);
//		Command RemoveChoosenProductCommand = new RemoveChoosenProductCommand(store);
//		Command SendMessageCommand = new SendMessageCommand(store);
//		Command ShowAllClientCommand = new ShowAllClientCommand(store);
//		Command showAllProductCommand=new showAllProductCommand(store);
//		Command showChoosenProductCommand = new showChoosenProductCommand(store);
//		Product pro1 = new Product("def","milk" ,3,5,"ram", "0501111111", true);
//		Product pro2 = new Product( "abc","apple",7,9,"omer", "05022222222", false);
//		Product pro3 = new Product( "ghi","orange",1,6,"mohamad", "0503333333", true);
//		
//		Memento mem = store.createMemento();
//		store.addToStore(pro3);
//		store.addToStore(pro2);
//		store.addToStore(pro1);

		//store.addToStore(pro3);
//		Client c1 = new Client("ram", "0501111111", true);
//		Client c2 = new Client("omer", "05022222222", false);
//		Client c3 = new Client("mohamad", "0503333333", true);
//		System.out.println(store.toString());
	//	store.addToStore(pro2);
	//	System.out.println(store.toString());
//		store.setMemento(mem);
	//	System.out.println(store.toString());
	//	System.out.println(store.getProduct("abc"));
//		System.out.println(store.getProduct("abc"));
//		System.out.println(store.getProfitFromAllPruducts());
//		store.notifyObservers("3 b-30 ,5b-50");
//		
		
		
		//		store.addToStore(pro2);
//		store.addToStore(pro2);
//		store.addToStore(pro2);
//		pro2.setCostPrice(6);
//		store.addToStore(pro2);
//		System.out.println(store.toString());
//		System.out.println(store);
//		store.setMemento(mem);
//		System.out.println(store);

		
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
