//Тут будут хранится жители Государства
package ru.marinatimosh.app.repository;

import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.model.Country;

import java.util.ArrayList;
import java.util.List;

public class CitizenRepository {
    private static final CitizenRepository INSTANCE = new CitizenRepository();
    private static final Country country = Country.getInstance();
    private static List<Citizen> citizens = new ArrayList<>();

    public CitizenRepository() {
        citizens = new ArrayList<>();
    }

    public void save(Citizen citizen) {
        citizen.setCountry(country);
        citizens.add(citizen);
    }

    public List<Citizen> getCitizens() {
        return citizens;

    }

    public static CitizenRepository getInstance() {
        return INSTANCE;
    }
}
