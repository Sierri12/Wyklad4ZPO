package edu.ib;

public class Invoice implements Payable {
    private final String partID;
    private final double pricePerItem;
    private final int quantity;

    public Invoice(String partID, double pricePerItem, int quantity) {
        this.partID = partID;
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "partID='" + partID + '\'' +
                ", pricePerItem=" + pricePerItem +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return quantity*pricePerItem;
    }
}
