package ru.marinatimosh.app.controller;

import ru.marinatimosh.app.model.Citizen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class DataGenerator {
    static String[] names = {"Garcia", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Perez",
            "Sanchez", "Romero", "Torres", "Fernandez", "Diaz", "Ramirez", "Cruz", "Morales",
            "Rivera", "Reyes", "Jimenez", "Castillo", "Vasquez", "Guerrero"};

    static String[] surnames = {"Garcia", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Perez",
            "Sanchez", "Romero", "Torres", "Fernandez", "Diaz", "Ramirez", "Cruz", "Morales",
            "Rivera", "Reyes", "Jimenez", "Castillo", "Vasquez", "Guerrero"};


    public static int generateAge() {
        int min = 18;
        int max = 95;
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static String generateName() {
        Random random = new Random();
        int index = random.nextInt(names.length); // Генерируем случайный индекс
        return names[index];
    }

    public static String generateSurname() {
        Random random = new Random();
        int index = random.nextInt(surnames.length); // Генерируем случайный индекс
        return surnames[index];
    }
}



