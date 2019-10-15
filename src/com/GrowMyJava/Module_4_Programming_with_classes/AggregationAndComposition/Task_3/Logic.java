package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_3;

public class Logic {
    //CITY BLOCK
    public void printCityInfo(City city) {
        System.out.println("The city " + city.getCityName() + " has a population of " + city.getPopulation() + " people.");
    }

    //--------------------------------------------------------------------------------
    // DISTRICT BLOCK
    public void printDistrictInfo(District district) {
        System.out.println("District " + district.getDistrictName() + " has total population " +
                totalPopulationOfDistrict(district) + " and total square " +
                district.getSquareOfDistrict() + ".");
    }

    public int totalPopulationOfDistrict(District district) {
        int totalPopulation = 0;
        for (City city : district.getCities()) {
            totalPopulation += city.getPopulation();
        }
        return totalPopulation;
    }

    //--------------------------------------------------------------------------------
    // REGION BLOCK
    public void printRegionInfo(Region region) {
        System.out.println("Region " + region.getRegionName() + " has total population " +
                totalPopulationOfRegion(region) + " and total square " +
                totalSquareOfRegion(region) + ". The capital of region - " + region.getRegionCapital());
    }

    public int totalPopulationOfRegion(Region region) {
        int totalPopulation = 0;
        for (District district : region.getDistricts()) {
            totalPopulation += totalPopulationOfDistrict(district);
        }
        return totalPopulation;
    }

    public double totalSquareOfRegion(Region region) {
        double totalSquare = 0;
        for (District district : region.getDistricts()) {
            totalSquare += district.getSquareOfDistrict();
        }
        return totalSquare;
    }

    //--------------------------------------------------------------------------------
    // Country/government BLOCK
    public void printCountyInfo(Goverment goverment) {
        System.out.println("Country " + goverment.getCountryName() + " has capital - " + goverment.getCapitalOfCountry() +
                ". County has " + goverment.getRegions().size() + " regions. Names of region's centres are: " +
                getCapitalsOfRegions(goverment) + " Total square is " + totalSquareOfCountry(goverment));
    }

    public String getCapitalsOfRegions(Goverment goverment) {
        for (Region region : goverment.getRegions()) {
            System.out.print(region.getRegionCapital());
        }
        return "";
    }

    public double totalSquareOfCountry(Goverment goverment) {
        double totalSquare = 0;
        for (Region region : goverment.getRegions()) {
            totalSquare += totalSquareOfRegion(region);
        }
        return totalSquare;
    }

}
