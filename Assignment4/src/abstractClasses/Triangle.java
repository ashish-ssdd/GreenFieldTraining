package abstractClasses;

public class Triangle extends Shapes {

	private double height; 
	private double base;
	private double side1;
	private double side2;
	
	
	public Triangle(double height, double side1, double side2,double base) {
		this.height = height;
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
	}
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (height*base)/2;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return side1+side2+base;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}

}
