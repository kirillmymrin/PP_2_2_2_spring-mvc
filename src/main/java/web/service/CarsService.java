package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

@Component
public interface CarsService {
    List<Car> carsCount(List<Car> list, int number);

     List<Car> getCarList() ;

}
