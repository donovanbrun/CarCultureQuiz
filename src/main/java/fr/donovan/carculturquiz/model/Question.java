package fr.donovan.carculturquiz.model;

public class Question {

    private Car[] cars;
    private int answer;

    public Question(Car[] cars, int answer) {
        this.cars = cars;
        this.answer = answer;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public boolean verifyAnswer(int answer) {
        return answer == this.answer;
    }
}
