package com.grow_my_java.module_4_programming_with_classes.AggregationAndComposition.Task_5.Logic;

import com.grow_my_java.module_4_programming_with_classes.AggregationAndComposition.Task_5.TourInfo.Tour;

import java.util.ArrayList;
import java.util.List;

public class Agency {
    private String name;
    private List<Tour> tours;
    private List<Client> clients;
    private List<Order> orders;

    public Agency(String name) {
        this.name = name;
        tours = new ArrayList<>();
        clients = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public boolean addOrder(Order order) {
        return orders.add(order);
    }

    public boolean addTour(Tour tour) {
        return tours.add(tour);
    }

    public boolean addClient(Client client) {
        return clients.add(client);
    }

    @Override
    public String toString() {
        return "Agency \"" + name + '\"';
    }
}
