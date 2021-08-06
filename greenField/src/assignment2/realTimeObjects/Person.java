package assignment2.realTimeObjects;

public class Person {
	private String name;
	private int age;
	private String color;
	private double height;
	private double weight;
	
	Person(){
		name = "John Doe";
		age = 30;
		color = "White";
		height = 180;
		weight = 73;
		
	}

	public Person(String name, int age, String color, double height, double weight) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person \n[ Name=" + name + ", age=" + age + ", color=" + color + ", height=" + height + ", weight="
				+ weight + "]";
	}
	
}
