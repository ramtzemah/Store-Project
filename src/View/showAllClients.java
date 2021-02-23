package View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class showAllClients extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label headAllCl = new Label("The Clients of the store : ");
    	headAllCl.setStyle("-fx-font-size: 18;"
    							+ "-fx-font-weight: bold;"
    							+ "-fx-text-fill: red;"
    							+ "-fx-font: 18px Tahoma;"
    							+ "-fx-underline: true;");
    	ScrollPane ThirdRoot = new ScrollPane();
    	ThirdRoot.setPannable(true);
    	ThirdRoot.setContent(headAllCl);
    	// here we need to show details for all CLIENTS
    	
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
