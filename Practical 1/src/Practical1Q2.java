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
public class Practical1Q2 {
    public static void main(String[] args) {
        final int DAY_PER_YEAR = 365; /*aka #define in C*/
        final int SECOND_PER_DAY = 24 * 60 * 60;
        
        System.out.print("Enter your age (years): ");
        Scanner scan = new Scanner (System.in);
        int year = scan.nextInt();
        int days = year * DAY_PER_YEAR;
        int seconds = days * SECOND_PER_DAY;
        System.out.println("Age in years: " + year + " years");
        System.out.println("Age in days: " + days + " days");
        System.out.println("Age in seconds: " + seconds + " seconds");
        System.out.print("\nProcess completed.\n");
    }
}
