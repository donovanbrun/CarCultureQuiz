package fr.donovan.carculturquiz.controller;

import fr.donovan.carculturquiz.model.Quiz;
import fr.donovan.carculturquiz.model.Response;
import fr.donovan.carculturquiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/quiz")
public class QuizController {

    private QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public List<Quiz> getAll() {
        return this.quizService.getAll();
    }

    @GetMapping(path = "{id}")
    public Optional<Quiz> getOne(@PathVariable Long id) {
        return this.quizService.getQuizById(id);
    }

    @GetMapping(path = "random")
    public Quiz getRandom() {
        return this.quizService.getRandomQuiz();
    }

    @GetMapping(path = "verify/{id}/{question}/{answer}")
    public Response verifyAnswer(@PathVariable Long id, @PathVariable int question, @PathVariable int answer) {
        return this.quizService.verifyAnswer(id, question, answer);
    }
}