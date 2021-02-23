package View;

import Model.Store;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class showTotalProfit{
	private Store store;


	public showTotalProfit(Store store) throws Exception {
		this.store=store;
		start();
	}

	public void start() throws Exception {
			Stage primaryStage = new Stage();
			GridPane ThirdRoot = new GridPane();
	       
	        Scene ThirdScene = new Scene(ThirdRoot, 350, 250);
	        Stage ThirdWindow = new Stage();
	        ThirdWindow.setTitle("Ram and Omer store system");
	        ThirdWindow.setScene(ThirdScene);
	        
	        // Set position of second window, related to primary window.
	        ThirdWindow.setX(primaryStage.getX() + 200);
	        ThirdWindow.setY(primaryStage.getY() + 100);
	        ThirdWindow.show();
	}


	
}
