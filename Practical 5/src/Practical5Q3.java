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
public class Practical5Q3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        //args = new String[]{"pETER", "[RYAN]", "Robbin", "Mr"};
        String fullName = "";
        System.out.print("C:\\java Q5 ");
        String title = scan.nextLine();
        title = args[args.length - 1];
        for (int i = 0; i < args.length; i++) {
            String name = args[i].toLowerCase();
            //name = name.replace(name.charAt(0), Character.toUpperCase(name.charAt(0)));
            if (name.contains("[")) {
                name = name.replace(name.charAt(1), Character.toUpperCase(name.charAt(1)));
            } else {
                name = name.replace(name.charAt(0), Character.toUpperCase(name.charAt(0)));
            }
            fullName += " " + name;
        }
        
        int start = fullName.indexOf("[" + 1);
        int end = fullName.indexOf("]");
        String surname = fullName.substring(start, end);
        fullName = fullName.replace("[", "");
        fullName = fullName.replace("]", "");
        System.out.println("To " + fullName);
        System.out.println("Wishing you a Merry Christmas, " + title + surname);
    }
}
