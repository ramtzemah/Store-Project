package Controller;

import Model.Command.CommandOptions;
import Model.Command.showChoosenProductCommand;
import View.showSpecipicProducts;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class showChoosenProductController {
	private Stage primaryStage;
	private CommandOptions commOp;

		public showChoosenProductController(Stage primaryStage, CommandOptions commOp) {
			this.primaryStage = primaryStage;
			this.commOp=commOp;
		}

		public void startView() {
	 		showSpecipicProducts ssp = new showSpecipicProducts(primaryStage);
		 	try {
		 		ssp.start();
		 		ssp.Show.setOnAction(new EventHandler<ActionEvent>() {
		 			
	    	        @Override public void handle(ActionEvent e) {
	    	        	commOp.getScp().setBarcode(ssp.getBarcode());
	    	    		ssp.close();
	    	        	commOp.getScp().execute();
	    	        	

	    	        }
	    		});
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
	
		}
}
