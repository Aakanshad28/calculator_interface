package calculator;

import java.util.Scanner;

public class MainCalculator {
	private static Calculation calculation = new CalculatorImp();

	public static void main(String[] args) {
		System.out.println("WelCome to the Simple Java Calculator");

		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

		System.out.println("Choose the operation you want to perform:");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		System.out.println("Enter the n1:");
		int n1 = scanner.nextInt();
		System.out.println("Enter the n2:");
		int n2 = scanner.nextInt();
		
		int result=processInput(input,n1,n2);
		System.out.println("The result is:"+result);
		
		

	}

	public static int processInput(int input, int n1, int n2) {
		
		int result = 0;
		switch (input) {
		case 1: {
			result=calculation.addition(n1, n2);
			break;
			
		}
		case 2: {
			result=calculation.subtraction(n1, n2);
			break;
			
		}
		case 3: {
			result=calculation.multiplication(n1, n2);
			break;
			
		}
		case 4: {
			result=calculation.division(n1, n2);
			break;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
		
		return result;
	}

}
