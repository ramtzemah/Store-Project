package Model.Command;

import Model.Store;

public class CommandOptions {

	private addProductToStoreCommand apts;
	private Command AllProductsProfitCommand;
	private ChoosenProductProfitCommand ccp;
	private Command MementoCommand;
	private Command RemoveAllProductCommand;
	private RemoveChoosenProductCommand rcp;
	private SendMessageCommand sMSG;
	private ShowAllClientCommand sak;
	private Command showAllProductCommand;
	private showChoosenProductCommand scp;
	private Store store;
	public CommandOptions(addProductToStoreCommand apts,
	Command AllProductsProfitCommand,
	ChoosenProductProfitCommand ccp,
	Command MementoCommand,
	Command RemoveAllProductCommand,
	RemoveChoosenProductCommand rcp,
	SendMessageCommand sMSG,
	ShowAllClientCommand sak,
	Command showAllProductCommand,
	showChoosenProductCommand scp,
//	Command showChoosenProductCommand,
	Store store) {
		this.apts=apts;
		this.AllProductsProfitCommand =AllProductsProfitCommand;
		this.ccp=ccp;
		this.MementoCommand= MementoCommand;
		this.RemoveAllProductCommand = RemoveAllProductCommand;
		this.rcp=rcp;
		this.sMSG=sMSG;
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
		apts.execute();
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
		rcp.execute();
	}

	public  void SendMessageCommand() {
		sMSG.execute();
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

	public addProductToStoreCommand getAddProductToStoreCommand() {
		return apts;
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

	public RemoveChoosenProductCommand getRemoveChoosenProductCommand() {
		return rcp;
	}

	public SendMessageCommand getSendMessageCommand() {
		return sMSG;
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
