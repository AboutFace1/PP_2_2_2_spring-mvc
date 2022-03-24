package web.repository;

import org.springframework.stereotype.Repository;
import web.Dao.Car;


import java.util.ArrayList;
import java.util.List;


@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car("T-34", (byte) 14, false));
        cars.add(new Car("Toyota", (byte) 4, true));
        cars.add(new Car("BMW", (byte) 4, true));
        cars.add(new Car("Honda", (byte) 2, true));
        cars.add(new Car("FordT", (byte) 4, false));
    }


    @Override
    public int getNumberOfCars() {
        return cars.size();
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }
}
