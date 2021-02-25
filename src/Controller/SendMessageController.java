package Controller;

import Model.Command.CommandOptions;
import View.menuView;
import View.sendMSG;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class SendMessageController {

	private Stage primaryStage;
	private CommandOptions commOp;

		public SendMessageController(Stage primaryStage, CommandOptions commOp) {
			this.primaryStage = primaryStage;
			this.commOp=commOp;
		}


		public void startView() {
			sendMSG sMSG =  new sendMSG();
			sMSG.start();
		    sMSG.Show.setOnAction(new EventHandler<ActionEvent>() {
		    	
		        @Override public void handle(ActionEvent e) {

		    		if(sMSG.MSG.getText().isEmpty()) {
		    		menuView.showErrorMessage("you have to add a message");
		    		}
				else {
					String msg = sMSG.MSG.getText();
					commOp.getSendMessageCommand().setMsg(msg);;
					commOp.getSendMessageCommand().execute();
					sMSG.close();
				}
				
		        		
		        }
	        });
			
		}
}
