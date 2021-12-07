package fr.donovan.carculturquiz.model;

public class Response {

    private Long quiz;
    private int question;
    private int answer;
    private boolean result;

    public Response(Long quiz, int question, int answer, boolean result) {
        this.quiz = quiz;
        this.question = question;
        this.answer = answer;
        this.result = result;
    }

    public Long getQuiz() {
        return quiz;
    }

    public void setQuiz(Long quiz) {
        this.quiz = quiz;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
