/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDate;
// Name: Har Chun Wai
// Student ID: 20WMD02982
// Program: DCS2G5
public class Driver {
    public static void main(String args[]) {
        Driver d = new Driver();
        LocalDate exp1 = LocalDate.of(2021, 10, 2);
        LocalDate exp2 = LocalDate.of(2021, 10, 20);
        Customer[] cust = new Customer[]{
            (new Member("Mr.Patrick", new ParkedCar("WWW9999", 85), "1001", exp1)),
            (new RegularMember("Suzana", new ParkedCar("JQA1011", 1300))),
            (new RegularMember("Peter Ryan", new ParkedCar("WTC6666", 100))),
            (new Member("Ms.Jessica", new ParkedCar("WPK1212", 1200), "1002", exp2))
        };
        d.printDetails(cust);
    }
    
    public void printDetails(Customer[] customers) {
        for (Customer cust : customers) {
            if (cust instanceof Member) {
                System.out.println("Member\n---------------");
            } else if (cust instanceof RegularMember) {
                System.out.println("Regular Member\n---------------");
            }
            System.out.println(cust.displayInfo() + "\n");
        }
    }
}
