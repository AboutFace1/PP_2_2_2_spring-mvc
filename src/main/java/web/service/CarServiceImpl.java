package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarDao;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public int getNumberOfCars() {
        return carDao.getNumberOfCars();
    }

    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }
}
