package exception;

import java.util.Scanner;

public class MinBalanceTest {
	private int balance;
	private final int minBalance = 2000;
	public MinBalanceTest() {
		setBalance(10000);
		
	}
	public void withDraw(int amount ) throws MinBalanceException{
		if(balance - amount < minBalance)
			throw new MinBalanceException("Can't withdraw this amount, low balance.");
		balance -= amount;
		System.out.println("Amount withdrawn. Current Balance now is: "+ balance);
	}
	public int getMinBalance() {
		return minBalance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static void main(String[] args) {
		
		MinBalanceTest acc = new MinBalanceTest();
		
		var in = new Scanner(System.in);
		System.out.println("Enter amount to withdraw.");
		int amt = in.nextInt();
		try {
			acc.withDraw(amt);
		} catch (MinBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		in.close();
		
		
	}
}
