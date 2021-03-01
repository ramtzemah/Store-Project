package View;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowProductView {
	private Label label;
	private Stage primaryStage;
	private Label headAllProd;
	
		public ShowProductView(){
			primaryStage = new Stage();
		}

		public void start() {
	    	ScrollPane ThirdRoot = new ScrollPane();
	    	ThirdRoot.setPannable(true);
	    	//ThirdRoot.setContent(headAllProd);
	    	//ThirdRoot.setContent(label);

	    	VBox bv = new VBox();
	    	bv.getChildren().addAll(headAllProd,label);
	    	ThirdRoot.setContent(bv);
	        Scene ThirdScene = new Scene(ThirdRoot, 350, 100);
	       
	        
	        primaryStage.setTitle("Ram and Omer store system");
	        primaryStage.setScene(ThirdScene);
	        
	        // Set position of second window, related to primary window.
	        primaryStage.setX(500);
	        primaryStage.setY(200);
	        primaryStage.show();
	    	
			
		}

		public void setLabel(String str) {		
			label = new Label(str);
		}

		public void setHeadAllProd(String headAll) {
			headAllProd = new Label(headAll);
	    	headAllProd.setStyle("-fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);"
					+ "-fx-font-size: 25;");
	    	DropShadow ds = new DropShadow();
			ds.setRadius(5.0);
			ds.setOffsetX(3.0);
			ds.setOffsetY(3.0); 
			headAllProd.setEffect(ds);
		}

		
}
