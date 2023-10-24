/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public abstract class PatientBill implements Comparable {
    // Q1 (1)
    protected int visitID;
    protected String name;
    private static int lastAssignedID = 1000;
    
    public PatientBill(String name) {
        visitID = lastAssignedID;
        this.name = name;
        lastAssignedID++;
    }
    
    public abstract double calculateTotalCharges();
    public String toString() {
        return "Patient Name: " + name;
    }
    
    // Q3
    public int compareTo(Object obj) {
        PatientBill otherPatient = (PatientBill) obj;
        return name.compareTo(otherPatient.name);
        // same = 0; bigger > 0; small < 0
    }
}