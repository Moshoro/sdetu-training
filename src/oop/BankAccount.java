package oop;

public class BankAccount implements IRate {
	
	String accountNumber;
	static final String routingNumber = "55532";
	String name;
	String ssn;
	String accountType;
	double balance=0;
	
		
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	BankAccount(String accounType) {
		System.out.println("NEW ACCOUNT CREATED " + accountType);
	}
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: R" + initDeposit);
		
		String msg = null;
		if (initDeposit < 1000) {
			msg = "ERROR: Minimum deposit must be at least R1000";
		}else {
			msg = "Thanks for your deposit of: R" + initDeposit; 
		}
		System.out.println(msg);
		balance =+ initDeposit;
	}
	void deposit(int amount) {
		balance += amount;
		showActivity("WITHDRWAL");
	}
	void withdrawal(int amount) {
		balance -=amount;
		showActivity("WITHDRAWAL");
	}
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("Your new Balance is: R" + balance);
	}
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void setRate() {
		System.out.println("Setting Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", ssn=" + ssn + ", accountType="
				+ accountType + ", balance=" + balance + "]";
	}
}
