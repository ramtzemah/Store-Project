package Controller;

import View.ChooseWayToSort;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class SortViewController {
		private ChooseWayToSort cwts;
		private int choise;
//		private Store store;
		
			public SortViewController(Stage primaryStage) throws Exception {
				choise = -1;
				cwts = new ChooseWayToSort();
				cwts.start(primaryStage);
			

				try {
				cwts.getStartAdding().setOnAction(new EventHandler<ActionEvent>() {
		 			
	    	        @Override public void handle(ActionEvent e) {

	    	        
	    	        	choise = cwts.getChoose();

	    	        	
	    	        }
	    		});
				}catch (Exception e) {
					
				}

				
				
			}

}
