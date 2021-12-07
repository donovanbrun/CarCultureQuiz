package fr.donovan.carculturquiz.repository;

import fr.donovan.carculturquiz.model.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends MongoRepository<Quiz, Long> {
}
