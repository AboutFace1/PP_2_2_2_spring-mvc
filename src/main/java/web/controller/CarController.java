package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import web.model.Car;
import web.service.CarService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class CarController {

    List<Car> cars = Stream.of(
            new Car("T-34", (byte)14, false),
            new Car("Toyota", (byte)4, true),
            new Car("BMW", (byte)4, true),
            new Car("Honda", (byte)2, true),
            new Car("FordT", (byte)4, false)).collect(Collectors.toList()
    );

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public ModelAndView count(@RequestParam(value = "count", required = false) Long count) {
        if (count == null) {
            count = (long) cars.size();
        }

        List<Car> carList = cars.stream().limit(count).toList();

        ModelAndView modelAndView = new ModelAndView("cars");
        modelAndView.addObject("carList", carList);

        return modelAndView;
    }
}
