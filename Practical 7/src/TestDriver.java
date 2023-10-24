/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class TestDriver {
    // Q1 (4)
    public static void main(String args[]) {
        TestDriver td = new TestDriver();
        PatientBill[] patientBills = {new OutPatientBill("Shawn", 200), new InPatientBill("Jason", 200, 100, 'S', 5)};
        selectionSort(patientBills);
        for (PatientBill patientBill : patientBills) {
            System.out.println(patientBill);
            System.out.println("Total Charges: " + patientBill.calculateTotalCharges());
        }
        double total = td.computeTotalCollection(patientBills);
        System.out.println("\nGrand Total: " + total);
    }
    
    public double computeTotalCollection(PatientBill[] patientBills) {
        double total = 0.0;
        for (PatientBill patientBill : patientBills) {
            total += patientBill.calculateTotalCharges();
        }
        return total;
    }
    
    // Q3
    public static PatientBill[] selectionSort(PatientBill[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int indexOfSmallest = i; // assign the first index of the subarray as the initial indexOfSmallest
            for (int j = i+1; j < arr.length; ++j) {
                if (arr[j].compareTo(arr[indexOfSmallest]) < 0) // if the current array element is smaller than the
                    indexOfSmallest = j; // element at indexOfSmallest, update indexOfSmallest
            }
            // swap the element at indexOfSmallest with the current subarray's first element
            PatientBill tempArr = arr[indexOfSmallest];
            arr[indexOfSmallest] = arr[i];
            arr[i] = tempArr;
        }
        return arr;
    }
}
