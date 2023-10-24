/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class Registration {
    // P4Q4(4)
    public String registrationNo;
    public Owner owner;
    public Car car;
    // private static int registrationCount = 1000;
    
    public Registration(String registrationNo, Owner owner, Car car) {
        this.registrationNo = registrationNo;
        this.owner = owner;
        this.car = car;
    }
    
    public String getRegistrationNo() {
        return registrationNo;
    }
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }
    
    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    
    @Override
    public String toString() {
        return String.format("%-10s %-24s %39s", registrationNo, owner, car);
    }
}
