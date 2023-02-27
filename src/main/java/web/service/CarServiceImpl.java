package web.service;


import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarsService {
    private static int CARS_COUNT;
    private static final List<Car> carList;

    static {
        carList = new ArrayList<>();
        carList.add(new Car("Spyder", "Ferrari", ++CARS_COUNT));
        carList.add(new Car("Quatroporte", "Maserati", ++CARS_COUNT));
        carList.add(new Car("Aventador", "Lamborghini", ++CARS_COUNT));
        carList.add(new Car("Italy", "Ferrari", ++CARS_COUNT));
        carList.add(new Car("Diablo", "Lamborghini", ++CARS_COUNT));
    }

    @Override
    public String toString() {
        return "CarDaoImpl{" +
                "carList=" + carList +
                '}';
    }


    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> carsCount(int num) {
        return carList.stream().limit(num).collect(Collectors.toList());
    }
//    list.stream().limit(num).collect(Collectors.toList());
}


