package View;
//writen by omer
//16.2.2021 , 15:50

import Model.Product;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class addProductView extends Application{

//	 public static void main(String[] args)
//	    {
//	        Application.launch(args);
//	        
//	    }
	 
	@Override
	public void start(Stage stage) throws Exception {
		// Create the Text Fields
		TextField Barcode = new TextField();
        TextField ProductName = new TextField();
        TextField CostPrice = new TextField();
        TextField sellPrice = new TextField();
        
        // Create the Labels
        Label BarcodeLbl = new Label("serial Number:");
        Label ProductNameLbl = new Label("Product Name:");
        Label CostPriceLbl = new Label("Cost Price:");
        Label sellPriceLbl = new Label("sell Price:");
        
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
        
        // Create the GridPane
        GridPane root = new GridPane();
        // Add the Labels and Fields to the GridPane
        root.addRow(0, BarcodeLbl, Barcode);
        root.addRow(1,ProductNameLbl , ProductName);
        root.addRow(2, CostPriceLbl, CostPrice);
        root.addRow(3, sellPriceLbl, sellPrice);
        // Set the Size of the GridPane
        root.setMinSize(400, 400);
         
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
    
        //add product button
        
        Button addPro = new Button("ADD");
        root.addRow(4, addPro);
        
        //next row maybe belongs to controller , talk with rahamim
        //if(!(Barcode.getText().trim().isEmpty())&&(Barcode.getText() == null)) {
        	//EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
                //public void handle(ActionEvent e) 
                //{ 
                   // create new produce with constructor
                	
                		//String bc = Barcode.getText();
                    //	String Pn = ProductName.getText();
                   // 	int Cp = (Integer.parseInt(CostPrice.getText())); 
                 //   	int Sp = (Integer.parseInt(sellPrice.getText()));
               //     	Product newProd = new Product(bc, Pn,Cp, Sp);
             //   }
           // };
            // when button is pressed 
         //   addPro.setOnAction(event); 
       // }
        
        // Create the Scene
        Scene scene = new Scene(root);
        // Add the scene to the Stage
        stage.setScene(scene);
        // Display the Stage
        stage.show();       
	}

}
