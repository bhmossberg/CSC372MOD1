package banking;

public class TestClass {

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("==== BankAccount Class Test ====");
        System.out.println("================================\n");

        // Test 1: Default Constructor
        System.out.println("1. Testing Default Constructor:");
        BankAccount defaultAccount = new BankAccount();
        defaultAccount.accountSummary();
        System.out.println();

        // Test 2: Setters
        System.out.println("2. Testing Setters:");
        defaultAccount.setFirstName("John");
        defaultAccount.setLastName("Doe");
        defaultAccount.setAccountID(987654);
        defaultAccount.accountSummary();
        System.out.println();
        
        // Test 3: Deposit
        System.out.println("3. Testing Deposit:");
        defaultAccount.deposit(150.75);
        defaultAccount.deposit(0);
        System.out.println();
        
        // Test 4: Withdrawals - Normal and Insufficient Funds
        System.out.println("4. Testing Withdrawals:");
        defaultAccount.withdrawal(50.00);
        defaultAccount.withdrawal(200.00);
        defaultAccount.withdrawal(0);
        defaultAccount.accountSummary();
        System.out.println();
        
        // Test 5: Parameterized Constructor
        System.out.println("5. Testing Parameterized Constructor:");
        BankAccount paramAccount = new BankAccount("Benjamin", "Mossberg", 123456, 250.00);
        paramAccount.accountSummary();
        System.out.println();
        
        // ==================== CheckingAccount Tests ====================
        System.out.println("=====================================");
        System.out.println("==== CheckingAccount Class  Test ====");
        System.out.println("=====================================\n");
        System.out.println();
        
        CheckingAccount checking = new CheckingAccount();
        
        // Test 6: Initial State + displayAccount()
        System.out.println("6. Initial CheckingAccount State:");
        checking.displayAccount();
        System.out.println();
        
        // Test 7: Deposit
        System.out.println("7. Testing Deposit on CheckingAccount:");
        checking.deposit(100.00);
        System.out.println();
        
        // Test 8: Normal Withdrawal
        System.out.println("8. Normal Withdrawal ($40):");
        checking.withdrawal(40.00);
        System.out.println();
        
        // Test 9: Overdraft Withdrawal
        System.out.println("9. Overdraft Withdrawal ($90 - should trigger $30 fee):");
        checking.withdrawal(90.00);
        System.out.println();
        
        // Test 10: Large Overdraft
        System.out.println("10. Large Overdraft Withdrawal ($200):");
        checking.withdrawal(200.00);
        System.out.println();
        
        // Test 11: Update Interest Rate
        System.out.println("11. Updating Interest Rate:");
        checking.setInterestRate(4.75);
        checking.displayAccount();
        System.out.println();
        
        // Test 12: Edge Cases
        System.out.println("12. Edge Cases:");
        checking.withdrawal(0); // Zero withdrawal
        checking.deposit(-10); // Negative deposit
        checking.accountSummary(); // Should still work via inheritance

        System.out.println("=== All Tests Completed ===");
    }
}