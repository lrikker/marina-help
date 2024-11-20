package ru.marinatimosh.app;

import ru.marinatimosh.app.controller.ActionController;
import ru.marinatimosh.app.model.*;
import ru.marinatimosh.app.view.GeneralView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static Country country;
    public static ActionController controller = new ActionController();

    public static void main(String[] args) {
        controller.createCitizen(5);
        int averageCitizenAge = controller.getAverageCitizenAge();
        // сначала наполняем базу
        // 1 - создаем столицу
        country = Country.getInstance();

        // 2 - создаем граждан (не забываем в поле страны указать ссылку на country

        // 3 - собрали всех граждан в список

        // засетили в поле граждане страны наш список граждан

        //насоздавали города и сохранили их в список
        City capital = new City();
        country.setCapital(capital);
        // проставили ссылку на столицу


        final Scanner scanner = new Scanner(System.in);
        System.out.println("Это приложение про  Государство - " + country.getName() + ", выберите интересующую вас информацию:");
        System.out.println(" ");
        System.out.println("1. Вывести название  столицы");
        System.out.println("2. Вывести название и количество областей");
        System.out.println("3. Вывести название и количество  регионов");
        System.out.println("4. Вывести название и количество  городов");
        System.out.println("5. Вывести площадь государства");
        System.out.println("6. Вывести информацию количестве населения в государстве");
        System.out.println("7. Вывести список граждан начинающихся на букву __");
        System.out.println("8. Выход");
        System.out.println(" ");
        System.out.println("Введи  номер пункта:");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Выбран пункт 1");
                break;
            case 2:
                System.out.println("Выбран пункт 2");
                break;
            case 3:
                System.out.println("Выбран пункт 3");
                break;
            case 4:
                System.out.println("Выбран пункт 4");
                break;
            case 5:
                System.out.println("Выбран пункт 5");
                break;
            case 6:
                System.out.println("Выбран пункт 6");
                break;
            case 7:
                System.out.println("Выбран пункт 7");
                break;
            case 8:
                System.out.println("Выбран пункт 8");
                break;
            default:
                System.out.println("Такого пункта нет в программе");
        }

        //Country country = Country.getInstance();

        // Выводим название страны
      //  System.out.println("Название страны: " + country.getCountry());


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



