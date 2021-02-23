package Controller;

import Model.Command.CommandOptions;
import View.showProfitByMakat;
import View.showSpecipicProducts;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class ChoosenProductProfitController {
	private Stage primaryStage;
	private CommandOptions commOp;

	public ChoosenProductProfitController(Stage primaryStage, CommandOptions commOp) {
		this.primaryStage = primaryStage;
		this.commOp = commOp;
	}

	public void startView() {
			showProfitByMakat ssp = new showProfitByMakat(primaryStage);
	 		ssp.start();
	 		ssp.Show.setOnAction(new EventHandler<ActionEvent>() {
	 			
    	        @Override public void handle(ActionEvent e) {
    	        	commOp.getChoosenProductProfitCommand().setBarcode(ssp.getBarcode());
    	        	ssp.close();
    	        	commOp.getChoosenProductProfitCommand().execute();
    	        	}
	 			});
		}
}
