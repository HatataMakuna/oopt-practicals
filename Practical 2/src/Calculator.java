/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class Calculator {
    public static double calculateAverage(int number1, int number2) {
        return (double)(number1 + number2) / 2;
    }
    public static double calculateAverage2(int number1, int number2, int number3) {
        return (double)(number1 + number2 + number3) / 3;
    }
    public static double calculateAverage3(double number1, double number2) {
        return (number1 + number2) / 2;
    }
    public static double calculateAverage4(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 2;
    }
    public static void main(String[] args) {
        System.out.println(calculateAverage(2,6));
        System.out.println(calculateAverage2(1, 4, 7));
        System.out.println(calculateAverage3(4.5, 5.3));
        System.out.println(calculateAverage4(9.3, 8.1, 4.5));
    }
}
