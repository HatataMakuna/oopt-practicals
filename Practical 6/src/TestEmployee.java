/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class TestEmployee {
    // Q3 (4)
    public static void main(String[] args) {
        Employee[] empArray = new Employee[]{new CommissionEmployee("ABC", 2021, 2000, 500, 2), new Clerk("Clerk", 2000, 1200.00, 250.00, 12), new Employee());
        printElements(empArray);
    }
    public void printElements(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee instanceof CommissionEmployee) {
                System.out.println("Is a Commission Employee");
            }
            else if (employee instanceof Clerk) {
                System.out.println("Is a Clerk");
            }
            else {
                System.out.println("Is a Employee");
            }
        }
    }
}