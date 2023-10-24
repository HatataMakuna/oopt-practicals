/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class TestAccounts {
    public static void main(String args[]) {
        SavingAccount s = new SavingAccount("12345", 2000);
        CurrentAccount c = new CurrentAccount("7788", 1000);
        // Account details
        System.out.println(s + "\n");
        // Account details with transaction count
        System.out.println(c + "\n");
        s.equals(c);
        
        System.out.printf("Saving account %s has balance: RM%.2f\n", s.getAccountNumber(), s.getBalance());
        System.out.println("Transaction Deposit RM100.00");
        s.deposit(100);
        System.out.printf("Updated balance: RM%.2f\n", s.getBalance());
        
        System.out.println("\nTransaction: Withdraw RM5000.00");
        boolean successful = s.withdraw(5000);
        if (!successful) {
            System.out.println("Transaction failed. Withdrawal amount > balance.");
        }
        System.out.println("\nTransaction: Withdraw RM500.00");
        successful = s.withdraw(500);
        System.out.printf("Updated balance: RM%.2f\n", s.getBalance());
        
        System.out.printf("\nAdding interest of RM%.2f\n", s.callInterest());
        s.addInterest();
        System.out.printf("Updated balance: RM%.2f\n", s.getBalance());
        
        System.out.printf("\n\nCurrent account %s has balance: RM%.2f\n", c.getAccountNumber(), c.getBalance());
        System.out.println("Transaction: Deposit RM100.00");
        c.deposit(100);
        System.out.printf("Updated balance: RM%.2f\n", c.getBalance());
        
        System.out.println("\nTransaction: Withdraw RM5000.00");
        successful = c.withdraw(5000);
        if (!successful) {
            System.out.println("Transaction failed. Withdrawal amount > balance.");
        }
    }
}
