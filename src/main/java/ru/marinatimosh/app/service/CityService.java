package ru.marinatimosh.app.service;

import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.model.City;
import ru.marinatimosh.app.repository.CitizenRepository;
import ru.marinatimosh.app.repository.CityRepository;

import java.util.List;

public class CityService {

        private CityRepository cityRepository;

        public CityService(CityRepository cityRepository) {
            this.cityRepository = cityRepository;
        }


        public String[] getCity() {
            return cityRepository.getNameCity();
        }

        public String[] countCity() {
            return cityRepository.getNameCity();
        }

    }


