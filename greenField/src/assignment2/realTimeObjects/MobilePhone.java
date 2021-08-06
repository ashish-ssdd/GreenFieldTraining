package assignment2.realTimeObjects;

public class MobilePhone {

	private int price;
	private String resolution;
	private String buildMaterial;
	private int weight;
	private double size;
	
	public MobilePhone() {
		price = 15000;
		resolution = "FHD";
		buildMaterial = "Polymer";
		weight = 180;
		size = 5.1;
		
	}
	public MobilePhone(int price, String resolution, String buildMaterial, int weight, double size) {
		super();
		this.price = price;
		this.resolution = resolution;
		this.buildMaterial = buildMaterial;
		this.weight = weight;
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getBuildMaterial() {
		return buildMaterial;
	}
	public void setBuildMaterial(String buildMaterial) {
		this.buildMaterial = buildMaterial;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "MobliePhone [price=" + price + ", resolution=" + resolution + ", buildMaterial=" + buildMaterial
				+ ", weight=" + weight + "g, size=" + size + "in]";
	}
	
	
}
