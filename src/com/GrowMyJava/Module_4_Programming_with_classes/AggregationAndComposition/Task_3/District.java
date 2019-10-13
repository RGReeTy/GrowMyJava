package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_3;

import java.util.ArrayList;
import java.util.List;

public class District {

    private String districtName;
    private int numberOfCities;
    private double squareOfDistrict;
    private List<City> cities;


    public District(String districtName, int numberOfCities, double squareOfDistrict) {
        this.districtName = districtName;
        this.numberOfCities = numberOfCities;
        this.squareOfDistrict = squareOfDistrict;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = new ArrayList<>();
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public int getNumberOfCities() {
        return numberOfCities;
    }

    public void setNumberOfCities(int numberOfCities) {
        this.numberOfCities = numberOfCities;
    }

    public double getSquareOfDistrict() {
        return squareOfDistrict;
    }

    public void setSquareOfDistrict(double squareOfDistrict) {
        this.squareOfDistrict = squareOfDistrict;
    }


    public boolean addCity(City city) {
        return cities.add(city);
    }

    public boolean removeCity(City city) {
        return cities.remove(city);
    }

    public void printSentence() {
        for (City city : cities) {
            System.out.print(city + " ");
        }
    }
}
