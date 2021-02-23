package Model.Obsrver;

import Model.Client;

public interface Observable {
		void addObserver(Client c);
		void deleteObserver(Client c);
		void notifyObservers(String mag);	
}
