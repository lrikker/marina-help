//Гражданин
package ru.marinatimosh.app.model;

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
    private String gender;

    public Citizen(){

    }

    //Конструктор гражданина
    public Citizen(int id, String name, String surname, int age, Country country, Region region, District district, City city) {
        this.id = idCount++;
        this.age = age;
        this.country = country;
        this.district = district;
        this.region = region;
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
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
