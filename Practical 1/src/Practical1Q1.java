/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
import java.util.Scanner;
public class Practical1Q1 {
    public static void main(String[] args) {
//        System.out.println("Please enter your name: ");
//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine(); /*Return as string*/
//        System.out.println("My name is " + name);

          System.out.print("Enter name: ");
          Scanner scan = new Scanner (System.in);
          String name = scan.nextLine();
          System.out.print("\nEnter your year of study: ");
          int year = scan.nextInt();
          System.out.print("\nWhat is your target GPA for this semester? ");
          double gpa = scan.nextDouble();
          
          System.out.print("\nWelcome " + name + "!\n");
          System.out.println("Work hard to achieve your target GPA of " + gpa + " this semester of your Year " + year + ".");
    }
}
