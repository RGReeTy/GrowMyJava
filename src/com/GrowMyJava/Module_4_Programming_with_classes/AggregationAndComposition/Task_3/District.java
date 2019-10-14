package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_3;

import java.util.ArrayList;
import java.util.List;

public class District {

    private String districtName;
    private double squareOfDistrict;
    private List<City> cities;


    public District(String districtName, double squareOfDistrict) {
        this.districtName = districtName;
        this.squareOfDistrict = squareOfDistrict;
        this.cities = new ArrayList<>();
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

    public double getSquareOfDistrict() {
        return squareOfDistrict;
    }

    public void setSquareOfDistrict(double squareOfDistrict) {
        this.squareOfDistrict = squareOfDistrict;
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean removeCity(City city) {
        return cities.remove(city);
    }

}
