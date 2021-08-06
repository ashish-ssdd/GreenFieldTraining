package assignment2.realTimeObjects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A Nobody
		Person A = new Person();
		System.out.println(A);
		A.setName("Bruce Wayne");
		A.setAge(30);
		A.setHeight(187);
		A.setWeight(95);
		
		//The nobody is now the dark knight
		System.out.println(A);
		
		//Generic vehicle
		Vehicle V = new Vehicle();
		System.out.println(V);
			
		V.setCapacity(50);
		V.setColor("Black");
		V.setElectric(false);
		V.setMileage(20);
		V.setSeats(2);
		V.setWheels(4);
		
		//Now it's a batmobile
		System.out.println(V);
		
		Fruit F = new Fruit();
		System.out.println(F);
		
		F.setColor("Orange");
		F.setShape("Round");
		F.setSize("Medium");
		F.setTaste("Sour");
		
		System.out.println(F);
	
		Dog D = new Dog();
		System.out.println(D);
		
		D.setAge(3);
		D.setTamed(true);
		D.setBreed("Dobermann");
		D.setName("Chopper");
		D.setColor("Black");
		
		System.out.println(D);
		
		MobilePhone M = new MobilePhone();
		
		System.out.println(M);
		
		M.setBuildMaterial("Metallic");
		M.setPrice(20000);
		M.setResolution("UHD");
		M.setSize(6);
		M.setWeight(200);
		
		System.out.println(M);
	}

}
