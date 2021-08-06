package abstractClasses;

public class Rectangle extends Shapes{

	private double length;
	private double breadth;
	
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(length+breadth);
	}

	public double getBreath() {
		return breadth;
	}

	public void setBreath(double breath) {
		this.breadth = breath;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	
}
