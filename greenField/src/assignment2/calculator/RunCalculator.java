package assignment2.calculator;

import java.util.*;

public class RunCalculator {
	
	public static double getInput() {
		
		var sc = new Scanner(System.in);
		int i=0;
		while(i++< 5) {
			try {
				var a = sc.nextDouble();
				return a;
			}catch(InputMismatchException e) {
				System.out.println("Wrong operand entered.");
				sc.nextLine();
			}
		}
		System.out.println("Limit reached too many wrong operands.");
		sc.close();
		return 0;
	}
	public static void run() {
		
		Calculator calci = new Calculator();
		do {
			System.out.println("#--------------------Menu--------------------#");
			System.out.println("\t\t1. Addition");
			System.out.println("\t\t2. Substraction");
			System.out.println("\t\t3. Multiplication");
			System.out.println("\t\t4. Divison");
			System.out.println("\t\t5. Raise to power");
			System.out.println("\t\t6. SquareRoot");
			System.out.println("\t\t0. Exit");
			System.out.print("Enter choice: ");
			var sc = new Scanner(System.in);
			try {
			int choice =(int) sc.nextDouble();
			if(choice == 0)
				break;
			double a , b;
			switch(choice) {
			case 1:
				System.out.println("Enter two number for addition: ");
				a = sc.nextDouble();
				b = sc.nextDouble();
				System.out.println("a+b: "+ calci.add(a, b));
				break;
			case 2:
				System.out.println("Enter two numbers for substraction: ");
				a  = sc.nextDouble();
				b =  sc.nextDouble();
				System.out.println("a-b: "+ calci.subtract(a, b));
				break;
			case 3:
				System.out.println("Enter two numbers for Multiplication: ");
				a  = sc.nextDouble();
				b =  sc.nextDouble();
				System.out.println("a x b: "+ calci.multiply(a, b));
				break;
			case 4:
				System.out.println("Enter numerator and denominator for division: ");
				a  = sc.nextDouble();
				b =  sc.nextDouble();
				System.out.println("a / b: "+ calci.divide(a, b));
				break;
			case 5:
				System.out.println("Enter number and it's exponent: ");
				a  = sc.nextDouble();
				b =  sc.nextDouble();
				System.out.println("a ^ b: " + calci.raiseToPower(a, b));
				break;
			case 6:
				System.out.println("Enter a number to get its square root: ");
				a= sc.nextDouble();
				System.out.println("/a: "+ calci.squareRoot(a));
				break;
			default:
				System.out.println("Invalid Choice.");
			}}catch(InputMismatchException e) {
				System.out.println("Wrong operand inputed. Try again.");
				sc.nextLine();
			}catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero.");
			}
		}while(true);
		
		
	}
	public static void main(String[] args) {
		run();
	}
}
