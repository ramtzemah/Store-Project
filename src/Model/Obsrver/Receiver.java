package Model.Obsrver;
//written by ram
//17/2

import Model.Client;
import Model.Obsrver.Sender;
import Model.Singleton.SuperPhone;

public interface Receiver {
	String phoneNumber();
	void receiveMSG(Client c,SuperPhone s,Message msg);
}
