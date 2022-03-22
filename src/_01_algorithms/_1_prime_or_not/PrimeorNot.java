package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Choose a number");
		int x = 0;
		 x = Integer.parseInt(answer);
		 for (int i = 2; i < x; i++) {
			 if (x % i == 0) {
				 System.out.print("The number is not prime!");
				 System.exit(0);
			 }
			
				 
			 }
		 System.out.print("The number is prime.");
		 }
		
	}

