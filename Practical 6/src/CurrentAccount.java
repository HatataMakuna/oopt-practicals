/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class CurrentAccount extends Account {
    //P6Q1(3)
    public static int freeTransaction = 3;
    public static double transactionFee = 3;
    private int transactionCount;
    
    public CurrentAccount(String accountNum, double balance) {
        super(accountNum, balance);
    }
    
    public static int getFreeTransaction() {
        return freeTransaction;
    }
    
    public int getTransactionCount() {
        return transactionCount;
    }
    
    public void increaseTransactionCount() {
        transactionCount++;
    }
    
    public void deductTransactionFee() {
        withdraw(transactionFee);
    }
    
    @Override
    public boolean withdraw(double amount) {
        boolean successful = super.withdraw(amount);
        if(successful) {
            transactionCount++; // OR call increaseTransactionCount();
            if (transactionCount > freeTransaction) {
                deductTransactionFee();
            }
        }
        return successful;
    }
    
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
        if (transactionCount > freeTransaction) {
            deductTransactionFee();
        }
    }
    
    // Q3
    @Override
    public String toString() {
        return super.toString() + "\nTransaction Count:" + this.transactionCount;
    }
}
