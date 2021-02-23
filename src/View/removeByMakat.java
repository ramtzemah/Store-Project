package View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class removeByMakat extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField Barcode = new TextField();
    	Label BarcodeLbl = new Label("Enter serial Number:");
    	BarcodeLbl.setLabelFor(Barcode);
        BarcodeLbl.setMnemonicParsing(true);
        Button Show = new Button("DELETE");
        Show.setOnAction(new EventHandler<ActionEvent>() {
	        @Override public void handle(ActionEvent e) {
	        	// here we should put code that SEARCH FINDS & DELETE PRODUCT
	        	//BY PRODUCT ID
	        	//if(remove suceed)
	        	//showSuccsessMessage("Product has been removed");
	        	//if(remove failed)
	        	//showErrorMessage("remove has been failed , try another barcode");
	        }
        });
        GridPane ThirdRoot = new GridPane();
        ThirdRoot.add(BarcodeLbl, 0, 0);
        ThirdRoot.add(Barcode, 1, 0);
        ThirdRoot.add(Show, 0, 1);
        ThirdRoot.setAlignment(Pos.CENTER);
        
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
