package abstractClasses;

public class ImplementLoans {

	public static void main(String[] args) {
		Loan l = new HomeLoan(2455000, 12, 15);
		System.out.println("HomeLoan emi is: "+ l.CalculateEmi());
		
		l = new CarLoan(650000, 13, 5);
		System.out.println("CarLoan emi is: "+ l.CalculateEmi());
		
		l = new EducationLoan(650000, 15, 4);
		System.out.println("EducationLoadn emi is: "+ l.CalculateEmi());
	}
}
