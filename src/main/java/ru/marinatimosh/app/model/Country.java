//Государство
package ru.marinatimosh.app.model;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private static final Country INSTANCE = new Country();
    private final String name;

    private List<Citizen> citizens = new ArrayList<>();

    private City capital;
    private List<Region> regions;

    //добавить поля с областями


    private Country() {
        this.name = "Испания";
        //добавить объекты регионов и засунуть в лист regions
    }

    public static Country getInstance() {
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void setCitizens(List<Citizen> citizens) {
        this.citizens = citizens;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
}