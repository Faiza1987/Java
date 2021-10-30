package bankAccountApp;

public class Checking extends Account {
	// List properties specific to a Checking Account
	private long accountNumber;
	private String customerFirstName;
	private String customerLastName;
	private double initialDeposit;
	private double deposit;
	
	// Constructor to initialize Checking account properties
	// List any methods specific to the Checking account
	public void deposit(double amount) {
		this.deposit += amount;
	}
	
	public double withdraw(double amount) {
		this.deposit -= amount;
	}
	
	
	
}
