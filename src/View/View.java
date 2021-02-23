package View;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class View extends Application{
private int count = 0;
	 public static void main(String[] args)
	    {
	        Application.launch(args);
	        
	    }
	 
	@Override
	public void start(Stage PrimaryStage) throws Exception {
		GridPane root = new GridPane();
        Scene scene = new Scene(root);
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
		ChoiceBox<String> cb = new ChoiceBox<String>(FXCollections.observableArrayList(
			    "add products alphabetic", "add products in oposite order", "add by adding order")
			);
		//root.setPadding(new Insets(10, 10, 10, 10)); 
	      
	      //Setting the vertical and horizontal gaps between the columns 
		root.setVgap(1); 
		root.setHgap(1); 
		root.addRow(0, PrimaryTitle);
		root.addRow(10, cb);
		
		cb.setOnAction(event -> {
			 Button startAdding = new Button("START");
			    startAdding.setStyle("-fx-text-fill: #0000ff");
			    
			    count++;
			    if(count==1) {
			    	root.addRow(10,startAdding);
			    }
			    startAdding.setOnAction(new EventHandler<ActionEvent>() {
			        @Override public void handle(ActionEvent e) {
			        	//the way that the user wants to order will be saved as string (choise)
			        	//String choise = (String) cb.getValue();

			            GridPane seconderyRoot = new GridPane();
			            seconderyRoot.setVgap(3); 
			            seconderyRoot.setHgap(3); 
			            Label SeconderyTitle = new Label("MENU:");
			            SeconderyTitle.setStyle("-fx-font-size: 22;"
			    				+ "-fx-font-weight: bold;"
			    				+ "-fx-background-color: rgba(0, 60, 136, 0.5);"
			    				+ "-fx-border-color: rgba(0, 60, 136, 0.8);"
			    				+ "-fx-font: 22px Tahoma;"
			    				+ "-fx-underline: true;");
		
			            //create buttons
			            Button addProd = new Button("add Product");
			    		addProd.setStyle("-fx-text-fill: black;"
			    				+ "-fx-border-color:black;");
			    		addProd.setOnAction(new EventHandler<ActionEvent>() {
			    	        @Override public void handle(ActionEvent e) {
			    	        	addProductView APV = new addProductView();
			    	        	try {
									APV.start(PrimaryStage);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
			    	            
			    	        }
			    		});
			    		Button showProds = new Button("show specipic Product");
			    		showProds.setStyle("-fx-text-fill: black;"
			    				+ "-fx-border-color:black;");
			    		showProds.setOnAction(new EventHandler<ActionEvent>() {
					        @Override public void handle(ActionEvent e) {
					        	showSpecipicProducts SSP = new showSpecipicProducts();
					        	try {
									SSP.start(PrimaryStage);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
					        }
			    		});
			    		
			    		
			    		Button showAllProd = new Button("show All Products");
			    		showAllProd.setStyle("-fx-text-fill: black;"
			    				+ "-fx-border-color:black;");
			    		

			    		showAllProd.setOnAction(new EventHandler<ActionEvent>() {
			    		    @Override public void handle(ActionEvent e) {
			    		    	showAllProducts SAP = new showAllProducts();
			    		    	try {
									SAP.start(PrimaryStage);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
			    		    }
			    		});
			    		
			    		
			    		Button RemoveLastProd = new Button("Remove Last Product");
			    		RemoveLastProd.setStyle("-fx-text-fill: black;"
			    				+ "-fx-border-color:black;");
			    		
			    		RemoveLastProd.setOnAction(new EventHandler<ActionEvent>() {
					        @Override public void handle(ActionEvent e) {
					        	removeLastProd RLP = new removeLastProd();
					        	try {
									RLP.start(PrimaryStage);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
					        }
	    	            });
			    		
			    		Button RemoveByMAKAT = new Button("Remove Product");
			    		RemoveByMAKAT.setStyle("-fx-text-fill: black;"
			    				+ "-fx-border-color:black;");
			    		RemoveByMAKAT.setOnAction(new EventHandler<ActionEvent>() {
					        @Override public void handle(ActionEvent e) {
					        	removeByMakat RBM = new removeByMakat();
					        	try {
									RBM.start(PrimaryStage);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
					        }
	    	            });
			    		
			    		Button RemoveAllProds = new Button("Remove All Products");
			    		RemoveAllProds.setStyle("-fx-text-fill: black;"
			    				+ "-fx-border-color:black;");
			    		RemoveAllProds.setOnAction(new EventHandler<ActionEvent>() {
					        @Override public void handle(ActionEvent e) {
					        	removeAllProducts RAP = new removeAllProducts();
					        	try {
									RAP.start(PrimaryStage);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
					        }
			    		});
			    		Button showSpecProfit = new Button("show product Profit");
			    		showSpecProfit.setStyle("-fx-text-fill: black;"
			    				+ "-fx-border-color:black;");
			    		showSpecProfit.setOnAction(new EventHandler<ActionEvent>() {
					        @Override public void handle(ActionEvent e) {
					        	showProfitByMakat SPBM = new showProfitByMakat();
					        	try {
									SPBM.start(PrimaryStage);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
					        }
	    	            });
			    		
			    		Button showProfit = new Button("show total Profit");
			    		showProfit.setStyle("-fx-text-fill: black;"
			    				+ "-fx-border-color:black;");
			    		showProfit.setOnAction(new EventHandler<ActionEvent>() {
					        @Override public void handle(ActionEvent e) {
					        	showTotalProfit STP = new showTotalProfit();
					        	try {
									STP.start(PrimaryStage);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
					        }
			    		});
			    		
			    		Button sendMSG = new Button("send MSG to clients");
			    		sendMSG.setStyle("-fx-text-fill: black;"
			    				+ "-fx-border-color:black;");
			    		sendMSG.setOnAction(new EventHandler<ActionEvent>() {
					        @Override public void handle(ActionEvent e) {
					        	sendMSG SMSG = new sendMSG();
					        	try {
									SMSG.start(PrimaryStage);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
			                }
			    		});
			    		
			    		Button showAllClient = new Button("show all clients");
			    		showAllClient.setStyle("-fx-text-fill: black;"
			    				+ "-fx-border-color:black;");
			    		showAllClient.setOnAction(new EventHandler<ActionEvent>() {
					        @Override public void handle(ActionEvent e) {
					        	showAllClients SAC = new showAllClients();
					        	try {
									SAC.start(PrimaryStage);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
					        }
	    	            });
			    		
			    		seconderyRoot.add(SeconderyTitle,4,0);
			    		seconderyRoot.add(addProd, 0, 2);
			    		seconderyRoot.add(showProds, 6, 2);
			    		seconderyRoot.add(showAllProd, 0, 4);
			    		seconderyRoot.add(RemoveLastProd, 6, 4);
			    		seconderyRoot.add(RemoveByMAKAT,  0, 6);
			    		seconderyRoot.add(RemoveAllProds, 6, 6 );
			    		seconderyRoot.add(showSpecProfit, 0, 8);
			    		seconderyRoot.add(showProfit, 6, 8);
			    		seconderyRoot.add(sendMSG, 0, 10);
			    		seconderyRoot.add(showAllClient, 6, 10);
			    		//seconderyRoot.add(Undo, 4, 41);
			    		
			    		
		                Scene secondScene = new Scene(seconderyRoot, 450, 300);
		 
		                // New window (Stage)
		                Stage newWindow = new Stage();
		                newWindow.setTitle("Ram and Omer store system");
		                newWindow.setScene(secondScene);
		 
		                // Set position of second window, related to primary window.
		                newWindow.setX(PrimaryStage.getX() + 200);
		                newWindow.setY(PrimaryStage.getY() + 100);
		                PrimaryStage.getScene().getWindow().hide();
		                newWindow.show();
			        }
			    });
		});
		root.setAlignment(Pos.CENTER);
	   
        // Add the scene to the Stage
	    PrimaryStage.setScene(scene);
        // Display the Stage
	    PrimaryStage.show();  
	}
	public static void showErrorMessage(String errorMessage) {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setContentText(errorMessage);
		alert.show();
	}
	public static void showSuccsessMessage(String succsessMessage) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setContentText(succsessMessage);
		alert.show();
	}


	
}
