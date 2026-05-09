package banking;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println("====BankAccount class test====");
		System.out.println("==============================");
		System.out.println();
		BankAccount noParams = new BankAccount();
		System.out.println("Displaying default configuration:");
		System.out.println();
		noParams.accountSummary();
		System.out.println();
		System.out.println("Testing setters with \"John\", \"Doe\", 987654");
		System.out.println();
		noParams.setFirstName("John");
		noParams.setLastName("Doe");
		noParams.setAccountID(987654);
		noParams.accountSummary();
		System.out.println();
		System.out.println("Attempting to deposit $50");
		noParams.deposit(50.0);
		System.out.println("Attempting to withdraw $60");
		noParams.withdrawal(60.0);
		System.out.println("Attempting to withdraw $40");
		noParams.withdrawal(40.0);
		System.out.println("Testing parameterized constructor to initialize name, account ID, and balance.");
		System.out.println();
		BankAccount parameterized = new BankAccount("Benjamin", "Mossberg", 123456, 50.0);
		parameterized.accountSummary();
		System.out.println("==================================");
		System.out.println("====CheckingAccount class test====");
		System.out.println("==================================");
		System.out.println();
		CheckingAccount testNoParams = new CheckingAccount();
		testNoParams.displayAccount();
		System.out.println("Attempting to deposit $50");
		testNoParams.deposit(50.0);
		System.out.println("Attempting to withdraw $60");
		testNoParams.withdrawal(60.0);
		System.out.println("Attempting to modify interest rate to 5.5%...");
		testNoParams.setInterestRate(5.5);
		testNoParams.displayAccount();
	}
}
