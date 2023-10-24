/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class MainDriver {
    // Q1 (2/2)
    
    public static void main(String[] args) {
        // use getName() instead of name in (b)
        // same applies to salary, use getSalary()
        
        // (a), (b) Employee empA = new Employee("Ali", 2000);
        Employee empA = new Employee(); // (c)
        empA.setName("Ali Lee"); // change name to Ali Lee; (b)
        empA.setSalary(2000); // (c)
        
        Employee empB = new Employee("Abu", 3000);
        
        System.out.println(empA.getName() + "'s salary is " + empA.getSalary());
        System.out.println(empB.getName() + "'s salary is " + empB.getSalary());
        
        empA.raiseSalary(8);
        System.out.println(empA.getName() + "'s raised salary is " + empA.getSalary());
        empB.raiseSalary(8);
        System.out.println(empB.getName() + "'s raised salary is " + empB.getSalary());
    }
}
