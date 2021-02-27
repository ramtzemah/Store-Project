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
	}	
}
