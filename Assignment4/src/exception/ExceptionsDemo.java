package exception; 
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		try {
			var in = new Scanner(System.in);
			int a, b; 
			System.out.print("Enter two numbers: ");
			a = in.nextInt();
			b = in.nextInt();
			System.out.println("a/b : "+ a/b);
			
			int[] c = {1,2,3,4,6};
			System.out.println("Enter index of array to access.");
			a = in.nextInt();
			System.out.println("Element at index "+ a + " is: "+ c[a]);
			
			File f1 = new File("D:hello.txt");
			Scanner reader = new Scanner(f1);
			
			while(reader.hasNext()) {
				String fileData = reader.next();
				System.out.println(fileData);
			}
			reader.close();
			in.close();
		}catch(ArithmeticException e) {
			System.out.println(e+"\n Cannot divide by zero.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e+"\n Inputed number exceeds array index limits.");
		}catch(FileNotFoundException e) {
			System.out.println(e+ "\n Check if the directory is correct or file is present.");
		}
		
	}
}
