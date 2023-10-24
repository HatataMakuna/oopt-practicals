/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Name: Har Chun Wai
// Student ID: 20WMD02982
// Program: DCS2G5
public class ParkedCar {
    private String regNum;
    private int durationMinutes;
    
    public ParkedCar(String regNum, int durationMinutes) {
        this.regNum = regNum;
        this.durationMinutes = durationMinutes;
    }
    public int getDurationMinutes() {
        return durationMinutes;
    }
    public String toString() {
        return "Registration Number: " + regNum + "\nDuration: " + durationMinutes + " minute(s)\n";
    }
}
