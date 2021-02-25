package Model.Obsrver;
//written by ram
//17/2

import Model.Client;
import Model.Obsrver.Sender;
import Model.Singleton.SuperPhone;

public interface Receiver {
	String phoneNumber();
	//void sendMSG(Receiver r,Message msg);
	String sendMSG();
}
