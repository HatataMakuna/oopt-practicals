/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Name: Har Chun Wai
// Student ID: 20WMD02982
// Program: DCS2G5
public class RegularMember extends Customer {
    private static double nonMemberPrice;
    
    public RegularMember(String name, ParkedCar pCar) {
        super(name, pCar);
    }
    public void calcParking() {
        calcParkingHour();
        int hours = getParkedHour();
        if (hours >= 20) {
            nonMemberPrice = 50.00;
        } else {
            nonMemberPrice = hours * 2.50;
        }
    }
    @Override
    public String displayCharges() {
        return "You will be charged RM 50.00 for parking more than 20 hours.\n";
    }
    @Override
    public String displayInfo() {
        calcParking();
        return super.displayInfo() + String.format("Your parking payment: RM%.2f", nonMemberPrice);
    }
}
