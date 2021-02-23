package View;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ChooseWayToSort extends Application{
	private int count = 0;
	private ChoiceBox<String> cb;
	private Button startAdding;
	private Scene scene;
	@Override
	public void start(Stage PrimaryStage) throws Exception {
		GridPane root = new GridPane();
		scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setWidth(600);
        PrimaryStage.setHeight(300);
        PrimaryStage.setResizable(false);
        PrimaryStage.setTitle("Ram and Omer store system");
        Label PrimaryTitle = new Label("Store management system :");
        PrimaryTitle.setStyle("-fx-font-size: 25;"
				+ "-fx-font-weight: bold;"
				+ "-fx-text-fill: blue;"
				+ "-fx-font: 25px Tahoma;"
				+ "-fx-underline: true;");
		// Create the checkBok
		cb = new ChoiceBox<String>(FXCollections.observableArrayList(
			    "add products alphabetic", "add products in oposite order", "add by adding order")
			);
		//root.setPadding(new Insets(10, 10, 10, 10)); 
	      
	      //Setting the vertical and horizontal gaps between the columns 
		root.setVgap(1); 
		root.setHgap(1); 
		root.addRow(0, PrimaryTitle);
		root.addRow(10, cb);
		cb.setOnAction(event -> {
			 startAdding = new Button("START");
			    startAdding.setStyle("-fx-text-fill: #0000ff");
			    
			    count++;
			    if(count==1) {
			    	root.addRow(10,startAdding);
			    }
	});
		root.setAlignment(Pos.CENTER);
		   
        // Add the scene to the Stage
	    PrimaryStage.setScene(scene);
        // Display the Stage
	    PrimaryStage.show(); 
	}
	public int getChoose() {
		if(cb.getValue().equalsIgnoreCase("add products alphabetic")) {
			return 0;
		}
		else if(cb.getValue().equalsIgnoreCase("add products in oposite order")) {
			return 1;
		}
		else if(cb.getValue().equalsIgnoreCase("add by adding order")) {
			return 2;
		}
		else return -1;
	}
	public void addButtonEvent(EventHandler<ActionEvent> btnEvent) {
		startAdding.setOnAction(btnEvent);
		
	}

	public void close() {
		this.scene.getWindow().hide();
	}

}
