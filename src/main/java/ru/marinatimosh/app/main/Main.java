package ru.marinatimosh.app.main;

import ru.marinatimosh.app.model.*;
import ru.marinatimosh.app.view.GeneralView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Citizen citizen = new Citizen(); // Создаем нового гражданина
        System.out.println("ID : " + citizen.getId());
        System.out.println("Возраст: " + citizen.getAge());
        System.out.println("Имя: " + citizen.getName());
        System.out.println("Фамилия: " + citizen.getSurname());


        GeneralView generalView = new GeneralView();
        generalView.activateMainView();


       /* private List<Region> regionsList = new ArrayList<>();
        private List<District> districtsList = new ArrayList<>();
        private List<City> citiesList = new ArrayList<>();
        private List<Citizen> citizensList = new ArrayList<>();


        Country country = new Country("Страна");
        Region region = new Region("Регион");
        District district = new District("Район");
        City city = new City("Город");

        private static List<Citizen> citizensList = new ArrayList<>();

        static String[] names = {"Алиса ", "Алла", "Мария", "Михаил", "Роман", "Федор", "Виталий", "Надежда", "Светлана", "Максим"};
        static String[] surnames = {"Архипов", "Логинов", "Некрасов", "Краснов", "Буров", "Федоров", "Попов", "Баранов", "Mур", "Мастеров"};

        for (int i = 0; i < 10; i++) {
            String name = names[i % names.length];      // Циклический переход по списку имен
            String surname = surnames[i % surnames.length]; // Циклический переход по списку фамилий
            int age = 18 + (i % 43); // Возраст от 18 до 60

            Citizen citizen = new Citizen(name, surname, age, country, region, district, city);
            citizensList.add(citizen);
        }


        // Выводим граждан для проверки
        for (Citizen citizen : citizensList) {
            System.out.println(citizen);*/






        }
    }

