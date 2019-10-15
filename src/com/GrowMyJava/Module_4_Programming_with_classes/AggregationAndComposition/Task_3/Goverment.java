package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_3;

import java.util.ArrayList;
import java.util.List;

public class Goverment {

    private String countryName;
    private String capitalOfCountry;
    private List<Region> regions;

    public Goverment(String countryName, String capitalOfCountry) {
        this.countryName = countryName;
        this.capitalOfCountry = capitalOfCountry;
        this.regions = new ArrayList<>();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapitalOfCountry() {
        return capitalOfCountry;
    }

    public void setCapitalOfCountry(String capitalOfCountry) {
        this.capitalOfCountry = capitalOfCountry;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = new ArrayList<>();
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public boolean removeRegion(Region region) {
        return regions.remove(region);
    }
}
