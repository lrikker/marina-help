//Гражданин
package ru.marinatimosh.app.model;

import ru.marinatimosh.app.controller.DataGenerator;

import javax.annotation.processing.Generated;

public class Citizen {
    private static int idCount = 0; //Счетчик id
    private long id; // Уникальный идентификатор гражданина, целое полож. число
    private String name;
    private String surname;
    private int age;
    private Country country;
    private String gender;

    public Citizen(){
        this.id = idCount++;
        this.age = DataGenerator.generateAge();
    }

    //Конструктор гражданина
    public Citizen(int id, String name, String surname, int age, Country country) {
        this.id = idCount++;
        this.age = age;
        this.country = country;
        this.name = name;
        this.surname = surname;
    }

    public Citizen(Country country, Region region, District district, City city) {
        this.id = idCount++;
        this.age = generateAge();
        // в методах generateAge() вызывать утилитный класс DataGenerator
        //todo: то же самое для других полей которые должны быть сгенерированы
        this.country = country;
    }

    //удалить лишние сеттеры

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Citizen.idCount = idCount;
    }
}
