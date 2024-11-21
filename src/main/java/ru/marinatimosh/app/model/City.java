//Город
package ru.marinatimosh.app.model;

public class City {
    private String name;
    private int code;
    private int population;
    private int area;
    private Boolean status;

    public City(){

    }

    public City(String name, int code, int population, int area, boolean status) {
        this.name = name;
        this.code = code;
        this.population = population;
        this.area = area;
        this.status = status;
    }
}
