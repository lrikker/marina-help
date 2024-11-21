package ru.marinatimosh.app.view;

import ru.marinatimosh.app.model.Country;

import java.util.Scanner;

public class GeneralView {
    Country country = Country.getInstance();

    public void activateMainView() {
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
                System.out.println("Столица: ");
                break;
            case 2:
                System.out.println("Количество областей: ");
                break;
            case 3:
                System.out.println("Количество регионов: ");
                break;
            case 4:
                System.out.println("Количество городов: ");
                break;
            case 5:
                System.out.println("Площадь государства: ");
                break;
            case 6:
                System.out.println("Площадь государства: ");
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
    }

}
