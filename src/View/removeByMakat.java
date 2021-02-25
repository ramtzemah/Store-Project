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

public class removeByMakat{
	private TextField Barcode;
	private Button Show;
	private Stage primaryStage;
	
	public void start(){
		primaryStage = new Stage();
		Barcode = new TextField();
    	Label BarcodeLbl = new Label("Enter serial Number:");
    	BarcodeLbl.setLabelFor(Barcode);
        BarcodeLbl.setMnemonicParsing(true);
        Show = new Button("DELETE");
 
        GridPane ThirdRoot = new GridPane();
        ThirdRoot.add(BarcodeLbl, 0, 0);
        ThirdRoot.add(Barcode, 1, 0);
        ThirdRoot.add(Show, 0, 1);
        ThirdRoot.setAlignment(Pos.CENTER);
        
        Scene ThirdScene = new Scene(ThirdRoot, 350, 250);
        primaryStage.setTitle("Ram and Omer store system");
        primaryStage.setScene(ThirdScene);

        // Set position of second window, related to primary window.
        primaryStage.setX(primaryStage.getX() + 200);
        primaryStage.setY(primaryStage.getY() + 100);
        primaryStage.show();
    	
	}

	public TextField getBarcode() {
		return Barcode;
	}

	public Button getShow() {
		return Show;
	}

	public void close() {
		primaryStage.close();
	}

}
