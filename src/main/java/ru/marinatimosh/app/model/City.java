//Город
package ru.marinatimosh.app.model;

public class City {
    private String name;
    private int code;
    private int population;
    private int area;
    private String status;

    //вместо стринги статус завести булин свойство является ли столицей

    public City(){

    }

    public City(String name, int code, int population, int area, String status) {
        this.name = name;
        this.code = code;
        this.population = population;
        this.area = area;
        this.status = status;
    }
}
