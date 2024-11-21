//тут будет создаваться житель
package ru.marinatimosh.app.service;

import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.repository.CitizenRepository;

import java.util.List;

public class CitizenService {

    private CitizenRepository citizenRepository;

    public CitizenService(CitizenRepository citizenRepository) {
        this.citizenRepository = citizenRepository;
    }

    public void createCitizen() {
        Citizen citizen = new Citizen();
        citizenRepository.save(citizen);
    }

    public List<Citizen> getCitizen() {
        return citizenRepository.getCitizens();
    }

    public List<Citizen> countCitizen() {
        return citizenRepository.getCitizens(); // Получаем список граждан из репозитория
    }

  /*  public List<Citizen> getAverageCitizenAge() {
        return citizenRepository.getCitizens();
    }*/



}
