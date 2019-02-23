package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.deposit(2000);
		acc1.deposit(2000);
		acc1.withdrawal(1200);
//		BankAccount acc2 = new BankAccount("Checking Account");
//		
//		BankAccount acc3 = new BankAccount("Savings Account",5000);
//		acc3.checkBalance();
		
	}

}
