package web.repository;

import web.model.Car;

import java.util.List;

public interface CarDao {
    int getNumberOfCars();
    List<Car> getAll();
}
