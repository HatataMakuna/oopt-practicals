/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class Cushion {
    // EE (1)
    private String id;
    private String brand;
    private double price;
    private int quantity;
    
    public Cushion(String id, String brand, double price, int quantity) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    
    @Override
    public String toString() {
        return String.format("ID: %s\nBrand: %s\nPrice: RM%.2f\nQuantity: %d", id, brand, price, quantity);
    }
}
