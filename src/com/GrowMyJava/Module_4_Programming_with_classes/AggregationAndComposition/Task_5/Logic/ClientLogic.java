package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_5.Logic;

import com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_5.TourInfo.Tour;

import java.util.List;

public class ClientLogic {
    public static void sortTourByPrice(Agency agency) {

        int in, out;
        Tour temp;
        int h = 1;

        while (h <= agency.getTours().size() / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            for (out = h; out < agency.getTours().size(); out++) {
                temp = agency.getTours().get(out);
                in = out;
                while (in > h - 1 && agency.getTours().get(in - h).getPrice() >= temp.getPrice()) {
                    agency.getTours().set(in, agency.getTours().get(in - h));
                    in -= h;
                }
                agency.getTours().set(in, temp);
            }
            h = (h - 1) / 3;
        }
    }

    public static void printTours(List<Tour> tours) {

        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }
}
