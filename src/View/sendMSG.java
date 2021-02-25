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

public class sendMSG{
public  Button Show;
public TextField MSG;
private Stage primaryStage;

	public void start(){
		primaryStage = new Stage();
		this.primaryStage=primaryStage;
		MSG = new TextField();
    	Label MSGLbl = new Label("Enter Message:");
    	MSGLbl.setLabelFor(MSG);
    	MSGLbl.setMnemonicParsing(true);
        Show = new Button("SEND MESSAGE");
    
        GridPane ThirdRoot = new GridPane();
        ThirdRoot.add(MSGLbl, 0, 0);
        ThirdRoot.add(MSG, 1, 0);
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

	public void close() {
		primaryStage.close();
	}

}
