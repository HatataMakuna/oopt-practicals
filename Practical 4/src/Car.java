/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class Car {
    // P4Q4(2)
    private String carPlateNum;
    private String color;
    private int year;
    private CarType carType;
    
    public Car(String carPlateNum, String color, int year, CarType carType) {
        this.carPlateNum = carPlateNum;
        this.color = color;
        this.year = year;
        this.carType = carType;
    }
    
    public String getCarPlateNum() {
        return carPlateNum;
    }
    public void setCarPlateNum(String carPlateNum) {
        this.carPlateNum = carPlateNum;
    }
    
    public String getColor() {
        return color;
    }
    public void setCoor(String color) {
        this.color = color;
    }
    
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    public CarType getCarType() {
        return carType;
    }
    public void setCarType(CarType carType) {
        this.carType = carType;
    }
    
    @Override
    public String toString() {
        return String.format("%-10s %-8s %-6s %-15s", carPlateNum, color, year, carType);
    }
}
