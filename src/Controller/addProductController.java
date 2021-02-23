package Controller;

import Model.Command.CommandOptions;
import View.addProductView;
import javafx.stage.Stage;

public class addProductController {
private Stage primaryStage;
private CommandOptions commOp;

	public addProductController(Stage primaryStage, CommandOptions commOp) {
		this.primaryStage = primaryStage;
		this.commOp=commOp;
		
	}

	public void startView() {
		addProductView APV = new addProductView();
    	try {
			APV.start(primaryStage);
			
			
			
			
			commOp.AddProductToStoreCommand();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
}
