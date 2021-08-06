package abstractClasses;

public class ShapesImplemented {

	public static void main(String[] args) {
		Shapes s = new Circle(4.5);
		System.out.println("Area of circle: "+s.area());
		System.out.println("Perimeter of Circle: " + s.perimeter());

		s = new Triangle(5, 4,7,3);
		System.out.println("Area of Triangle: " + s.area());
		System.out.println("Perimeter of Triangle: " + s.perimeter());
		
		s= new Rectangle(3.5,9.0);
		System.out.println("Area of Rectangle: " + s.area());
		System.out.println("Perimeter of Rectangle: " + s.perimeter());
		
	}
}
