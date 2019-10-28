package com.grow_my_java.module_4_programming_with_classes.AggregationAndComposition.Task_4;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int clientID;
    private String clientsNameSurname;
    private List<Invoice> invoices;

    public Client(int clientID, String clientsNameSurname) {
        this.clientID = clientID;
        this.clientsNameSurname = clientsNameSurname;
        this.invoices = new ArrayList<>();
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientsNameSurname() {
        return clientsNameSurname;
    }

    public void setClientsNameSurname(String clientsNameSurname) {
        this.clientsNameSurname = clientsNameSurname;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public boolean removeInvoice(Invoice invoice) {
        return invoices.remove(invoice);
    }

}
