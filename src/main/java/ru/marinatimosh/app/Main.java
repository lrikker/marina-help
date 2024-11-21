package ru.marinatimosh.app;

import ru.marinatimosh.app.controller.ActionController;
import ru.marinatimosh.app.model.*;
import ru.marinatimosh.app.repository.CitizenRepository;
import ru.marinatimosh.app.view.GeneralView;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Country country;
        CitizenRepository citizenRepository = new CitizenRepository();
        ActionController actionController = new ActionController(citizenRepository); // Теперь передаем репозиторий

        actionController.createCitizen(100000);

        List<Citizen> citizens = actionController.getCitizen();


        for (Citizen citizen : citizens) {
            System.out.println("ID: " + citizen.getId());
            System.out.println("Имя: " + citizen.getName());
            System.out.println("Фамилия: " + citizen.getSurname());
            System.out.println("Возраст: " + citizen.getAge());
        }


        System.out.println("Список граждан:");
        for (Citizen citizen : citizens) {
            System.out.println(citizen);
        }


        List<Citizen> countedCitizens = actionController.countCitizen();
        System.out.println("Количество граждан: " + countedCitizens.size());
        GeneralView generalView = new GeneralView();

        generalView.activateMainView();


    }
}
