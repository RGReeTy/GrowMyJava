package com.grow_my_java.module_4_programming_with_classes.AggregationAndComposition.Task_4;

import java.util.Locale;

public class BusinessLogic {

    public void printInvoiceInfo(Invoice invoice) {
        java.util.Currency usd = java.util.Currency.getInstance("USD");
        java.text.NumberFormat format = java.text.NumberFormat.getCurrencyInstance(Locale.US);
        format.setCurrency(usd);

        System.out.println("Invoice " + invoice.getInvoiceID() + ", isBlocked = " + invoice.getIsBlocked() +
                ", amount = " + format.format(invoice.getAmount()));
    }

    public void printClientInfo(Client client) {
        System.out.println("Client № " + client.getClientID() + " " + client.getClientsNameSurname() +
                " has next invoices = ");
        getInvoicesInfo(client);
    }

    public void getInvoicesInfo(Client client) {
        client.getInvoices().forEach(this::printInvoiceInfo);
    }

    public void getAllAmounts(Client client) {
        double sum = 0;
        for (Invoice invoice : client.getInvoices()) {
            sum += invoice.getAmount();
        }
        String formattedDouble = String.format("%.2f", sum);
        System.out.println("Total amount is $" + formattedDouble);
    }

    public void getPlusAndMinusAmounts(Client client) {
        double sumPlus = 0;
        double sumMinus = 0;
        for (Invoice invoice : client.getInvoices()) {
            if (invoice.getAmount() >= 0) {
                sumPlus += invoice.getAmount();
            } else {
                sumMinus += invoice.getAmount();
            }
        }
        String formattedDoubleMinus = String.format("%.2f", sumMinus);
        String formattedDoublePlus = String.format("%.2f", sumPlus);
        System.out.println("Positive balance is $" + formattedDoublePlus + ".\n Negative balance is $" + formattedDoubleMinus);
    }
}
