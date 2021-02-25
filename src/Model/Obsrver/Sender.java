package Model.Obsrver;
//written by ram
//17/2
import Model.Client;
import Model.Obsrver.Receiver;
import Model.Singleton.SuperPhone;

public interface Sender {
	String phoneNumber();
	String receiveMSG(Client c,SuperPhone s,Message msg);
}
