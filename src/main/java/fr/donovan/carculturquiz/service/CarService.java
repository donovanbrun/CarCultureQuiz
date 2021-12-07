package fr.donovan.carculturquiz.service;

import fr.donovan.carculturquiz.model.Car;
import fr.donovan.carculturquiz.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAll() {
        return this.carRepository.findAll();
    }

    public Optional<Car> getCarById(long id) {
        return this.carRepository.findById(id);
    }

    public void add(Car car) {
        this.carRepository.insert(car);
    }

    private void generateCars() {

        for (int i = 0; i < 100; i++) {

            int year = (int) (Math.random() * 3000);
            int hp = (int) (Math.random() * 1500);
            Car c = new Car("brand", "model n°" + i, year, hp);
            add(c);
        }
    }
}
