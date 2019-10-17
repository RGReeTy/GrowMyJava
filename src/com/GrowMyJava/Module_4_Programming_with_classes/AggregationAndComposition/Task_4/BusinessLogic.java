package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_4;

import java.util.Locale;

public class BusinessLogic {

    public void print(Invoice invoice) {
        java.util.Currency usd = java.util.Currency.getInstance("USD");
        java.text.NumberFormat format = java.text.NumberFormat.getCurrencyInstance(Locale.US);
        format.setCurrency(usd);

        System.out.println("Invoice " + invoice.getInvoiceID() + ", isBlocked =" + invoice.getIsBlocked() +
                ", amount = " + format.format(invoice.getAmount()));
    }


}
