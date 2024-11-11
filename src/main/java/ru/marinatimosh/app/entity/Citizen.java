//Гражданин
package ru.marinatimosh.app.entity;

public class Citizen {
    private static int idCount = 0; //Счетчик id
    private int id; // Уникальный идентификатор гражданина, целое полож. число
    private String name;
    private String surname;
    private int age;
    private Country country;
    private Region region;
    private District district;
    private City city;

//Конструктор гражданина
    public Citizen(int id, String name, String surname, int age, Country country, Region region, District district, City city ) {
        idCount++;
        this.id = idCount;
        this.age = age;
        this.country = country;
        this.district = district;
        this.region = region;
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

//Геттер получения id
    public int getId() {
        return id;
    }
}
