/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class CarType {
    // P4Q4(3)
    private String model;
    private double engineCapacity;
    private String make;
    
    public CarType(String model, double engineCapacity, String make) {
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    
    public double getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    
    @Override
    public String toString() {
        return String.format("%-10s %-8s %5.1f", make, model, engineCapacity);
    }
}
