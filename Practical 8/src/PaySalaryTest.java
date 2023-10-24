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
public class PaySalaryTest {
    public static void main(String[] args) {
        Employee employee = new PartTimeEmployee("abc", new Date(), 0, 2312312323, 8, 200);
        Employee employee2 = new FullTimeEmployee("abc", new Date(), 2000, 32132312, 200);
        
        System.out.println(employee.calculateSalary());
        System.out.println(employee2.calculateSalary());
        processPayments(employee);
        processPayments(employee2);
        
        ContractingCompany cc = new ContractingCompany("TARC", 1234543);
        cc.payForServices(200.00);
        processPayments(cc);
    }
    
    public static void processPayments(Payee payee) {
        Double grossPayment = payee.getPayeeGross();
        System.out.println("Paying to :" + payee.getPayeeName());
        System.out.println("Gross pay :" + grossPayment);
        System.out.println("Transferred to Account: " + payee.getPayeeBankAccount());
    }
}