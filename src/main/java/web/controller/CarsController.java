package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

import java.util.Arrays;
import java.util.stream.Collectors;


@Controller
public class CarsController extends CarServiceImpl {

    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", required = false) String count,
                           @RequestParam(defaultValue = "5", required = false) String defaultValue, ModelMap model) {
        System.out.println("Count = " + count + "  " + "defalutValue = " + defaultValue);
        if (count == null) {
            model.addAttribute("carList", index());
            return "cars";
        } else if (count.equals("1")) {
            model.addAttribute("carList", Arrays.stream(index().toArray()).limit(1).collect(Collectors.toList()));
            return "cars";
        } else if (count.equals("2")) {
            model.addAttribute("carList", Arrays.stream(index().toArray()).limit(2).collect(Collectors.toList()));
            return "cars";
        } else if (count.equals("3")) {
            model.addAttribute("carList", Arrays.stream(index().toArray()).limit(3).collect(Collectors.toList()));
            return "cars";
        } else if (count.equals("4")) {
            model.addAttribute("carList", Arrays.stream(index().toArray()).limit(4).collect(Collectors.toList()));
            return "cars";
        } else if (count.equals("5")) {
            model.addAttribute("carList", Arrays.stream(index().toArray()).limit(5).collect(Collectors.toList()));
            return "cars";
        } else {
            model.addAttribute("carList", index());
            return "cars";
        }
    }
}

