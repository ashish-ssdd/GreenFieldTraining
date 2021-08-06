package assignment2.realTimeObjects;

public class Vehicle {

	private int wheels;
	private String color;
	private int mileage;
	private int capacity;
	private int seats;
	private boolean electric;
	
	Vehicle(){
		wheels = 4;
		color = "White";
		mileage = 24;
		capacity = 55;
		seats =4;
		electric = false;
	}

	
	public Vehicle(int wheels, String color, int mileage, int capacity, int seats, boolean electric) {
		this.wheels = wheels;
		this.color = color;
		this.mileage = mileage;
		this.capacity = capacity;
		this.seats = seats;
		this.electric = electric;
	}


	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	@Override
	public String toString() {
		return "Vehicle\n [wheels=" + wheels + ",\n color=" + color + ",\n mileage=" + mileage + ",\ncapacity=" + capacity
				+ ",\n seats=" + seats + ",\n electric=" + electric + "]";
	}
	
	
}
