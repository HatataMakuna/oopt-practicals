/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
import java.util.Date;
public class Account extends Object {
    // P6Q1
    private String accountNumber;
    private double balance;
    private Date dateCreated;
    
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        dateCreated = new Date();
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public boolean withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("Account number: %s\nBalance: RM%.2f\nDate Created: %s", accountNumber, balance, dateCreated);
    }
    
    public boolean equals(Account o) {
        Account otherAcc = (Account) o;
        return accountNumber.equals(otherAcc.getAccountNumber());
    }
}