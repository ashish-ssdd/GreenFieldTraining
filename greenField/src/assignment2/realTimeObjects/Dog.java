package assignment2.realTimeObjects;

public class Dog {

	private static int count =1;
	private boolean isTamed;
	private String name;
	private String breed;
	private int age;
	private String color;
	
	Dog(){
		count++;
		name = "WildDog"+count;
		isTamed = false;
		breed = "Coyote";
		age = 4;
		color = "Golden";
	}

	
	public Dog(boolean isTamed, String name, String breed, int age, String color) {
		super();
		this.isTamed = isTamed;
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}


	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Dog.count = count;
	}

	public boolean isTamed() {
		return isTamed;
	}

	public void setTamed(boolean isTamed) {
		this.isTamed = isTamed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
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


	@Override
	public String toString() {
		return "Dog \n[isTamed=" + isTamed + ", \nname=" + name + ", \nbreed=" + breed + ", \nage=" + age + ", \ncolor=" + color
				+ "]";
	}
	
	
	
}
