//Область
package ru.marinatimosh.app.model;

public class Region {
    private String name;
    private int code;
    private int population;
    private int area;

    //массив районов

    public Region(){

    }

    public Region(String name, int code, int population, int area) {
        this.name = name;
        this.code = code;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }


}
