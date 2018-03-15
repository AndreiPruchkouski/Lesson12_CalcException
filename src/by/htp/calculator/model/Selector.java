package by.htp.calculator.model;


import by.htp.calculator.console.Input;

public class Selector {
	
	public static void selectType() {
		
		int type = Input.readType();
		
		switch(type) {
		case 1: 
			Calculator.intOperation();
			break;
		case 2: 
			Calculator.doubleOperation();
			break;
		case 3: 
			Calculator.charOperation();
			break;
		}
			
	}
	
}
