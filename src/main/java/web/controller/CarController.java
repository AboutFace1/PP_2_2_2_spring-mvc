package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import web.Dao.Car;
import web.service.CarService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public ModelAndView count(@RequestParam(value = "count", required = false) Long count) {
        if (count == null) {
            count = (long) carService.getNumberOfCars();
        }

        List<Car> carList = carService.getAll().stream().limit(count).collect(Collectors.toList());

        ModelAndView modelAndView = new ModelAndView("cars");
        modelAndView.addObject("carList",  carList);

        return modelAndView;
    }
}
