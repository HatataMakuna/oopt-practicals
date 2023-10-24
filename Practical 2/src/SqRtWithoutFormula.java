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
public class SqRtWithoutFormula {
    // Practical 2 Question 2 Pt.2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number, squareRt;
        System.out.printf("Enter a number to find the square root: ");
        number = input.nextDouble();
        squareRt = calSqRoot(number);
        if (squareRt < 0) {
            System.out.println("Math error!!!!");
        } else {
            System.out.println("Square root of " + number + " is " + squareRt);
        }
    }

    static double calSqRoot(double num) {
        double lowLim = 0.0, upLim = 1.0, midpoint, ans;

        if(num > 1) {
            lowLim = 1;
            upLim = num;
        } else if (num > 0 && num < 1) {
            lowLim = num;
            upLim = 1;
        } else if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else if (num < 0) {
            return -1;
        }
         do{
             midpoint = (lowLim + upLim)/2;
             if(midpoint * midpoint > num) {
                 upLim = midpoint;
             } else if (midpoint * midpoint < num) {
                 lowLim = midpoint;
             }
            ans = (upLim - lowLim)/lowLim;
         }while(ans > 0.00000001);
         return midpoint;
    }
}
