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

public class showProfitByMakat{
public  Button Show;
public TextField Barcode;
private Stage primaryStage;

	public showProfitByMakat(Stage primaryStage) {
	this.primaryStage=primaryStage;
	}
	
	public void start(){
		Barcode = new TextField();
    	Label BarcodeLbl = new Label("Enter serial Number:");
    	BarcodeLbl.setLabelFor(Barcode);
        BarcodeLbl.setMnemonicParsing(true);
        Show = new Button("SEARCH");

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
	public String getBarcode() {
		return Barcode.getText();
	}
	
	public void close() {
		primaryStage.close();
	}
//	
//	public void EventShowByBarcode(EventHandler<ActionEvent> EventButton) {
//		Show.setOnAction(EventButton);
//
//	}

	
}
