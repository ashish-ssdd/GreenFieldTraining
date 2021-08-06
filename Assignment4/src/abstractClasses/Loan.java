package abstractClasses;

public abstract class Loan {

	private double principal , rate , time, emi;
	
	public Loan(double principal, double rate, double time) {
		super();
		this.principal = principal;
		this.rate=rate/(12*100); 
		this.time=time*12; 
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public abstract double CalculateEmi();
	
	public double getEmi() {
		return emi;
	}
}

class HomeLoan extends Loan{

	
	public HomeLoan(double principal, double rate, double time) {
		super(principal, rate, time);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalculateEmi() {
		// TODO Auto-generated method stub
		setEmi((getPrincipal()*getRate()*Math.pow(1+getRate(),getTime()))/(Math.pow(1+getRate(),getTime())-1));
		return getEmi();
	}
	
}

class CarLoan extends Loan{

	public CarLoan(double principal, double rate, double time) {
		super(principal, rate, time);
		// TODO Auto-generated constructor stub
	}
	
	public double CalculateEmi() {
		// TODO Auto-generated method stub
		setEmi((getPrincipal()*getRate()*Math.pow(1+getRate(),getTime()))/(Math.pow(1+getRate(),getTime())-1));
		return getEmi();
	}
}

class EducationLoan extends Loan{

	public EducationLoan(double principal, double rate, double time) {
		super(principal, rate, time);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalculateEmi() {
		// TODO Auto-generated method stub
		setEmi((getPrincipal()*getRate()*Math.pow(1+getRate(),getTime()))/(Math.pow(1+getRate(),getTime())-1));
		return getEmi();
	}
	
}

