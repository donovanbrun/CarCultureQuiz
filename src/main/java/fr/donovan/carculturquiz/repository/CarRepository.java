package fr.donovan.carculturquiz.repository;

import fr.donovan.carculturquiz.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends MongoRepository<Car, Long>{
}
