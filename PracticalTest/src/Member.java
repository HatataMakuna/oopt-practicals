/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Name: Har Chun Wai
// Student ID: 20WMD02982
// Program: DCS2G5
import java.time.LocalDate;
public class Member extends Customer {
    private String memberNum;
    private LocalDate expiryDate;
    private static double memberPrice;
    
    public Member(String name, ParkedCar pCar, String memberNum, LocalDate expiryDate) {
        super(name, pCar);
        this.memberNum = memberNum;
        this.expiryDate = expiryDate;
    }
    public void calcParking() {
        calcParkingHour();
        int hours = getParkedHour();
        if (hours > 2) {
            hours -= 2;
            memberPrice = hours * 1;
        } else {
            memberPrice = 0.00;
        }
    }
    @Override
    public String displayCharges() {
        return "You will get free parking for the first two hours.\n";
    }
    @Override
    public String displayInfo() {
        calcParking();
        return super.displayInfo() + "Member Number: " + memberNum + "\nMembership Expiry Date: " + expiryDate + String.format("\nYour parking payment: RM%.2f", memberPrice);
    }
}
