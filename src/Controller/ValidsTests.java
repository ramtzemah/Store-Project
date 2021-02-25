package Controller;

public class ValidsTests { 

	public ValidsTests() {
	}

	public boolean cheackIfStringIsInt(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	
	
}
