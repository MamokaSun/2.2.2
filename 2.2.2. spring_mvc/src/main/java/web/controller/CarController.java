package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

import java.util.List;

@Controller
public class CarController {
    CarService carService;

    @RequestMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false) int quantity, Model model) {
        carService = new CarService();

        carService.addCar(new Car((byte) 1,"piterka", 23, "very bad"));
        carService.addCar(new Car((byte) 2, "14-aya", 71, "bolee menee"));
        carService.addCar(new Car((byte) 3,"kopeyka", 1, "voobshe ne edet"));
        carService.addCar(new Car((byte) 4,"bmv", 99, "kak lastochka letaet"));
        carService.addCar(new Car((byte) 5,"net car", 0, "no money, no honey"));

        List<Car> carList = carService.getListFromCount(quantity);

        model.addAttribute("car", carList);

        return "cars";
    }
}
