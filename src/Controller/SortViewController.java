package Controller;

import View.ChooseWayToSort;
import View.menuView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class SortViewController {
		private ChooseWayToSort cwts;
		private int choise=-1;
		
			public SortViewController(Stage primaryStage) throws Exception {
				choise = -1;
				cwts = new ChooseWayToSort();
				cwts.start(primaryStage);
			
		
				try {
					
				cwts.getStartAdding().setOnAction(new EventHandler<ActionEvent>() {
		 			
	    	        @Override public void handle(ActionEvent e) {
	    	       
	    	    		try {
	    	    		 	choise = cwts.getChoose();
						} catch (Exception e1) {
							e1.printStackTrace();
						}	
	    	    		menuView view = new menuView(primaryStage);
	    				try {
							Controller controller = new Controller(primaryStage,view,choise);
							cwts.close();
						} catch (Exception e1) {
							e1.printStackTrace();
						}
	    	        	
	    	        }
	    		});
				
	    	

				}catch (Exception e) {
					
				}

		
				
			}

}
