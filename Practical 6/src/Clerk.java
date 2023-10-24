/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class Clerk extends Employee {
    // Q3 (3)
    private double allowance;
    private int overtimeHours;
    private static double overtimeRate;
    public Clerk(String name, int yearJoined, double basicSalary, double allowance, int overtimeHours) {
        super(name, yearJoined, basicSalary);
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
    }
    
    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    public double getAllowance() {
        return allowance;
    }
    
    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    public double getOvertimeHours() {
        return overtimeHours;
    }
    
    public double calculateSalary(double basicSalary) {
        return super.calculateSalary() + allowance + (overtimeHours * overtimeRate);
    }
    public String toString() {
        return super.toString() + String.format("\nAllowance: RM%.2f\nOvertime Hours: %d\nOvertime Rate: RM%.2f", allowance, overtimeHours, overtimeRate);
    }
}
