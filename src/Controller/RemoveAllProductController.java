package Controller;

import Model.Command.CommandOptions;
import Model.Command.RemoveAllProductCommand;
import javafx.stage.Stage;

public class RemoveAllProductController {
	private Stage primaryStage;
	private CommandOptions commOp;

		public RemoveAllProductController(Stage primaryStage, CommandOptions commOp) {
			this.primaryStage = primaryStage;
			this.commOp=commOp;
		}

		public void startView() {
			commOp.getRemoveAllProductCommand().execute();
		}

}
