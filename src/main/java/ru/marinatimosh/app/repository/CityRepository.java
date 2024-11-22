package ru.marinatimosh.app.repository;

import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.model.City;

import java.util.List;



public class CityRepository {

    static  String[] nameCity = {"Madrid", "Barcelona", "Valencia", "Seville", "Zaragoza",
            "Malaga", "Bilbao", "Cordoba", "Granada", "Toledo", "Alicante", "Cádiz",
            "Murcia", "Pamplona", "San Sebastián", "Salamanca", "Santiago de Compostela",
            "Oviedo", "Gijón", "Logroño", "Albacete", "Burgos", "Leon", "Almería", "Huelva",
            "Tarragona", "Cuenca"};

    public String[] getNameCity() {
        return nameCity;

    }

}
