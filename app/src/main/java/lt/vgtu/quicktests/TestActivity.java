package lt.vgtu.quicktests;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class TestActivity extends ActionBarActivity {

    private Test test;
    private int currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Intent intent = getIntent();
        currentQuestion = 0;
        test = MainActivity.list.get(intent.getExtras().getInt("test_id"));
        Question q = test.getQuestions().get(0);
        TextView progress = (TextView) findViewById(R.id.progress);
        progress.setText("Question 1 of " + test.getQuestions().size());
        TextView question = (TextView) findViewById(R.id.question);
        question.setText(q.getQuestion());
        RadioGroup rg = (RadioGroup) findViewById(R.id.radiogroup);
        for(String s : q.getAnswers()) {
            RadioButton rb = new RadioButton(this);
            rg.addView(rb);
            rb.setText(s);
        }
    }

    public void nextQuestion(View view) {
        currentQuestion++;
        TextView progress = (TextView) findViewById(R.id.progress);
        progress.setText("Question " + (currentQuestion+1) + " of " + test.getQuestions().size());
        Question q = test.getQuestions().get(currentQuestion);
        TextView question = (TextView) findViewById(R.id.question);
        question.setText(q.getQuestion());
        RadioGroup rg = (RadioGroup) findViewById(R.id.radiogroup);
        rg.removeAllViews();
        for(String s : q.getAnswers()) {
            RadioButton rb = new RadioButton(this);
            rg.addView(rb);
            rb.setText(s);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
