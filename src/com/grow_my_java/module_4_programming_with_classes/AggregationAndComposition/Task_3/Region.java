package com.grow_my_java.module_4_programming_with_classes.AggregationAndComposition.Task_3;

import java.util.ArrayList;
import java.util.List;

public class Region {

    private String regionName;
    private String regionCapital;
    private List<District> districts;

    public Region(String regionName, String regionCapital) {
        this.regionName = regionName;
        this.regionCapital = regionCapital;
        this.districts = new ArrayList<>();
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<City> districts) {
        this.districts = new ArrayList<>();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionCapital() {
        return regionCapital;
    }

    public void setRegionCapital(String regionCapital) {
        this.regionCapital = regionCapital;
    }

    public void addDistrict(District district) {
        districts.add(district);
    }

    public boolean removeDistrict(District district) {
        return districts.remove(district);
    }
}
