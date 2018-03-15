package by.htp.calculator.model;

import by.htp.calculator.console.Input;

public class Calculator {
	private static String first = "first";
	private static String second = "second";
	
	public static void intOperation() {
		int a = Input.readInteger(first);
		int b = Input.readInteger(second);
		String operation = Input.readSymbol();
		System.out.print("Result: ");
		
		switch (operation) {
		case "+": 
			System.out.println(a + b);
			break;
		case "-": 
			System.out.println(a - b);
			break;
		case "*": 
			System.out.println(a * b);
			break;
		case "/": 
			try {
				System.out.println(a / b);
				break;	
			} catch (ArithmeticException e) {
				System.out.println("Please do not devide by zero");
				intOperation();
			}	
		}
		
	}
	
	public static void doubleOperation() {
		double a = Input.readDouble(first);
		double b = Input.readDouble(second);
		String operation = Input.readSymbol();
		System.out.print("Result: ");
		
		switch (operation) {
		case "+": 
			System.out.println(a + b);
			break;
		case "-": 
			System.out.println(a - b);
			break;
		case "*": 
			System.out.println(a * b);
			break;
		case "/": 
			try {
				System.out.println(a / b);
				break;	
			} catch (ArithmeticException e) {
				System.out.println("Please do not devide by zero");
				doubleOperation();
			}	
		}
		
	}
	
	public static void charOperation() { 
		char a = Input.readChar(first);
		char b = Input.readChar(second);
		String operation = Input.readSymbol();
		System.out.print("Result: ");
		
		switch (operation) {
		case "+": 
			System.out.println(a + b);
			break;
		case "-": 
			System.out.println(a - b);
			break;
		case "*": 
			System.out.println(a * b);
			break;
		case "/": 
			try {
				System.out.println(a / b);
				break;	
			} catch (ArithmeticException e) {
				System.out.println("Please do not devide by zero");
				doubleOperation();
			}	
		}
		
	}
	
}
