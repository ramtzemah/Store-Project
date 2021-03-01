package Controller;

import com.sun.javafx.webkit.ThemeClientImpl;

import Model.Command.CommandOptions;
import View.addProductView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class addProductController {
private CommandOptions commOp;
private int check;
private int helper;

	public addProductController(CommandOptions commOp) {
		this.commOp=commOp;	
	}

	public void startView() {
		
		addProductView APV = new addProductView();
    	try {
    		
			APV.start();
			APV.getAddProdAct().setOnAction(new EventHandler<ActionEvent>() {
				
	        @Override public void handle(ActionEvent e) {
	        	check = 0;
	        	helper = 0;
	        	ValidsTests vt = new ValidsTests();
	        	if(APV.getBarcode().getText().isEmpty()) {
	        		showErrorMessage("you have to insert a barcode!");
	        	}
	        	else {
	        		if(!vt.checkBarcode(APV.getBarcode().getText())) {
	        			showErrorMessage("wrong barcode input");
	        		}
	        		else {
	        			commOp.getAddProductToStoreCommand().setBarcode(APV.getBarcode().getText());
	        		}
	        	}
	        		
	        	if(APV.getClientName().getText().isEmpty()) {
	        		commOp.getAddProductToStoreCommand().setClientName(" ");
	        	}
	        	else {
	        		if(!vt.checkIfString(APV.getClientName().getText())) {
	        			showErrorMessage("client name must contain letters only");
	        		}
	        		else {
	        			commOp.getAddProductToStoreCommand().setClientName(APV.getClientName().getText());
	        		}
	        	}
	        		
	        	
	        	if(APV.getPhoneNumber().getText().isEmpty()) {
	        		commOp.getAddProductToStoreCommand().setClientPhoneNumber(" ");
	        	}
	        	else {
	        		if(!vt.checkPhone(APV.getPhoneNumber().getText())) {
	        			showErrorMessage("phone must be in format : ***-*******");
	        		}
	        		else {
		        		check++;
		        		commOp.getAddProductToStoreCommand().setClientPhoneNumber(APV.getPhoneNumber().getText());
	        		}
    		
	        	}
	        	if(APV.getProductName().getText().isEmpty()) {
	        		commOp.getAddProductToStoreCommand().setProductName(" ");
	        	}
	        	else {
	        		if(!vt.checkIfString(APV.getProductName().getText())) {
	        			showErrorMessage("product name must conatain letters only");
	        		}
	        		else {
		        		commOp.getAddProductToStoreCommand().setProductName(APV.getProductName().getText());
	        		}
	        	}
	        	
	        	if(APV.getCostPrice().getText().isEmpty()) {
	        		commOp.getAddProductToStoreCommand().setCostPrice(-1);
	        	}
	        	else {
	        		if(!vt.checkIfStringIsInt(APV.getCostPrice().getText())) {
	        			showErrorMessage("wrong input in cose price");
	        		}
	        		else {
		        		commOp.getAddProductToStoreCommand().setCostPrice(Integer.parseInt(APV.getCostPrice().getText()));
	        		}
	        	}
	        
	        	if(APV.getSellPrice().getText().isEmpty()) {
	        		commOp.getAddProductToStoreCommand().setSellingPrice(-1);
	        	}
	        	else {
	        		if(!vt.checkIfStringIsInt(APV.getSellPrice().getText())) {
	        			showErrorMessage("wrong input in sell price");
	        		}
	        		else {
		        		commOp.getAddProductToStoreCommand().setSellingPrice(Integer.parseInt(APV.getSellPrice().getText()));
	        		}
	        	}
	        	
	        	if(APV.getWantUpdate().isSelected()) {
	        		if(check==0) {
	        		showErrorMessage("you must put phone number if you want get message");
	        		helper++;
	        		}else
		        		commOp.getAddProductToStoreCommand().setWantsGetMSG(true);
	        	}
	        	else 
	        		commOp.getAddProductToStoreCommand().setWantsGetMSG(false);
	        	if(helper!=1) {
	        	commOp.getAddProductToStoreCommand().execute();
	        	APV.close();
	        	}
	        }
        });
			
			
			
			commOp.AddProductToStoreCommand();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
	
	public static void showErrorMessage(String errorMessage) {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setContentText(errorMessage);
		alert.show();
	}
}