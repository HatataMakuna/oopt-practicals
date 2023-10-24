/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg3;

/**
 *
 * @author harch
 */
import java.util.Scanner;
public class Prac3Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] denom = {100, 50, 20, 10, 5, 1};
        int[] qty = new int[denom.length];
        System.out.printf("\n\n%20s %12s\n", "Denomination(RM)", "Quantity");
        for (int i = 0; i < denom.length; i++) {
            System.out.printf("%15d\t\t     ", denom[i]);
            qty[i] = scan.nextInt();
        }
        System.out.printf("\n\n%15s %15s %15s", "Denomination(RM)", "Quantity", "Value(RM)");
        int total = 0;
        for (int i = 0; i < denom.length; i++) {
            if (qty[i] != 0) {
                int value = denom[i] * qty[i];
                System.out.printf("\n%15d\t\t     %2d\t   %10d", denom[i], qty[i], value);
                total += value;
            }
        }
        System.out.printf("\n\nTotal = RM %5d", total);
    }
}
