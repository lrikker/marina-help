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

    public int countCitizen() {
        List<Citizen> citizens = citizenRepository.getCitizens();
        return citizens.size();
    }


    public int countAverageCitizenAge() {
        List<Citizen> citizens = citizenRepository.getCitizens();

        if (citizens == null || citizens.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (Citizen citizen : citizens) {
            sum += citizen.getAge();
        }

        return (int) sum / citizens.size();
    }


}
