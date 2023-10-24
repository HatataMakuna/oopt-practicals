/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class TestNumber {
    public static void main(String[] args) {
        Payment[] payments = new Payment[] {
            (new CashPayment("P0001", 285.00)),
            (new CreditCardPayment("P0002", 1600.50))
        };
        for (Payment p : payments) {
            if (p instanceof CashPayment) {
                System.out.println("Cash Payment\n=============");
            } else if (p instanceof CreditCardPayment) {
                System.out.println("Credit Card Payment\n====================");
            }
            System.out.println(p.displayInfo() + "\n");
        }
    }
}
