//Государство
package ru.marinatimosh.app.model;

public class Country {
    private static Country country; // создается экземпляр класса Singleton
    private String name; //
    private int population;
    private int area;


    //Приватный пустой конструктор:
    private Country() {

    }

    //Приватный  конструктор:
    private Country(String name) {
        this.name = name;
    }

    // Метод для получения экземпляра класса
    public static Country getCountry(String name) {
        if (country == null) {
            country = new Country(name);
        }
        return country;
    }

    public String getNameCountry() {
        return name;
    }

    public void setNameCountry(String name) {
        this.name = name;
    }

    public int getPopulationCountry() {
        return population;
    }

    public void setPopulation(int population){
        this.population = population;
    }

    public int getArea(){
        return area;
    }

    public void setArea(int area){
        this.area = area;
    }

}
