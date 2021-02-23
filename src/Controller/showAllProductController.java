package Controller;

import Model.Command.CommandOptions;
import View.showAllProducts;
import javafx.stage.Stage;

public class showAllProductController {
	private Stage primaryStage;
	private CommandOptions commOp;

		public showAllProductController(Stage primaryStage, CommandOptions commOp) {
			this.primaryStage = primaryStage;
			this.commOp=commOp;
		}

		public void startView() {
	    	try {

				commOp.ShowAllProductCommand();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		
}
