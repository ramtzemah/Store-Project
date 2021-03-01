package View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class addProductView {
	private TextField Barcode;
	private TextField ProductName;
	private TextField CostPrice;
	private TextField sellPrice;
	private TextField ClientName;
	private TextField PhoneNumber;
	private Button addProdAct;
	private RadioButton wantUpdate;
	private Stage primaryStage;

	public void start() {
		primaryStage = new Stage();
		this.primaryStage = primaryStage;
		Barcode = new TextField();
		ProductName = new TextField();
		CostPrice = new TextField();
		sellPrice = new TextField();
		ClientName = new TextField();
		PhoneNumber = new TextField();
		wantUpdate = new RadioButton();
		wantUpdate.setText("I Want Updates");
		ToggleGroup group = new ToggleGroup();
		wantUpdate.setToggleGroup(group);
		// Create the Labels
		Label BarcodeLbl = new Label("serial Number:");
		Label ProductNameLbl = new Label("Product Name:");
		Label CostPriceLbl = new Label("Cost Price:");
		Label sellPriceLbl = new Label("sell Price:");
		Label ClientNameLbl = new Label("Client Name:");
		Label PhoneNumberLbl = new Label("Phone Number:");

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

		// Bind the Label to the according Field
		ClientNameLbl.setLabelFor(ClientName);
		ClientNameLbl.setMnemonicParsing(true);

		// Bind the Label to the according Field
		PhoneNumberLbl.setLabelFor(PhoneNumber);
		PhoneNumberLbl.setMnemonicParsing(true);

		GridPane ThirdRoot = new GridPane();

		ThirdRoot.add(BarcodeLbl, 0, 0);
		ThirdRoot.add(Barcode, 1, 0);
		ThirdRoot.add(ProductNameLbl, 0, 2);
		ThirdRoot.add(ProductName, 1, 2);
		ThirdRoot.add(CostPriceLbl, 0, 4);
		ThirdRoot.add(CostPrice, 1, 4);
		ThirdRoot.add(sellPriceLbl, 0, 6);
		ThirdRoot.add(sellPrice, 1, 6);
		ThirdRoot.add(ClientNameLbl, 0, 8);
		ThirdRoot.add(ClientName, 1, 8);
		ThirdRoot.add(PhoneNumberLbl, 0, 10);
		ThirdRoot.add(PhoneNumber, 1, 10);

		ThirdRoot.add(wantUpdate, 0, 12);

		addProdAct = new Button("ADD");
		addProdAct.setStyle("-fx-text-fill: #0000ff");

		ThirdRoot.add(addProdAct, 1, 18);
		Scene ThirdScene = new Scene(ThirdRoot, 400, 400);

		primaryStage.setTitle("Ram and Omer store system");
		primaryStage.setScene(ThirdScene);

		// Set position of second window, related to primary window.
		primaryStage.setX(480);
		primaryStage.setY(150);
		primaryStage.show();
	}

	public TextField getBarcode() {
		return Barcode;
	}

	public TextField getProductName() {
		return ProductName;
	}

	public TextField getCostPrice() {
		return CostPrice;
	}

	public TextField getSellPrice() {
		return sellPrice;
	}

	public TextField getClientName() {
		return ClientName;
	}

	public TextField getPhoneNumber() {
		return PhoneNumber;
	}

	public Button getAddProdAct() {
		return addProdAct;
	}

	public RadioButton getWantUpdate() {
		return wantUpdate;
	}

	public void close() {
		primaryStage.close();
	}

}
