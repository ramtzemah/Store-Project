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

public class sendMSG extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField MSG = new TextField();
    	Label MSGLbl = new Label("Enter Message:");
    	MSGLbl.setLabelFor(MSG);
    	MSGLbl.setMnemonicParsing(true);
        Button Show = new Button("SEND MESSAGE");
        Show.setOnAction(new EventHandler<ActionEvent>() {
	        @Override public void handle(ActionEvent e) {
	        	//here we need to write the code 
	        	// that creates a new scroll panel and shows total messages
	        	if(MSG.getText().isEmpty()) {
		        		menuView.showErrorMessage("you have to add a message");
		        	}
	        		else {
	        			menuView.showSuccsessMessage("Message - ' "
	        					+  MSG.getText() + " ' HAS BEEN SENT");
	        		}	
	        }
        });
        GridPane ThirdRoot = new GridPane();
        ThirdRoot.add(MSGLbl, 0, 0);
        ThirdRoot.add(MSG, 1, 0);
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
