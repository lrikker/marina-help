//Государство
package ru.marinatimosh.app.entity;

public class Country {
    private static Country country; // создается экземпляр класса Singleton
    private String name; //
    private  int population;
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

    //Геттер получения названия Государства
    public String getNameCountry() {
        return name;
    }

    //Геттер получения численности населения Государства
    public int getPopulationCountry() {
        return population;
    }

}
