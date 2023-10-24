/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class DriverCushion {
    public static void main(String[] args) {
        Cushion[] c = new Cushion[]{new LoungeCushion("LCS101", "Omnia Lagoon", 288.00, 25, 21, 44, 3), new RoundCushion("RCS103", "Sigmat", 66.99, 40, 16, 2)};
        
        for (Cushion cushion : c) {
            if (cushion instanceof LoungeCushion) {
                System.out.println("Lounge Cushion:\n===============");
            }
            else if (cushion instanceof RoundCushion) {
                System.out.println("Round Cushion:\n==============");
            }
            System.out.println(cushion + "\n");
        }
        
        System.out.println("Process completed.");
    }
}
