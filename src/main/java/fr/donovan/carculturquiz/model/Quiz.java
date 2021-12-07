package fr.donovan.carculturquiz.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Quiz {

    @Id
    private Long id;
    private String theme;
    private ArrayList<Question> questions;

    public Quiz(String theme, ArrayList<Question> questions) {
        this.id = ((Double) (Math.random() * Long.MAX_VALUE)).longValue();
        this.theme = theme;
        this.questions = questions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
