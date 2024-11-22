//Государство
package ru.marinatimosh.app.model;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private static final Country INSTANCE = new Country();
    private final String name;
    private  final  int area;

    private List<Citizen> citizens = new ArrayList<>();

    private final String capital;
    private List<Region> regions = new ArrayList<>();
    private List<District> districts = new ArrayList<>();
    private List<City> cities = new ArrayList<>();


    //добавить поля с областями


    private Country() {
        this.name = "Spain";
        this.capital = "Madrid";
        this.area = 506030;
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

    public String getCapital() {
        return capital;
    }


    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public int getArea() {
        return area;
    }
}