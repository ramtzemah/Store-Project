package Controller;

import javafx.scene.control.Alert;

public class ValidsTests { 

	public ValidsTests() {
	}
	public boolean checkIfString(String str) {
		try {
			for (int i = 0; i < str.length(); i++) {
				if(!java.lang.Character.isLetter(str.charAt(i))) {
					return false;
				}
			}
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	public boolean checkIfStringIsInt(String str) {
		try {
			for (int i = 0; i < str.length(); i++) {
				if(!java.lang.Character.isDigit(str.charAt(i))) {
					return false;
				}
			}
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	public boolean checkBarcode(String str) {
		try {
			for (int i = 0; i < str.length(); i++) {
				if(!java.lang.Character.isLetter(str.charAt(i))&&!java.lang.Character.isDigit(str.charAt(i))) {
					return false;
				}
			}
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	public boolean checkPhone(String str) {
		try {
			int makaf=3;
			if(str.length()!=11) {
				return false;
			}
			else if(str.charAt(3)!='-') {
				return false;
			}
			else {
				for (int i = 0; i < str.length(); i++) {
					if(i!=3) {
						if(!java.lang.Character.isDigit(str.charAt(i))){
							return false;
						}
					}
				}
			}
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	public static void showErrorMessage(String errorMessage) {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setContentText(errorMessage);
		alert.show();
	}
	
	
}
