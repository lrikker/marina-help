//Тут будут хранится жители Государства
package ru.marinatimosh.app.repository;

import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.model.Country;

import java.util.List;

public class CitizenRepository {
    private static final Country country = Country.getInstance();
    private static final List<Citizen> citizens = country.getCitizens();


    public void save(Citizen citizen) {
        citizen.setCountry(country);
        citizens.add(citizen);
    }

    public List<Citizen> getCitizens() {
        return citizens;

    }
}
