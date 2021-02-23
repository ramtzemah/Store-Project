package View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class addProductView extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField Barcode = new TextField();
        TextField ProductName = new TextField();
        TextField CostPrice = new TextField();
        TextField sellPrice = new TextField();
        TextField ClientName = new TextField();
        TextField PhoneNumber = new TextField();
        RadioButton wantUpdate = new RadioButton();
        wantUpdate.setText("I Want Updates");
     	RadioButton DontWantUpdate = new RadioButton();
     	DontWantUpdate.setText("I DONT Want Updates");
     	ToggleGroup group = new ToggleGroup();
     	wantUpdate.setToggleGroup(group);
     	DontWantUpdate.setToggleGroup(group);
        // Create the Labels
        Label BarcodeLbl = new Label("serial Number:");
        Label ProductNameLbl = new Label("Product Name:");
        Label CostPriceLbl = new Label("Cost Price:");
        Label sellPriceLbl = new Label("sell Price:");
        Label ClientNameLbl = new Label("Client Name:");
        Label PhoneNumberLbl = new Label("Phone Number:");
        
        // Bind the Label to the according Field
        BarcodeLbl.setLabelFor(Barcode);
        BarcodeLbl.setMnemonicParsing(true);
        
        // Bind the Label to the according Field
        ProductNameLbl.setLabelFor(ProductName);
        ProductNameLbl.setMnemonicParsing(true);
         
        // Bind the Label to the according Field
        CostPriceLbl.setLabelFor(CostPrice);
        CostPriceLbl.setMnemonicParsing(true);
        
        // Bind the Label to the according Field
        sellPriceLbl.setLabelFor(sellPrice);
        sellPriceLbl.setMnemonicParsing(true);

        // Bind the Label to the according Field
        ClientNameLbl.setLabelFor(ClientName);
        ClientNameLbl.setMnemonicParsing(true);
        
        // Bind the Label to the according Field
        PhoneNumberLbl.setLabelFor(PhoneNumber);
        PhoneNumberLbl.setMnemonicParsing(true);
        
        
        GridPane ThirdRoot = new GridPane();
        
        ThirdRoot.add(BarcodeLbl, 0, 0);
        ThirdRoot.add(Barcode, 1, 0);
        ThirdRoot.add(ProductNameLbl, 0, 2);
        ThirdRoot.add(ProductName, 1, 2);    	            
        ThirdRoot.add(CostPriceLbl, 0, 4);
        ThirdRoot.add(CostPrice, 1, 4);	    	           
        ThirdRoot.add(sellPriceLbl, 0, 6);
        ThirdRoot.add(sellPrice, 1, 6);
        ThirdRoot.add(ClientNameLbl, 0, 8);
        ThirdRoot.add(ClientName, 1, 8);
        ThirdRoot.add(PhoneNumberLbl, 0, 10);
        ThirdRoot.add(PhoneNumber, 1, 10);
        
        ThirdRoot.add(wantUpdate, 0, 12);
        ThirdRoot.add(DontWantUpdate, 1, 12);
        
        Button addProdAct = new Button("ADD");
        addProdAct.setStyle("-fx-text-fill: #0000ff");
        
//        addProdAct.setOnAction(new EventHandler<ActionEvent>() {
//	        @Override public void handle(ActionEvent e) {
//	        	
////	        	if(Barcode.getText().isEmpty()) {
////	        		showErrorMessage("you have to insert a barcode!");
////	        	}
////	        	else {
////	        		//add product to list of product
////	        	}
//	        }
//        });
        
        ThirdRoot.add(addProdAct, 1, 18);
        Scene ThirdScene = new Scene(ThirdRoot, 400, 400);
        
        // New window (Stage)
        Stage ThirdWindow = new Stage();
        ThirdWindow.setTitle("Ram and Omer store system");
        ThirdWindow.setScene(ThirdScene);

        // Set position of second window, related to primary window.
        ThirdWindow.setX(primaryStage.getX() + 200);
        ThirdWindow.setY(primaryStage.getY() + 100);
        ThirdWindow.show();
	}
	
}
