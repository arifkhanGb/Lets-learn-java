package FourPackage;
/*
Exercise 9: Banking Interfaces
Design a Java program that models a banking system using interfaces. 
Create interfaces for "SavingsAccount" and "CheckingAccount" with methods for deposit, withdrawal, 
and balance inquiry. Implement these interfaces in concrete classes.

 */
interface savingAccounts{
	public void deposite(double b);
	public void withdrawal(double a);
}
interface CheckingAccount{
	public void balanceInquery();
}

class Bank implements savingAccounts ,CheckingAccount{
		
		double balance;
		 
		Bank(double balance){
			this.balance = balance;
			
		}
	
	@Override
	public void balanceInquery() {
		System.out.println("your current balance = " + balance);
		
	}

	@Override
	public void deposite(double balance) {
		this.balance +=balance;
		System.out.println(balance);
		
	}

	@Override
	public void withdrawal(double amount) {
		
		if(balance > amount)
		{
			this.balance -= amount;
			System.out.println(amount);
		}
		else 
			System.out.println("not enough balance");
		
	}
	
}

public class Question_9 {

	public static void main(String[] args) {
	
		Bank b = new Bank(1000);
		b.balanceInquery();
		System.out.println();
		
		System.out.println("after deposite amount");
		b.deposite(2000);
		b.balanceInquery();
		System.out.println();
		
		System.out.println("After withdrawal amount");
		b.withdrawal(500);
		b.balanceInquery();
	}

}
