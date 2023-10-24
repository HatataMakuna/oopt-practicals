/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author harch
 */
public class OutPatientBill extends PatientBill {
    // Q1 (2)
    private static double registrationFees = 30;
    private double consultationFees;
    
    public OutPatientBill(String name, double consultationFees) {
        super(name);
        this.consultationFees = consultationFees;
    }
    public double calculateTotalCharges() {
        return registrationFees + consultationFees;
    }
    public double getConsultationFees() {
        return consultationFees;
    }
    public void setConsultationFees(double consultationFees) {
        this.consultationFees = consultationFees;
    }
    public String toString() {
        return super.toString() + "\nConsultation Fee: " + consultationFees;
    }
}