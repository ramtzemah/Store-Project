package Model.Command;

import Model.Store;

public class CommandOptions {

	private Command addProductToStoreCommand;
	private Command AllProductsProfitCommand;
	private ChoosenProductProfitCommand ccp;
	private Command MementoCommand;
	private Command RemoveAllProductCommand;
	private Command RemoveChoosenProductCommand;
	private Command SendMessageCommand;
	private ShowAllClientCommand sak;
	private Command showAllProductCommand;
	private showChoosenProductCommand scp;
	private Store store;
	public CommandOptions(Command addProductToStoreCommand,
	Command AllProductsProfitCommand,
	ChoosenProductProfitCommand ccp,
	Command MementoCommand,
	Command RemoveAllProductCommand,
	Command RemoveChoosenProductCommand,
	Command SendMessageCommand,
	ShowAllClientCommand sak,
	Command showAllProductCommand,
	showChoosenProductCommand scp,
//	Command showChoosenProductCommand,
	Store store) {
		this.addProductToStoreCommand=addProductToStoreCommand;
		this.AllProductsProfitCommand =AllProductsProfitCommand;
		this.ccp=ccp;
		this.MementoCommand= MementoCommand;
		this.RemoveAllProductCommand = RemoveAllProductCommand;
		this.RemoveChoosenProductCommand=RemoveChoosenProductCommand;
		this.SendMessageCommand=SendMessageCommand;
		this.sak=sak;
		this.showAllProductCommand=showAllProductCommand;
		this.scp=scp;
		this.store=store;
		//aptt = new showChoosenProductCommand(store);
//		AllProductsProfitCommand;
//		ChoosenProductProfitCommand;
//		MementoCommand;
//		RemoveAllProductCommand;
//		RemoveChoosenProductCommand;
//		SendMessageCommand;
//		ShowAllClientCommand;
//		showAllProductCommand;
		//ccp = new ChoosenProductProfitCommand(store);
		 //scp = new showChoosenProductCommand(store);
	}

	public void AddProductToStoreCommand() {
		addProductToStoreCommand.execute();
	}

	public void AllProductsProfitCommand() {
		AllProductsProfitCommand.execute();
	}

	public void ChoosenProductProfitCommand() {
		ccp.execute();
	}

	public void MementoCommand() {
		MementoCommand.execute();
	}

	public void RemoveAllProductCommand() {
		RemoveAllProductCommand.execute();
	}

	public void RemoveChoosenProductCommand() {
		RemoveChoosenProductCommand.execute();
	}

	public  void SendMessageCommand() {
		SendMessageCommand.execute();
	}

	public void ShowAllClientCommand() {
		sak.execute();
	}

	public void ShowAllProductCommand() {
		showAllProductCommand.execute();
	}

	public void ShowChoosenProductCommand() {
		scp.execute();
	}

	public Command getAddProductToStoreCommand() {
		return addProductToStoreCommand;
	}

	public Command getAllProductsProfitCommand() {
		return AllProductsProfitCommand;
	}

	public ChoosenProductProfitCommand getChoosenProductProfitCommand() {
		return ccp;
	}

	public Command getMementoCommand() {
		return MementoCommand;
	}

	public Command getRemoveAllProductCommand() {
		return RemoveAllProductCommand;
	}

	public Command getRemoveChoosenProductCommand() {
		return RemoveChoosenProductCommand;
	}

	public Command getSendMessageCommand() {
		return SendMessageCommand;
	}

	public ShowAllClientCommand getsak() {
		return sak;
	}

	public Command getShowAllProductCommand() {
		return showAllProductCommand;
	}

	public showChoosenProductCommand getScp() {
		return scp;
	}



	
	
	
	
	
}
