package banking;

public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Default constructor
    public CheckingAccount() {
        super(); 
        this.interestRate = 1.2;
    }

    // Overridden withdrawal with overdraft
    @Override
    public void withdrawal(double amount) {
        if (getBalance() >= amount) {
            super.withdrawal(amount);
        } else {
            processWithdrawal(amount);
        }
    }

    // Process overdraft with $30 fee
    public void processWithdrawal(double amount) {
        double newBalance = getBalance() - amount - 30;
        setBalance(newBalance);
        System.out.println("Overdraft detected! A $30 fee will be assessed.");
        System.out.printf("$%.2f withdrawn successfully.%n", amount);
        System.out.printf("You have $%.2f remaining.%n%n", getBalance());
    }

    // Display checking account information 
    public void displayAccount() {
        accountSummary();
        System.out.printf("Interest Rate: %.2f%%%n%n", interestRate);
    }

    // Getters and Setters for interestRate
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }
}