/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class Payment {
    protected String receiptID;
    protected double purchaseAmount;

    public Payment(String receiptID, double purchaseAmount) {
        this.receiptID = receiptID;
        this.purchaseAmount = purchaseAmount;
    }
    public void setReceiptID(String receiptID) {
        this.receiptID = receiptID;
    }
    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
    public String getReceiptID() {
        return receiptID;
    }
    public double getPurchaseAmount() {
        return purchaseAmount;
    }
    public String displayInfo() {
        return "Receipt ID: " + receiptID + String.format("\nPurchase Amount: RM%.2f", purchaseAmount);
    }
}
