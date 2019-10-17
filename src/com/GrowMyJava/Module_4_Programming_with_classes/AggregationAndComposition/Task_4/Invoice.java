package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_4;

import java.util.Locale;

public class Invoice {

    private int invoiceID;
    private double amount;
    private boolean isBlocked;

    public Invoice(int invoiceID, double amount, boolean isBlocked) {
        this.invoiceID = invoiceID;
        this.amount = amount;
        this.isBlocked = isBlocked;
    }

    public void print() {
        java.util.Currency usd = java.util.Currency.getInstance("USD");
        java.text.NumberFormat format = java.text.NumberFormat.getCurrencyInstance(Locale.US);
        format.setCurrency(usd);

        System.out.println("Invoice " + invoiceID + ", isBlocked =" + isBlocked +
                ", amount = " + format.format(amount));
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
