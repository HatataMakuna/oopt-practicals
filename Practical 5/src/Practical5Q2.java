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
public class Practical5Q2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        str = str.toUpperCase();
        // ALT:
        // char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        // for (char c : vowels) {
        //      str = str.replace(c, 'x');
        // }
        str = str.replaceAll("[AaEeIiOoUu]", "x");
        System.out.println("Modified string: " + str);
    }
}
