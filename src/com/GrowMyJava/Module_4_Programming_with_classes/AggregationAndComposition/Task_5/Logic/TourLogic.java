package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_5.Logic;

import com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_5.TourInfo.*;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class TourLogic {
    public static List<Tour> selectToursByTypeOfTour(Agency agency) {

        List<Tour> tours = new ArrayList<>();

        for (Tour tour : agency.getTours()) {
            tours.add(tour);
        }
        return tours;
    }

    public static List<Tour> selectByOptions(Agency agency, Food food, Transport transport, int duration) {

        List<Tour> tours = new ArrayList<>();

        for (Tour tour : agency.getTours()) {
            if (tour.getFood() == food && tour.getTransport() == transport
                    && tour.getDuration().equals(Period.ofDays(duration))) {
                tours.add(tour);
            }
        }
        return tours;
    }
}
