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

public class showSpecipicProducts{
public Button Show;
private TextField Barcode;
private Stage primaryStage;

	public showSpecipicProducts(Stage primaryStage) {
		this.primaryStage=primaryStage;
	}

	public void start() {
	
		Barcode = new TextField();
    	Label BarcodeLbl = new Label("Enter serial Number:");
    	BarcodeLbl.setLabelFor(Barcode);
        BarcodeLbl.setMnemonicParsing(true);
        Show = new Button("show me!");

        GridPane ThirdRoot = new GridPane();
        ThirdRoot.add(BarcodeLbl, 0, 0);
        ThirdRoot.add(Barcode, 1, 0);
        ThirdRoot.add(Show, 0, 1);
        ThirdRoot.setAlignment(Pos.CENTER);
        
        Scene ThirdScene = new Scene(ThirdRoot, 350, 250);
        //Stage primaryStage = new Stage();
        primaryStage.setTitle("Ram and Omer store system");
        primaryStage.setScene(ThirdScene);
        primaryStage.close();
        // Set position of second window, related to primary window.
        primaryStage.setX(380);
        primaryStage.setY(220);
        primaryStage.show();
    }

	public void close() {
		primaryStage.close();
	}
	public String getBarcode() {
		return Barcode.getText();
	}

	
	
	
}
