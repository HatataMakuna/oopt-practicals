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
public class Practical1Q3 {
    public static void main(String[] args) {
        int sumRight = 0, sumOthers = 0, count = 0, totalSum = 0;
        int rightNum, leftNum, digit, digitTwo;
        
        System.out.print("Enter an 8-digit credit card number: ");
        Scanner scan = new Scanner (System.in);
        int number = scan.nextInt();
        
        // form the sum of each digit starting from the rightmost
        rightNum = number;
        while (rightNum > 0) {
            digit = rightNum % 10;
            sumRight += digit;
            rightNum = rightNum / 100;
        }
        System.out.println("Your sum from the right is " + sumRight);
        
        // form the sum of other digits * 2
        leftNum = number;
        while (leftNum > 0) {
            if (count == 0) {
                leftNum = leftNum / 10;
            }
            else {
                leftNum = leftNum / 100;
            }
            digit = (leftNum % 10) * 2;
            if (digit >= 10) {
                digitTwo = digit % 10;
                sumOthers += digit;
                digit /= 10;
                sumOthers += digit;
            }
            count++;
        }
        System.out.println("Your sum from the other digits is " + sumOthers);
        
        totalSum = sumRight + sumOthers;
        if (totalSum % 10 == 0) {
            System.out.println("Your credit card number is valid.");
        }
        else {
            System.out.println("Your credit card number is invalid.");
        }
    }
}
/*
Enter an 8-digit credit card number: 66231127
Your sum from the right is 17
Your sum from the other digits is 13
Your credit card number is valid.

7 1 3 6 = 17
4 2 4 1 2 = 13
17+13=30 (valid)
*/

/*
Alt.:
package P1;

import java.util.Scanner;
import java.lang.String;

public class P1Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean alll = false;
        while (!alll) {
            System.out.println("Please Enter the 8 digit credit card number : ");
            String number = input.next();
            String[] arrNumber = number.split("");
            int[] num = new int[8];
            int bul = 0, sum = 0;

            for (int i = 7; i >= 0; i--) {
                num[i] = Integer.parseInt(arrNumber[i]);
                if (i % 2 == 1) {
                    sum += num[i];
                } else {
                    num[i] *= 2;
                    bul += (num[i] % 10) + (num[i] / 10);
                }
            }
            int total = sum + bul;

            if (total % 10 == 0) {
                System.out.println("Valid");
                System.out.println("The sum  of the number is " + total);
                alll = true;
            } else {
                System.out.println("Invalid");
                //int la = 10 - total % 10;
                //4358 9790
                //40
                int check = (num[7] + 10 - (total % 10)) % 10;
             	  
                int ccLastDigit = num[7];
              	int fixIt = 10 - (total%10);
              	int newLastDigit = (ccLastDigit + fixIt)%10;
                System.out.println("The correct last digit should be " + check);
            }

        }
    }
}

 // This program reads an eight digit credit card number and
verifies the check digit.
import java.util.Scanner:
public class P103 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter B digit credit card number: ");
        int cardNumber;
        cardNumber - in.nextInt ();

        int suml =
        int templ = cardNumber;
        for (int i = 0; i < 4; i++) {
            sumi += temp1 % 10; // Get the last digit and sum up
            tempi /= 100: // skip over two digits so we get every other digit
        }
        int sum2 0;
        int temp2 - CardNumber / 10;
        for (int i = 0; i < 4; i++) {
            int digit = (temp2 * 10) * 2;
            sum2 += digit $ 10;
            sum2 += digit / 10;
            temp2 / = 100;
        }
        int finalsum - sumi + sum2;
        if (finalsun % 10 -- 0)
        System.out.println("The credit card number is valid.");
        else {
            System.out.println("The credit card number is not valid.");
            int ccLastDigit= cardNumber410;
            int fixit = 10-(finalsum#10):
            int newLastDigit = (ccLast Digit +fixit) $10;
            System.out.println("The last digit should be newiastDigit);
        }
    }
}
*/