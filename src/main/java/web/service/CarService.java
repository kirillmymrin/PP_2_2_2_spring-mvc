package web.service;


import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CarService {
    private static int PEOPLE_COUNT;
    private static  List<Car> carList;

    static {
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


    public static List<Car> index() {
        return carList;
    }



    public  static List<Car> carsCount(List<Car> list, int number) {
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }



}


