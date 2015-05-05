package lt.vgtu.quicktests;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by aymeric on 05/05/15.
 */
public class Question {

    private String question;
    private List<String> answers;
    private int correctAnswer;

    public Question(JSONObject data) throws JSONException {
        question = data.getString("text");
        correctAnswer = data.getInt("answer");
        JSONArray responses = data.getJSONArray("responses");
        answers = new LinkedList<String>();
        for(int i = 0; i < responses.length(); i++) {
            answers.add(responses.getString(i));
        }
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
