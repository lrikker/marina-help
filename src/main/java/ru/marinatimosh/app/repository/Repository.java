package ru.marinatimosh.app.repository;

import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.model.Country;

import java.util.List;

public class Repository {
    private final Country country = Country.getInstance();
    private static final Repository INSTANCE = new Repository();

    public static Repository getInstance() {
        return INSTANCE;
    }

    private Repository() {
    }

    public void addCitizen(Citizen citizen) {
        country.addCitizen(citizen);
    }

    public List<Citizen> getCitizens() {
        return country.getCitizens();
    }

}
