package lt.vgtu.quicktests;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by aymeric on 05/05/15.
 */
public class Test {

    private String title;
    private String nameClass;
    private String teacher;
    private List<Question> questions;

    public Test(String title, String nameClass, String teacher, JSONArray questions) {
        this.title = title;
        this.nameClass = nameClass;
        this.teacher = teacher;
        this.questions = new LinkedList<Question>();
        for(int i = 0; i < questions.length(); i++)
            try {
                this.questions.add(new Question(questions.getJSONObject(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
    }

    public String getNameClass() {
        return nameClass;
    }

    public String getTitle() {
        return title;
    }

    public String getTeacher() {
        return teacher;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
