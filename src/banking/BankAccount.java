package banking;

public class BankAccount {
	// Required Fields
	protected String firstName;
	protected String lastName;
	protected int accountID;
	protected double balance;
	
	// Default constructor
	public BankAccount() {
		this.firstName = "First Name";
		this.lastName = "Last Name";
		this.accountID = -1;
		this.balance = 0.0;
	}
	
	// Parameterized constructor
	public BankAccount(String firstName, String lastName, int accountID, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = balance;
	}
	
	// Deposit funds
	public void deposit(double amount) {

		this.balance += amount;
		System.out.printf("$%.2f depositted successfully.%nYou have $%.2f remaining.%n%n", amount, this.balance);
	}
	
	// Withdraw funds
	public void withdrawal(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;

			System.out.printf("$%.2f withdrawn successfully.%n", amount);
		}
		else {
			System.out.println("Transaction cancelled, insufficient funds.");
		}
		System.out.printf("You have $%.2f remaining.%n", this.balance);
		System.out.println();
	}
	
	// Display Account information
	public void accountSummary() {
		System.out.println("====Displaying Account Summary====");
		System.out.printf("Memer name: %s, %s%n", getLastName(), getFirstName());
		System.out.printf("Account ID: %d%n", getAccountID());
		System.out.printf("Current Balance: $%.2f%n", getBalance());
		System.out.println();
	}
	
	// Getters and Setters
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public int getAccountID() {
		return this.accountID;
	}
	public double getBalance() {
		return this.balance;
	}
	
}
