package Model.Memento;

import java.util.Map;
import java.util.TreeMap;

import Model.Product;

public class Memento {
	private TreeMap<String, Product> productMapMemento;

	public Memento(Map<String, Product> productMap) {
		productMapMemento = new TreeMap<String, Product>();
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			productMapMemento.put(entry.getKey(),entry.getValue());
		}
	}

	public TreeMap<String, Product> getMap() {
		return productMapMemento;
	}
}
