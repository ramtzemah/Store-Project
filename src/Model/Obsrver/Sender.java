package Model.Obsrver;
//written by ram
//17/2
import Model.Client;
import Model.Obsrver.Receiver;

public interface Sender {
	String phoneNumber();
	//void sendMSG(Receiver r,Message msg);
	void sendMSG();
}
