package lt.vgtu.quicktests;

import java.util.List;

/**
 * Created by aymeric on 05/05/15.
 */
public class Test {

    private String title;
    private String nameClass;
    private String teacher;
    private List<Question> questions;

    public Test(String title, String nameClass, String teacher, List<Question> questions) {
        this.title = title;
        this.nameClass = nameClass;
        this.teacher = teacher;
        this.questions = questions;
    }

    public String getTitle() {
        return title;
    }

    public String getNameClass() {
        return nameClass;
    }

    public String getTeacher() {
        return teacher;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
