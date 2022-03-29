package _01_algorithms._2_fibonacci;

public class FibonacciNums {
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		int sum = 0;
		System.out.print(number1);
		System.out.print(number2);
		
		for (int i = 0; i < 11; i++) {
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;
			System.out.print(sum);
			
			
}
		
	}
}