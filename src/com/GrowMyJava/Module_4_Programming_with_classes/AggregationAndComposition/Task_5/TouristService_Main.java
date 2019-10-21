package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_5;

import com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_5.Logic.*;
import com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_5.TourInfo.*;

import javax.xml.crypto.KeySelector;
import java.time.Period;
import java.util.List;

public class TouristService_Main {
    //5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
    //различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
    //возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
    public static void main(String[] args) {

        Agency agency = new Agency("ZaborStroyTravel");

        Client client = new Client("Ivan", "Boss");

        agency.addClient(client);

        Tour thai = new Tour("Thailand", "Hot tour", TypeOfTour.RECREATION,
                Transport.PLANE, Food.BREAKFAST, Period.ofDays(14), 800);
        Tour spain = new Tour("Spain", "Carnaval", TypeOfTour.RECREATION,
                Transport.PLANE, Food.BREAKFAST, Period.ofDays(9), 1300);
        Tour egypt = new Tour("Egypt", "Hot tour", TypeOfTour.EXCURSION,
                Transport.PLANE, Food.ALL_INCLUSIVE, Period.ofDays(11), 750);
        Tour india = new Tour("India", "Hot tour", TypeOfTour.TREATMENT,
                Transport.PLANE, Food.ALL_INCLUSIVE, Period.ofDays(7), 1111);
        Tour italy = new Tour("Italy", "Hot tour", TypeOfTour.SHOPPING,
                Transport.TRAIN, Food.NONE, Period.ofDays(3), 380);
        Tour world = new Tour("OVER THE WORLD", "BEST CRUISE", TypeOfTour.CRUISE,
                Transport.SHIP, Food.ALL_INCLUSIVE, Period.ofDays(30), 5000);

        agency.addTour(thai);
        agency.addTour(spain);
        agency.addTour(egypt);
        agency.addTour(india);
        agency.addTour(italy);
        agency.addTour(world);

        ClientLogic.sortTourByPrice(agency);

        System.out.println("Sort tours by price: ");
        ClientLogic.printTours(agency.getTours());

        List<Tour> selectByOptions = TourLogic.selectByOptions(agency, Food.ALL_INCLUSIVE, Transport.PLANE, 7);

        System.out.println("List tours by food, transport and duration options: ");
        ClientLogic.printTours(selectByOptions);

        List<Tour> toursByPurpose = TourLogic.selectToursByTypeOfTour(agency);

        System.out.println("List tours by purposes: ");
        ClientLogic.printTours(toursByPurpose);

        agency.addOrder(new Order(client, india));

    }
}