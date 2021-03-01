package Controller;

import com.sun.javafx.webkit.ThemeClientImpl;

import Model.Product;
import Model.Store;
import Model.Command.AllProductsProfitCommand;
import Model.Command.ChoosenProductProfitCommand;
import Model.Command.Command;
import Model.Command.CommandOptions;
import Model.Command.MementoCommand;
import Model.Command.RemoveAllProductCommand;
import Model.Command.RemoveChoosenProductCommand;
import Model.Command.SendMessageCommand;
import Model.Command.ShowAllClientCommand;
import Model.Command.addProductToStoreCommand;
import Model.Command.showAllProductCommand;
import Model.Command.showChoosenProductCommand;
import View.menuView;
import View.menuView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class Controller {

	private menuView menuview;
		public Controller(Stage primaryStage, menuView menuview, int choise) throws Exception {
			this.menuview=menuview;	
			menuview.start();
			Store store =new Store(choise,menuview);
			Product pro1 = new Product("def","milk" ,3,5,"ram", "0501111111", true);
			Product pro2 = new Product( "abc","apple",7,9,"omer", "05022222222", false);
			Product pro3 = new Product( "ghi","orange",1,6,"mohamad", "0503333333", true);
			store.addToStore(pro3);
			store.addToStore(pro1);
			store.addToStore(pro2);
			addProductToStoreCommand apts = new addProductToStoreCommand(store);
			Command AllProductsProfitCommand = new AllProductsProfitCommand(store);
			ChoosenProductProfitCommand ccp= new ChoosenProductProfitCommand(store);
			Command MementoCommand = new MementoCommand(store);
			Command RemoveAllProductCommand = new RemoveAllProductCommand(store);
			RemoveChoosenProductCommand rcpc = new RemoveChoosenProductCommand(store);
			SendMessageCommand sMSG = new SendMessageCommand(store);
			ShowAllClientCommand sak = new ShowAllClientCommand(store);
			Command showAllProductCommand=new showAllProductCommand(store);
			showChoosenProductCommand showChoosenProductCommand = new showChoosenProductCommand(store);

			CommandOptions CommOp = new CommandOptions(apts, AllProductsProfitCommand, ccp, MementoCommand, RemoveAllProductCommand, rcpc, sMSG, sak, showAllProductCommand, showChoosenProductCommand,store);
			addProductController apc = new addProductController(CommOp);
			AllProductsProfitController app = new AllProductsProfitController(primaryStage,CommOp);
			ChoosenProductProfitController cpp = new ChoosenProductProfitController(primaryStage,CommOp);
			MementoController mm = new MementoController(primaryStage,CommOp);
			RemoveAllProductController rap = new RemoveAllProductController(primaryStage,CommOp);
			RemoveChoosenProductController rcp = new RemoveChoosenProductController(primaryStage,CommOp);
			SendMessageController sm = new SendMessageController(primaryStage,CommOp);
			ShowAllClientController sac = new ShowAllClientController(primaryStage,CommOp);
			showAllProductController sap = new showAllProductController(primaryStage,CommOp);
			showChoosenProductController scp = new showChoosenProductController(primaryStage,CommOp);
			
			
			
			menuview.addProd.setOnAction(new EventHandler<ActionEvent>() {
    	        @Override public void handle(ActionEvent e) {
    	        	apc.startView();
    	            
    	        }
    		});
			
			menuview.showAllProd.setOnAction(new EventHandler<ActionEvent>() {
    	        @Override public void handle(ActionEvent e) {
    	        	sap.startView();
    	            
    	        }
    		});
			
			menuview.showProds.setOnAction(new EventHandler<ActionEvent>() {
    	        @Override public void handle(ActionEvent e) {
    	        	scp.startView();
    	            
    	        }
    		});
			
			menuview.RemoveLastProd.setOnAction(new EventHandler<ActionEvent>() {
    	        @Override public void handle(ActionEvent e) {
    	        	mm.startView();
    	            
    	        }
    		});
			
			menuview.RemoveByMAKAT.setOnAction(new EventHandler<ActionEvent>() {
    	        @Override public void handle(ActionEvent e) {
    	        	rcp.startView();
    	            
    	        }
    		});
			
			menuview.RemoveAllProds.setOnAction(new EventHandler<ActionEvent>() {
    	        @Override public void handle(ActionEvent e) {
    	        	rap.startView();
    	            
    	        }
    		});
			
			menuview.showSpecProfit.setOnAction(new EventHandler<ActionEvent>() {
    	        @Override public void handle(ActionEvent e) {
    	        	cpp.startView();
    	            
    	        }
    		});
			
			menuview.showProfit.setOnAction(new EventHandler<ActionEvent>() {
    	        @Override public void handle(ActionEvent e) {
    	        	app.startView();
    	            
    	        }
    		});
			
			menuview.sendMSG.setOnAction(new EventHandler<ActionEvent>() {
    	        @Override public void handle(ActionEvent e) {
    	        	sm.startView();
    	            
    	        }
    		});
			
			menuview.showAllClient.setOnAction(new EventHandler<ActionEvent>() {
    	        @Override public void handle(ActionEvent e) {
    	        	sac.startView();
    	            
    	        }
    		});
			
			
		}
		
			
			
	
	}
