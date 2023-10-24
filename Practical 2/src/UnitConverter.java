/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class UnitConverter {
    // Practical 2 Question 3
    public static double inchToCentimeter(double inch) {
        return inch * 2.54;
    }
    public static double centimeterToInch(double cm) {
        return cm / 2.54;
    }
    public static void main(String[] args) {
        System.out.println("Inches\tCentimeters\tCentimeters\tInches");
        System.out.printf("1.0\t%.2f", inchToCentimeter(1.0));
        System.out.printf("\t\t5.0\t\t%.2f\n", centimeterToInch(5.0));
        System.out.printf("2.0\t%.2f", inchToCentimeter(2.0));
        System.out.printf("\t\t10.0\t\t%.2f\n", centimeterToInch(10.0));
        System.out.printf("3.0\t%.2f", inchToCentimeter(3.0));
        System.out.printf("\t\t15.0\t\t%.2f\n", centimeterToInch(15.0));
        System.out.printf("4.0\t%.2f", inchToCentimeter(4.0));
        System.out.printf("\t\t20.0\t\t%.2f\n", centimeterToInch(20.0));
        System.out.printf("5.0\t%.2f", inchToCentimeter(5.0));
        System.out.printf("\t\t25.0\t\t%.2f\n", centimeterToInch(25.0));
        System.out.printf("6.0\t%.2f", inchToCentimeter(6.0));
        System.out.printf("\t\t30.0\t\t%.2f\n", centimeterToInch(30.0));
        System.out.printf("7.0\t%.2f", inchToCentimeter(7.0));
        System.out.printf("\t\t35.0\t\t%.2f\n", centimeterToInch(35.0));
        System.out.printf("8.0\t%.2f", inchToCentimeter(8.0));
        System.out.printf("\t\t40.0\t\t%.2f\n", centimeterToInch(40.0));
        System.out.printf("9.0\t%.2f", inchToCentimeter(9.0));
        System.out.printf("\t\t45.0\t\t%.2f\n", centimeterToInch(45.0));
        System.out.printf("10.0\t%.2f", inchToCentimeter(10.0));
        System.out.printf("\t\t50.0\t\t%.2f\n", centimeterToInch(50.0));
    }
}
