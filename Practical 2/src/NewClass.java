/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class NewClass {
    public static void main(String[] args) {
        System.out.println(add(3,5,7));
        System.out.println(add(3,5,7,9));
    }
    public static void add(int a, int b, int c) {
        return a+b+c;
    }
    public static int add(int a, int b) {
        return a+b;
    }
    public static int add(int c, int d) {
        return c+d;
    }
}
