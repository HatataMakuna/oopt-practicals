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
    // Q1 (1/2)
    
    private String name;
    private double salary;
    // (a)
    // String name
    // double salary;
    
    // (c)
    public Employee() {
        this.name = "";
        this.salary = 0.0;
    }
    
    public Employee(String name) {
        this.name = name;
        this.salary = 0.0;
    }
    
    // use public in (b)
    // (c): 
    // - change employyeName -> name; currentSalary -> salary
    // - this.name = name; this.salary = salary
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    // for (a) and (b) only:
    //Employee() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    void raiseSalary(double percent){
        salary = salary + (salary * percent / 100.0);
    }
    // (b)
    public void setName(String name) {
        this.name = name;
    }
    // (c)
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // (b)
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
