package View;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class sendMSGShow {
private Label label;
private Stage primaryStage;
	
	public sendMSGShow(Stage primaryStage) {
		this.primaryStage=primaryStage;
	}

	public void start() {
		Label headAllProd = new Label("The people who get the messege : ");
    	headAllProd.setStyle("-fx-font-size: 18;"
    							+ "-fx-font-weight: bold;"
    							+ "-fx-text-fill: red;"
    							+ "-fx-font: 18px Tahoma;"
    							+ "-fx-underline: true;");
    	ScrollPane ThirdRoot = new ScrollPane();
    	ThirdRoot.setPannable(true);
    	//ThirdRoot.setContent(headAllProd);
    	//ThirdRoot.setContent(label);
    	VBox bv = new VBox();
    	bv.getChildren().addAll(headAllProd,label);
    	ThirdRoot.setContent(bv);
        Scene ThirdScene = new Scene(ThirdRoot, 350, 250);
       
        primaryStage.setTitle("Ram and Omer store system");
        primaryStage.setScene(ThirdScene);
        
        // Set position of second window, related to primary window.
        primaryStage.setX(primaryStage.getX() + 200);
        primaryStage.setY(primaryStage.getY() + 100);
        primaryStage.show();
    	
		
	}

	public void setLabel(String str) {		
		label = new Label(str);
	}

	
}
