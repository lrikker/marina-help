package ru.marinatimosh.app.view;

import ru.marinatimosh.app.controller.ActionController;
import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.model.Country;
import ru.marinatimosh.app.repository.CitizenRepository;

import java.util.List;
import java.util.Scanner;

public class GeneralView {
    Country country = Country.getInstance();
    CitizenRepository citizenRepository = new CitizenRepository();
    ActionController actionController = new ActionController(citizenRepository);

    public void activateMainView() {
        final Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Это приложение про Государство - " + country.getName() + ", выберите интересующую вас информацию:");
            System.out.println(" ");
            System.out.println("1. Вывести название столицы");
            System.out.println("2. Вывести название и количество областей");
            System.out.println("3. Вывести название и количество регионов");
            System.out.println("4. Вывести название и количество городов");
            System.out.println("5. Вывести площадь государства");
            System.out.println("6. Вывести информацию о количестве населения в государстве");
            System.out.println("7. Вывести список граждан, начинающихся на букву __");
            System.out.println("8. Выход");
            System.out.println(" ");
            System.out.println("Введите номер пункта:");

            num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Столица: " + country.getCapital()); // Предполагается метод getCapital()
                    break;
                case 2:
                    System.out.println("Количество областей: "); //  country.getRegionCount()
                    break;
                case 3:
                    System.out.println("Количество регионов: "); // нужно добавить getDistrictCount()
                    break;
                case 4:
                    System.out.println("Количество городов: "); // нужно добавить  getCityCount()
                    break;
                case 5:
                    System.out.println("Площадь государства: "); //  getArea()
                    break;
                case 6:
                    List<Citizen> countedCitizens = actionController.countCitizen();
                    System.out.println("Количество граждан: " + countedCitizens.size());
                    float averageAge = actionController.countAverageCitizenAge();
                    System.out.println("Средний возраст населения: " + averageAge);
                    break;
                case 7:
                    System.out.println("Введите букву для поиска граждан:");
                    String letter = scanner.next();
                    // не забыть добавить в логику поиск по букве + сортировка
                    break;
                case 8:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Такого пункта нет в программе");
            }
        } while (num != 8);

        scanner.close();
    }

}
