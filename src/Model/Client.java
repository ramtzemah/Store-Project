package Model;

import com.sun.javafx.webkit.ThemeClientImpl;

import Model.Obsrver.Message;
import Model.Obsrver.Receiver;
import Model.Obsrver.Sender;
import Model.Singleton.SuperPhone;
import View.menuView;

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
		StringBuffer str = new StringBuffer();
		str.append("Client Name " + ClientName + "\nphoneNumber " + phoneNumber + "\nwantsUpdate: ");
		if(wantsUpdate) {
			str.append("yes");
		}else str.append("no");
		return str.toString();
	}

	@Override
	public synchronized String receiveMSG(Client c,SuperPhone s, Message msg) {
//		System.out.println("-------------"+c.phoneNumber()+"-------------");
//		System.out.println("New Message Has Arrived\n" + 
//				"------------------------------------\n" + 
//				"From: "+s.getSuperPhone()+"\n" + 
//				"Date: "+msg.getTime()+"\n" + 
//				"Message: "+msg.getMsg()+"\n" + 
//				"------------------------------------\n");	
		 return sendMSG();
	}

	@Override
	public String phoneNumber() {
		return phoneNumber;
	}

	@Override
	public synchronized String sendMSG() {
		StringBuffer str =  new StringBuffer();
		str.append("\nmy name is "+ ClientName);
		str.append("\nmy phone number is "+ phoneNumber);
		str.append("\ni get the message :)\n\n");
		
		return str.toString();
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
