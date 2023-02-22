package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.List;

import static web.service.CarService.index;


@Controller
public class CarsController  {

    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int cars, ModelMap model) {
      List<Car>carsList =  index();
      carsList = CarService.carsCount(carsList,cars);
     model.addAttribute("carList",carsList);
     return "cars";
    }

}

