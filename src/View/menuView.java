package View;

import java.util.concurrent.Semaphore;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class menuView{
	public Button addProd;
	public Button showProds;
	public Button showAllProd;
	public Button RemoveLastProd;
	public Button RemoveByMAKAT;
	public Button RemoveAllProds;
	public Button showSpecProfit;
	public Button showProfit;
	public Button sendMSG;
	public Button showAllClient;
	private Stage PrimaryStage;
	private showAllProducts sap;
	private showAllClients sac;
	private sendMSGShow sms;

	public menuView(Stage primaryStage) {
		this.PrimaryStage = primaryStage;	
		sap = new showAllProducts();
		sac = new showAllClients();
		sms = new sendMSGShow(primaryStage);
	}
	
	public void start() throws Exception {
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
        addProd = new Button("add Product");
        
 		addProd.setStyle("-fx-text-fill: black;"
 				+ "-fx-border-color:black;");
 		
 		showProds = new Button("show specipic Product");
 		showProds.setStyle("-fx-text-fill: black;"
 				+ "-fx-border-color:black;");
 		
 		showAllProd = new Button("show All Products");
 		showAllProd.setStyle("-fx-text-fill: black;"
 				+ "-fx-border-color:black;");	
 		
 		RemoveLastProd = new Button("Remove Last Product");
 		RemoveLastProd.setStyle("-fx-text-fill: black;"
 				+ "-fx-border-color:black;");
 				
 		RemoveByMAKAT = new Button("Remove Product");
 		RemoveByMAKAT.setStyle("-fx-text-fill: black;"
 				+ "-fx-border-color:black;");
 			
 		RemoveAllProds = new Button("Remove All Products");
 		RemoveAllProds.setStyle("-fx-text-fill: black;"
 				+ "-fx-border-color:black;");
 		
 		showSpecProfit = new Button("show product Profit");
 		showSpecProfit.setStyle("-fx-text-fill: black;"
 				+ "-fx-border-color:black;");
 		
 		showProfit = new Button("show total Profit");
 		showProfit.setStyle("-fx-text-fill: black;"
 				+ "-fx-border-color:black;");
 			
 		sendMSG = new Button("send MSG to clients");
 		sendMSG.setStyle("-fx-text-fill: black;"
 				+ "-fx-border-color:black;");
 		
 		showAllClient = new Button("show all clients");
 		showAllClient.setStyle("-fx-text-fill: black;"
 				+ "-fx-border-color:black;");
 		
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
         //PrimaryStage.getScene().getWindow().hide();
         newWindow.show();
     }
	public void EventAddProd(EventHandler<ActionEvent> EventButton) {
		addProd.setOnAction(EventButton);
	}

	public void EventShowProds(EventHandler<ActionEvent> EventButton) {
		showProds.setOnAction(EventButton);

	}

	public void EventShowAllProd(EventHandler<ActionEvent> EventButton) {
		showAllProd.setOnAction(EventButton);

	}

	public void EventRemoveLastProd(EventHandler<ActionEvent> EventButton) {
		RemoveLastProd.setOnAction(EventButton);

	}

	public void EventRemoveByMAKAT(EventHandler<ActionEvent> EventButton) {
		RemoveByMAKAT.setOnAction(EventButton);

	}
	public void EventRemoveAllProds(EventHandler<ActionEvent> EventButton) {
		RemoveAllProds.setOnAction(EventButton);

	}
	public void EventShowSpecProfit(EventHandler<ActionEvent> EventButton) {
		showSpecProfit.setOnAction(EventButton);

	}
	public void EventShowProfit(EventHandler<ActionEvent> EventButton) {
		showProfit.setOnAction(EventButton);

	}
	public void EventSendMSG(EventHandler<ActionEvent> EventButton) {
		sendMSG.setOnAction(EventButton);

	}
	public void EventShowAllClient(EventHandler<ActionEvent> EventButton) {
		showAllClient.setOnAction(EventButton);

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

	public showAllProducts getSap() {
		return sap;
	}

	public showAllClients getSac() {
		return sac;
	}
	
	public sendMSGShow getSms() {
		return sms;
	}

	public Stage getPrimaryStage() {
		return PrimaryStage;
	}
	
	
	
}
