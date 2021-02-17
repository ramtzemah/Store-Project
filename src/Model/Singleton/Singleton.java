package Model.Singleton;
//written by ram
//17/2
import Model.Client;
import Model.Obsrver.Message;
import Model.Obsrver.Receiver;
import Model.Obsrver.Sender;

public class Singleton implements Receiver
{ 
    private static Singleton single_instance = null; 
  
   // public Sender st;
    public SuperPhone s; 
  
    private Singleton() 
    { 
    	s = new SuperPhone(); 
    } 
  
    public static Singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
    }

	@Override
	public String phoneNumber() {
		return s.getSuperPhone();
	}

	@Override
	public void receiveMSG(Client c,SuperPhone s, Message msg) {
		c.receiveMSG(c,s, msg);
	}



} 