/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class SavingAccount extends Account {
    //P6Q1(2)
    private static double interestRate = 0.05;
    public SavingAccount(String accountNum, double balance) {
        super(accountNum, balance);
    }
    
    public void setIntrestRate(double interestRate) {
        SavingAccount.interestRate = interestRate;
    }
    
    public double callInterest() {
        return getBalance() * interestRate / 12;
    }
    
    public void addInterest() {
        // super.deposit(interestRate);
        deposit(callInterest());
    }
}
