package web.model.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public int getNumberOfCars(List<Car> cars) {
        return cars.size();
    }
}
