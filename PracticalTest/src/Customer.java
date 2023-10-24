/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Name: Har Chun Wai
// Student ID: 20WMD02982
// Program: DCS2G5
public class Customer {
    private String name;
    private ParkedCar pCar;
    protected double parkingCharged;
    private int parkedHour;
    
    public Customer(String name, ParkedCar pCar) {
        this.name = name;
        this.pCar = pCar;
    }
    public String getName() {
        return name;
    }
    public int getParkedHour() {
        return parkedHour;
    }
    public void calcParkingHour() {
        parkedHour = pCar.getDurationMinutes() / 60;
        if (pCar.getDurationMinutes() % 60 != 0) {
            parkedHour++;
        }
    }
    public String displayCharges() {
        return "No Charges\n";
    }
    public String displayInfo() {
        calcParkingHour();
        return "Customer Name: " + name + "\n" + pCar.toString() + "Your parking duration: " + parkedHour + " hour(s)\n" + displayCharges();
    }
}
