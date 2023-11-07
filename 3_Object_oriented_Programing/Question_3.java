package FourPackage;
/*
Exercise 3: Bank Account Inheritance
Extend the bank account example from Day 8 to include different types of accounts 
(e.g., savings, checking) with specific behaviors. Use inheritance to model these account types.

 */

class SavingAccount{
	private String account_number;
	private double balance;
	
	SavingAccount(String account_number , double balance){
		this.account_number = account_number;
		this.balance = balance;
	}
	
	public void deposite(double amount ) {
		 balance += amount;
		
	}
	public void withdrawal(double amount) {
		if(balance >= amount)
		{
		balance -= amount;
		}
		else
			System.out.println("Insufficient balance ");
	}
	public double getBalance() {
		return balance;
	}
	
}
class Checking extends SavingAccount{

	Checking(String account_number, double balance) {
		super(account_number, balance);
		
	}
	
	
	
	
}

public class Question_3 {

	public static void main(String[] args) {
			
		System.out.println("initial ammount ");
			Checking c = new Checking("17000320", 2000);
			System.out.println(c.getBalance());
			System.out.println();
			
			System.out.println("after deposite");
			c.deposite(2000);
			System.out.println(c.getBalance());
			System.out.println();
			
			System.out.println("after withdrawal");
			c.withdrawal(5000);

			
			System.out.println(c.getBalance());
	}

}
