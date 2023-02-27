package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarServiceImpl;
import web.service.CarsService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {

    private final CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5")int car ,ModelMap model) {
        model.addAttribute("carList",carsService.carsCount(car));
        return "cars";
    }

}

