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
public class Driver3 {
    // P4Q4(5)
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        CarType[] carTypes = new CarType[]{new CarType("Toyota", 1.5, "Vios"), new CarType("Honda", 1.6, "City")};
        Registration[] regArr = new Registration[2];
        int registrationNo = 1000;
        for (int i = 0; i < regArr.length; i++) {
            System.out.print("Enter your owner name : ");
            String name = scan.nextLine();
            System.out.print("Enter your IC number : ");
            String icNum = scan.nextLine();
            Owner owner = new Owner(name, icNum);
            System.out.print("Enter car plate number : ");
            String carPlateNum = scan.nextLine();
            System.out.print("Enter car color : ");
            String color = scan.nextLine();
            System.out.print("Enter car year : ");
            int year = scan.nextInt();
            int count = 1;
            for (CarType carType : carTypes) {
                System.out.println("[" + count + "]" + carType);
                count++;
            }
            int selection = scan.nextInt();
            System.out.print("Enter registration no. :");
            String regisNo = scan.nextLine();
            CarType selectedCarType = carTypes[--selection];
            Car car = new Car(carPlateNum, color, year, selectedCarType);
            regArr[i] = new Registration(regisNo, owner, car);
            scan.nextLine();
        }
        
        for (Registration reg : regArr) {
            System.out.println(reg);
        }
        
        /*        // Row 1 = regis no. 1001
        CarType carType1 = new CarType("Vios", 1.5, "Toyota");
        Car car1 = new Car("ABC123", "Red", 2010, carType1);
        Owner owner1 = new Owner("John Wayne", "111111111");
        Registration registration1 = new Registration("1001", owner1, car1);
        
        // Row 2 = regis no. 1002
        CarType carType2 = new CarType("Teana", 2.0, "Nissan");
        Car car2 = new Car("WEA888", "Red", 2010, carType2);
        Owner owner2 = new Owner("Bea Arthur", "222222222");
        Registration registration2 = new Registration("1002", owner2, car2);
        
        // Row 3 = regis no. 1003
        CarType carType3 = new CarType("City", 1.6, "Honda");
        Car car3 = new Car("PBL168", "Black", 2011, carType3);
        Owner owner3 = new Owner("Meg Ryan", "333333333");
        Registration registration3 = new Registration("1003", owner3, car3);
        
        // Row 4 = regis no. 1004
        CarType carType4 = new CarType("Teana", 2.0, "Nissan");
        Car car4 = new Car("BBB777", "White", 2011, carType4);
        Owner owner4 = new Owner("Jane Doe", "444444444");
        Registration registration4 = new Registration("1004", owner4, car4);
        
        // Row 5 = regis no. 1005
        CarType carType5 = new CarType("Vios", 1.5, "Toyota");
        Car car5 = new Car("CAT118", "Green", 2012, carType5);
        Owner owner5 = new Owner("Al Johnson", "555555555");
        Registration registration5 = new Registration("1005", owner5, car5);
        
        // Row 6 = regis no. 1006
        Car car6 = new Car("TV798", "Blue", 2012, carType5);
        Owner owner6 = new Owner("Ned Beatty", "666666666");
        Registration registration6 = new Registration("1006", owner6, car6);
        
        System.out.println("Reg No.    Name            IC No.     Plate No.  Color    Year   Make       Model    Capacity");
        System.out.println(registration1);
        System.out.println(registration2);
        System.out.println(registration3);
        System.out.println(registration4);
        System.out.println(registration5);
        System.out.println(registration6);*/
    }
}