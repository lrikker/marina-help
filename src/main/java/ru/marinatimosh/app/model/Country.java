//Государство
package ru.marinatimosh.app.model;

public class Country {
    private static final Country INSTANCE = new Country();
    private final String name;


    private Country() {
        this.name = "Испания"; // Задайте название страны
    }

    public static Country getInstance() {
        return INSTANCE;
    }

    public String getName() {
        return name;
    }
}


