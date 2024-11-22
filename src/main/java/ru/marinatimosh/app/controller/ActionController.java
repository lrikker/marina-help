package ru.marinatimosh.app.controller;

import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.repository.CitizenRepository;
import ru.marinatimosh.app.service.CitizenService;

import java.util.List;

public class ActionController {
    private CitizenService citizenService;

    public ActionController(CitizenRepository citizenRepository) {
        citizenService = new CitizenService(citizenRepository); // Передаем репозиторий
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

    public List<Citizen> countCitizen() {
        return citizenService.countCitizen();
    }

    public int countAverageCitizenAge() {
        return citizenService.countAverageCitizenAge();
    }


}
