package ru.marinatimosh.app.controller;

import ru.marinatimosh.app.service.Service;

public class Controller {
    private final Service service = Service.getInstance();
    private static final Controller INSTANCE = new Controller();

    public static Controller getInstance() {
        return INSTANCE;
    }

    public int getN(){
        return 4;
    }

}
