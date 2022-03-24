package web.service;

import web.Dao.Car;

import java.util.List;

public interface CarService {
    int getNumberOfCars();
    List<Car> getAll();
}
