package banking;

public class CheckingAccount extends BankAccount {
	private double interestRate;
	// Allow overdraft with $30 fee
	@Override
	public void withdrawal(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			System.out.printf("$%.2f withdrawn successfully.", amount);
		}
		else {
			processWithdrawal(amount);
		}
		System.out.printf("You have $%.2f remaining.%n%n", this.balance);
	}
	
	public CheckingAccount() {
		interestRate = 1.2;
	}
	
	// Method for helping with overdraft
	public void processWithdrawal(double amount) {
		this.balance -= amount;
		this.balance -= 30;
		System.out.println("Overdraft detected! A $30 fee will be assessed");
		System.out.printf("$%.2f withdrawn successfully.%n", amount);
	}
	public void setInterestRate(double rate) {
		this.interestRate = rate;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
}
