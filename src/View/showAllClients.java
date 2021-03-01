package View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class showAllClients{
	private Label label;
	
	public void start(){
		Stage primaryStage = new Stage();
		Label headAllCl = new Label("The Clients of the store : ");
    	headAllCl.setStyle("-fx-font-size: 18;"
    							+ "-fx-font-weight: bold;"
    							+ "-fx-text-fill: red;"
    							+ "-fx-font: 18px Tahoma;"
    							+ "-fx-underline: true;");
    	ScrollPane ThirdRoot = new ScrollPane();
    	ThirdRoot.setPannable(true);
    	ThirdRoot.setContent(headAllCl);
    	//label = new Label();
    	VBox bv = new VBox();
    	bv.getChildren().addAll(headAllCl,label);
    	ThirdRoot.setContent(bv);
    	// here we need to show details for all CLIENTS
    	
        Scene ThirdScene = new Scene(ThirdRoot, 350, 250);
        Stage ThirdWindow = new Stage();
        ThirdWindow.setTitle("Ram and Omer store system");
        ThirdWindow.setScene(ThirdScene);
        
        // Set position of second window, related to primary window.
        ThirdWindow.setX(500);
        ThirdWindow.setY(220);
        ThirdWindow.show();
	}

//	public void setLabel(String str) {
//		this.label = s;
//	}

	public void setLabel(String str) {
		label = new Label(str);
	}

	
	
	
}
