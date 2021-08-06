package assignment2.calculator;

class Calculator {

	private final double pi = Math.PI;

	
	public double add(double a, double b) {
		return a+b;
	}
	
	public double multiply(double a, double b) {
		return a*b;
	}
	
	public double divide(double a, double b) {
		if(b== 0)
			throw new ArithmeticException();
		return a/b;
	}
		
	public double subtract(double a, double b) {
		return a-b;
	}
	
	public double squareRoot(double a) {
		return Math.sqrt(a);
	}
	
	public double raiseToPower(double a, double b) {
		return Math.pow(a, b);
	}
	
	
}

