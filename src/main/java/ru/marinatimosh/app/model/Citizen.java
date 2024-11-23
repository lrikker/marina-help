//Гражданин
package ru.marinatimosh.app.model;

import ru.marinatimosh.app.controller.DataGenerator;

import static ru.marinatimosh.app.controller.DataGenerator.*;

public class Citizen {
    private static int idCount = 1; //Счетчик id
    private long id;
    private String name;
    private String surname;
    private int age;
    private Country country;
    private  Region region;
    private District district;
    private City city;

    public Citizen(){
        this.id = idCount++;
        this.age = generateAge();
        this.name = generateName();
        this.surname = generateSurname();
    }

    public Citizen(Country country, Region region, District district, City city) {
        this.id = idCount++;
        this.age = generateAge();
        this.name = generateName();
        this.surname = generateSurname();
        this.country = country;
        this.region = region;
        this.district = district;
        this.city = city;
    }


/*    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public District getDistrict() {
        return district;
    }


    public Region getRegion() {
        return region;
    }*/


    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    public int getAge() {
        return age;
    }

/*    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }*/

    @Override
    public String toString() {
        return "Citizen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
