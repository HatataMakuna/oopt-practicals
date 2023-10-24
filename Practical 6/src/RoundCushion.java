/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class RoundCushion extends Cushion {
    // EE (3)
    private int diameter;
    private int thickness;
    
    public RoundCushion(String id, String brand, double price, int quantity, int diameter, int thickness) {
        super(id, brand, price, quantity);
        this.diameter = diameter;
        this.thickness = thickness;
    }
    
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public int getDiameter() {
        return diameter;
    }
    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
    public int getThickness() {
        return thickness;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nDiameter: " + diameter + " cm\nThickness: " + thickness + " cm";
    }
}
