/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class CashPayment extends Payment {
    private String receipttID;
    private double purchaseAmountt;
    private final double discountRate = 0.02;
    private static double grandTotal;
    public CashPayment(String receiptID, double purchaseAmount) {
        super(receiptID, purchaseAmount);
    }
    @Override
    public void setReceiptID(String receiptID) {
        this.receipttID = receiptID;
    }
    @Override
    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmountt = purchaseAmount;
    }
    @Override
    public String getReceiptID() {
        return receipttID;
    }
    @Override
    public double getPurchaseAmount() {
        return purchaseAmountt;
    }
    public void calcGrandTotal() {
        grandTotal = purchaseAmountt * (1 - discountRate);
    }
    @Override
    public String displayInfo() {
        calcGrandTotal();
        return super.displayInfo() + String.format("\nGrand Total: RM%.2f", grandTotal);
    }
}
