package abstractClasses;

public class Circle extends Shapes {

	private double radius;
	private final double pi = Math.PI;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		radius = 0;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*pi*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


}
