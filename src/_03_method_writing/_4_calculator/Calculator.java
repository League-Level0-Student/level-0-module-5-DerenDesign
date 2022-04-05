package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses
		if (task == 1) {
			
		}
		if (task == 2) {
			
		}
		if (task == 3) {
			
		}
		// 4) Call the result() method and put the answer in a pop-up
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	 void add() {
		 int a = 0;
		 a = number1 + number2;
	 }
	 void subtract() {
		 
	 }
	 void multiply() {
		 
	 }
	 void divide() {
		 
	 }
	
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	
}
