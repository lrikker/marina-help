package ru.marinatimosh.app.service;

import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.repository.CitizenRepository;

public class CitizenService {
    CitizenRepository citizenRepository;

    public void createCitizen() {
        Citizen citizen = new Citizen();
        citizenRepository.save(citizen);
    }

    public void getCitizens() {
        citizenRepository.getCitizens();
        //
    }
}
