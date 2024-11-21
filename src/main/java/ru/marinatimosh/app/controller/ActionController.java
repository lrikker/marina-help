package ru.marinatimosh.app.controller;

import ru.marinatimosh.app.service.CitizenService;

public class ActionController {
    CitizenService citizenService;

    public void createCitizen(int count) {
        citizenService.createCitizen();
    }

    public void getCitizen() {
        citizenService.createCitizen();
    }
}
