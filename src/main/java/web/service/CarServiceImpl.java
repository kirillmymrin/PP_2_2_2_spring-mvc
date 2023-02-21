package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;


public class CarServiceImpl implements CarService {
    private static int PEOPLE_COUNT;
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Spyder", "Ferrari", ++PEOPLE_COUNT));
        carList.add(new Car("Quatroporte", "Maserati", ++PEOPLE_COUNT));
        carList.add(new Car("Aventador", "Lamborghini", ++PEOPLE_COUNT));
        carList.add(new Car("Italy", "Ferrari", ++PEOPLE_COUNT));
        carList.add(new Car("Diablo", "Lamborghini", ++PEOPLE_COUNT));
    }

    @Override
    public String toString() {
        return "CarDaoImpl{" +
                "carList=" + carList +
                '}';
    }

    @Override
    public List<Car> index() {
        return carList;
    }


}