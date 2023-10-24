/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class Owner {
    // P4Q4(1)
    private String name;
    private String icNum;
    
    public Owner(String name, String icNum) {
        this.name = name;
        this.icNum = icNum;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getIcNum() {
        return icNum;
    }
    public void setIcNum(String icNum) {
        this.icNum = icNum;
    }
    
    @Override
    public String toString() {
        return String.format("%-15s %-10s", name, icNum);
    }
}
