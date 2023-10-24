/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class InPatientBill extends PatientBill {
    // Q1 (3)
    private double specialistCharges, labCharges;
    private char roomType;
    private int durationOfStay;
    private static double standardRoomRate = 100.00;
    private static double privateRoomRate = 200.00;
    
    public InPatientBill(String name, double specialistCharges, double labCharges, char roomType, int durationOfStay) {
        super(name);
        this.specialistCharges = specialistCharges;
        this.labCharges = labCharges;
        this.roomType = roomType;
        this.durationOfStay = durationOfStay;
    }
    public double calculateTotalCharges() {
        double roomCharges = 0.0;
        switch (roomType) {
            case 'S':
                roomCharges = durationOfStay * standardRoomRate; break;
            case 'P':
                roomCharges = durationOfStay * privateRoomRate; break;
        }
        return specialistCharges + labCharges + roomCharges;
    }
}
