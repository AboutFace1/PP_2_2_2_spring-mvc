package web.repository;

import web.Dao.Car;

import java.util.List;

public interface CarDao {
    int getNumberOfCars();
    List<Car> getAll();
}
