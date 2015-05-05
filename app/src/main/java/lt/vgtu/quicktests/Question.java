package lt.vgtu.quicktests;

import java.util.List;

/**
 * Created by aymeric on 05/05/15.
 */
public class Question {

    private String question;
    private List<String> answers;
    private int correctAnswer;

    public Question(List<String> answers, String question, int correctAnswer) {
        this.answers = answers;
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
