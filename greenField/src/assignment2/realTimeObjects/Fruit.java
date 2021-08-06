package assignment2.realTimeObjects;

public class Fruit {

	private String color;
	private String shape;
	private String taste;
	private String size;
	
	Fruit(){
		color = "Red";
		shape = "Round";
		taste = "Sweet";
		size = "Medium";
	}
	
	public Fruit(String color, String shape, String taste, String size) {
		this.color = color;
		this.shape = shape;
		this.taste = taste;
		this.size = size;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Fruit \n[color=" + color + ", \n shape=" + shape + ", \n taste=" + taste + ", \n size=" + size + "]";
	}
	
	
	
}
