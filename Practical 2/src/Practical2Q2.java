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
import java.text.DecimalFormat;
public class Practical2Q2 {
    // Practical 2 Question 2 Pt.1
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0000");

        System.out.print("Please key in a  number for the square root:");
        double number = scan.nextDouble();
        System.out.println("The  squareroot of  " + number + " is " + df.format(sqrt(number)));
    }
  
  	public static double sqrt(double number){
      	double midpoint;
        double upper=0;
        double lower=0;
        double precision;
        
        if (number > 1) {
            upper=number;
          	lower=1;
        }else if (number == 1) {
            System.out.println("The  squareroot of  " + number + " is 1.");
        } else if (number == 0) {
            System.out.println("The  squareroot of  " + number + " is 0.");
        } else if (number < 0) {
            System.out.println("Negative cannot be square root.");
        } else if (number < 1 ){
           lower=number;
           upper=1;
        }
       
        do {
                midpoint = (upper + lower) / 2;
                double doubleMidpoint = midpoint * midpoint;

                if (doubleMidpoint > number) {
                    upper = midpoint;
                } else {
                    lower = midpoint;
                }
                precision = (upper - lower) / lower;
        } while (precision > 0.00000001);

       return midpoint;
     
    }
}



/*
import java.util.Scanner;
public class Practical2Q2 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner (System.in);
        int number = scan.nextInt();
        
        double lowerLimit, upperLimit, midpoint, powMidpoint;
        if (number > 1) {
            lowerLimit = 1;
            upperLimit = number;
            do {
                midpoint = (lowerLimit + upperLimit) / 2;
                powMidpoint = Math.pow(midpoint, 2);
                if (powMidpoint > number) {
                    upperLimit = powMidpoint;
                }
                if (powMidpoint < number) {
                    lowerLimit = powMidpoint;
                }
            } while(powMidpoint == upperLimit || powMidpoint == lowerLimit);
        }
        else {
            lowerLimit = number;
            upperLimit = 1;
            do {
                midpoint = (lowerLimit + upperLimit) / 2;
                powMidpoint = Math.pow(midpoint, 2);
                if (powMidpoint > number) {
                    upperLimit = powMidpoint;
                }
                if (powMidpoint < number) {
                    lowerLimit = powMidpoint;
                }
            } while(powMidpoint == upperLimit || powMidpoint == lowerLimit);
        }
    }
}
*/