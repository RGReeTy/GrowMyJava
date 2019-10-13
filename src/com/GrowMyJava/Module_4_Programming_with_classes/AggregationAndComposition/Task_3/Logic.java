package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_3;

public class Logic {

    public void printCityInfo(City city) {
        System.out.println("The city " + city.getCityName() + " has a population of " + city.getPopulation() + " people.");
    }

    public void printDistrictInfo(District district) {
        System.out.println("District " + district.getDistrictName() + " has " + district.getNumberOfCities() +
                " cities with total population " + totalPopulationOfDistrict(district) + " and total square " +
                district.getSquareOfDistrict() + ".");
    }

    private int totalPopulationOfDistrict(District district) {
        int totalPopulation = 0;
        for (City city : district.getCities()) {
            totalPopulation += city.getPopulation();
        }
        return totalPopulation;
    }


}
