package Controller;

import Model.Command.CommandOptions;
import javafx.stage.Stage;

public class AllProductsProfitController {
	private Stage primaryStage;
	private CommandOptions commOp;

		public AllProductsProfitController(Stage primaryStage, CommandOptions commOp) {
			this.primaryStage = primaryStage;
			this.commOp=commOp;
		}

		public void startView() {
			commOp.AllProductsProfitCommand();
			
			
		}
}
