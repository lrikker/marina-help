package ru.marinatimosh.app.controller;
import java.util.Random;


public class DataGenerator {
    static String[] namesCitizen = {"Garcia", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Perez",
            "Sanchez", "Romero", "Torres", "Fernandez", "Diaz", "Ramirez", "Cruz", "Morales",
            "Rivera", "Reyes", "Jimenez", "Castillo", "Vasquez", "Guerrero"};

    static String[] surnamesCitizen = {"Garcia", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Perez",
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
        int index = random.nextInt(namesCitizen.length);
        return namesCitizen[index];
    }

    public static String generateSurname() {
        Random random = new Random();
        int index = random.nextInt(surnamesCitizen.length);
        return surnamesCitizen[index];
    }
}



