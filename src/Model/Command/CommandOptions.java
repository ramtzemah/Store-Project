package Model.Command;

public class CommandOptions {

	private Command addProductToStoreCommand;
	private Command AllProductsProfitCommand;
	private Command ChoosenProductProfitCommand;
	private Command MementoCommand;
	private Command RemoveAllProductCommand;
	private Command RemoveChoosenProductCommand;
	private Command SendMessageCommand;
	private Command ShowAllClientCommand;
	private Command showAllProductCommand;
	private Command showChoosenProductCommand;

	public CommandOptions(Command addProductToStoreCommand,
	Command AllProductsProfitCommand,
	Command ChoosenProductProfitCommand,
	Command MementoCommand,
	Command RemoveAllProductCommand,
	Command RemoveChoosenProductCommand,
	Command SendMessageCommand,
	Command ShowAllClientCommand,
	Command showAllProductCommand,
	Command showChoosenProductCommand) {
		this.addProductToStoreCommand=addProductToStoreCommand;
		this.AllProductsProfitCommand =AllProductsProfitCommand;
		this.ChoosenProductProfitCommand=ChoosenProductProfitCommand;
		this.MementoCommand= MementoCommand;
		this.RemoveAllProductCommand = RemoveAllProductCommand;
		this.RemoveChoosenProductCommand=RemoveChoosenProductCommand;
		this.SendMessageCommand=SendMessageCommand;
		this.ShowAllClientCommand=ShowAllClientCommand;
		this.showAllProductCommand=showAllProductCommand;
		this.showChoosenProductCommand=showChoosenProductCommand;
	}

	public void AddProductToStoreCommand() {
		addProductToStoreCommand.execute();
	}

	public void AllProductsProfitCommand() {
		AllProductsProfitCommand.execute();
	}

	public void ChoosenProductProfitCommand() {
		ChoosenProductProfitCommand.execute();
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
		ShowAllClientCommand.execute();
	}

	public void ShowAllProductCommand() {
		showAllProductCommand.execute();
	}

	public void ShowChoosenProductCommand() {
		showChoosenProductCommand.execute();
	}
	
	
}
