package ru.marinatimosh.app.controller;

import ru.marinatimosh.app.service.CitizenService;

public class ActionController {
    CitizenService service;
    public void createCitizen(int count) {
        service.createCitizen();
    }


    public void getCitizens() {
        service.getCitizens();
    }

    public int getAverageCitizenAge() {
    }
}
