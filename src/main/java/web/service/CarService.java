package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.repository.CarDao;

import java.util.List;

@Service
public class CarService {

    CarDao carDao;

    @Autowired
    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public int getNumberOfCars(List<Car> cars) {
        return carDao.getNumberOfCars(cars);
    }

}
