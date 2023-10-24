/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class CommissionEmployee extends Employee {
    // Q3(2)
    private double grossSale;
    private double commissionRate;
    
    public CommissionEmployee(String name, int yearJoined, double basicSalary, double grossSale, double commissionRate) {
        super(name, yearJoined, basicSalary);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }
    
    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }
    public double getGrossSale() {
        return grossSale;
    }
    
    public void setCommissionRate(double comissionRate) {
        this.commissionRate = comissionRate;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    
    public double calculateSalary(double basicSalary) {
        return super.calculateSalary() + (grossSale * commissionRate);
    }
    public String toString() {
        return super.toString() + String.format("\nCross Sale: RM%.2f\nComission Rate: %.2f\n", grossSale, commissionRate);
    }
}