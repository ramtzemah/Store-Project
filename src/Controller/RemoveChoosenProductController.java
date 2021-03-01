package Controller;

import Model.Command.CommandOptions;
import View.menuView;
import View.removeByMakat;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class RemoveChoosenProductController {
	private Stage primaryStage;
	private CommandOptions commOp;

		public RemoveChoosenProductController(Stage primaryStage, CommandOptions commOp) {
			this.primaryStage = primaryStage;
			this.commOp=commOp;
		}

		public void startView() {
			removeByMakat rpbm = new removeByMakat();
			rpbm.start();
			rpbm.getShow().setOnAction(new EventHandler<ActionEvent>() {
		    	
		        @Override public void handle(ActionEvent e) {
		        	ValidsTests vt = new ValidsTests();
		    		if(rpbm.getBarcode().getText().isEmpty()) {
		    		menuView.showErrorMessage("you have to add a barcode");
		    		}
		    		else if(!vt.checkBarcode(rpbm.getBarcode().getText())) {
		    			vt.showErrorMessage("wrong input on barcode");
		    		}
				else {
					String barcode = rpbm.getBarcode().getText();
					commOp.getRemoveChoosenProductCommand().setBarcode(barcode);
					commOp.getRemoveChoosenProductCommand().execute();
					rpbm.close();
				}
				
		        		
		        }
	        });
		}
	
}
