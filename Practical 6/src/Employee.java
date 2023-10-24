/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class Employee {
    // Q3(1)
    private String name;
    private int yearJoined;
    private double basicSalary;
    
    public Employee(String name, int yearJoined, double basicSalary) {
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }
    public int getYearJoined() {
        return yearJoined;
    }
    
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    
    public double calculateSalary() {
        return basicSalary;
    }
    public String toString() {
        return String.format("Name: %s\nYear Joined: %d\nBasic Salary: RM%.2f", name, yearJoined, basicSalary);
    }
}