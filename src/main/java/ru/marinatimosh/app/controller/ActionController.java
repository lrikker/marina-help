package ru.marinatimosh.app.controller;

import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.repository.CitizenRepository;
import ru.marinatimosh.app.service.CitizenService;
import ru.marinatimosh.app.service.CityService;

import java.util.List;


public class ActionController {
    private CitizenService citizenService;
    private CityService cityService;

    public ActionController(CitizenRepository citizenRepository
            //, CityRepository cityRepository
    ) {
        citizenService = new CitizenService(citizenRepository);
        //cityService = new CityService(cityRepository);
    }

    public ActionController() {

    }

    public void createCitizen(int count) {
        for (int i = 0; i < count; i++) {
            citizenService.createCitizen();
        }
    }

    public List<Citizen> getCitizen() {
        return citizenService.getCitizen();

    }

    public int getCitizensAmount() {
        return citizenService.countCitizen();
    }

    public int countAverageCitizenAge() {
        return citizenService.countAverageCitizenAge();
    }


    public String[] getCity() {
        return cityService.getCity();
    }

    public void printCityNames() {
        System.out.println("Cities in Spain:");
        String[] cities = cityService.getCity(); // Получаем массив городов один раз

        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println("Total number of cities: " + cities.length); // Используем длину массива
    }





}
