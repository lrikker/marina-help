package ru.marinatimosh.app.service;

import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.repository.Repository;

import java.util.List;

public class Service {
    private final Repository repository = Repository.getInstance();
    private static final Service INSTANCE = new Service();

    public static Service getInstance() {
        return INSTANCE;
    }

    public void createCitizen() {
        Citizen citizen = new Citizen();
        repository.addCitizen(citizen);
    }

    public List<Citizen> getCitizens() {
        return repository.getCitizens();
    }

    private Service() {
    }
}
