package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

@Component
public interface CarsService {


     List<Car> getCarList() ;

    List<Car> carsCount(int num);
}
