package fr.donovan.carculturquiz.service;

import fr.donovan.carculturquiz.model.Car;
import fr.donovan.carculturquiz.model.Question;
import fr.donovan.carculturquiz.model.Quiz;
import fr.donovan.carculturquiz.model.Response;
import fr.donovan.carculturquiz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    private QuizRepository quizRepository;
    private CarService carService;

    @Autowired
    public QuizService(QuizRepository quizRepository, CarService carService) {
        this.quizRepository = quizRepository;
        this.carService = carService;
    }

    public List<Quiz> getAll() {
        return this.quizRepository.findAll();
    }

    public Optional<Quiz> getQuizById(long id) {
        return this.quizRepository.findById(id);
    }

    private void generateQuiz() {

        for (int i = 0; i < 100; i++) {

            Car[] cars = carService.getAll().toArray(new Car[0]);

            ArrayList<Question> questions = new ArrayList<>();

            for (int j = 0; j < (int)(Math.random() * 20)+1; j++) {

                Car[] responses = new Car[4];

                for (int k = 0; k < 4; k++) {
                    responses[k] = carService.getAll().get((int)(Math.random()*100));
                }

                questions.add(new Question(responses, (int)(Math.random()*4)));
            }

            Quiz quiz = new Quiz("test", questions);

            quizRepository.insert(quiz);
        }
    }

    public Quiz getRandomQuiz() {
        List<Quiz> quizzes = this.quizRepository.findAll();
        return quizzes.get((int) (Math.random()*quizzes.size()));
    }

    public Response verifyAnswer(Long id, int question, int answer) {
        Optional<Quiz> optQuiz = this.quizRepository.findById(id);

        Response response = new Response(id, question, answer, false);

        if (optQuiz.isPresent()) {
            Quiz quiz = optQuiz.get();

            if (question < quiz.getQuestions().size()) {
                if (quiz.getQuestions().get(question).verifyAnswer(answer)) {
                    response.setResult(true);
                }
            }
        }
        return response;
    }
}
