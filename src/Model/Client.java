package Model;

import Model.Obsrver.Message;
import Model.Obsrver.Receiver;
import Model.Obsrver.Sender;
import Model.Singleton.SuperPhone;

//writen by omer
//16.2.2021
//edit by ram

public class Client implements Sender, Receiver {
	String ClientName;
	String phoneNumber;
	boolean wantsUpdate;
	
	public Client(String ClientName, String phoneNumber, boolean wantsUpdate) {
		this.ClientName = ClientName;
		this.phoneNumber = phoneNumber;
		this.wantsUpdate = wantsUpdate;
	}

	@Override
	public String toString() {
		return "Client Name " + ClientName + "\nphoneNumber " + phoneNumber + "\nwantsUpdate " + wantsUpdate;
	}

	@Override
	public void receiveMSG(Client c,SuperPhone s, Message msg) {
		System.out.println("-------------"+c.phoneNumber()+"-------------");
		System.out.println("New Message Has Arrived\n" + 
				"------------------------------------\n" + 
				"From: "+s.getSuperPhone()+"\n" + 
				"Date: "+msg.getTime()+"\n" + 
				"Message: "+msg.getMsg()+"\n" + 
				"------------------------------------\n");	
		sendMSG();
	}

	@Override
	public String phoneNumber() {
		return phoneNumber;
	}

	@Override
	public void sendMSG() {
		System.out.println("my name is "+ ClientName);
		System.out.println("my phone number is "+ phoneNumber);
		System.out.println("i get the message :)\n\n");
	}

	public String getClientName() {
		return ClientName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public boolean isWantsUpdate() {
		return wantsUpdate;
	}
	
	
	
	
	
	
	
}
