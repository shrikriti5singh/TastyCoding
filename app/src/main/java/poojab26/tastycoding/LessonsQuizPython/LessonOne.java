package poojab26.tastycoding.LessonsQuizPython;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import poojab26.tastycoding.R;

/**
 * Created by pblead26 on 14-Dec-16.
 */
public class LessonOne extends Activity {
    EditText getText;
    TextView textB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_main);

        getText = (EditText) findViewById(R.id.getText);
        textB = (TextView) findViewById(R.id.textB);

        String text = getText.getText().toString();
        if (text.equals("milk = 1")){
            textB.setText("You are right");

        }
        else
        {
            textB.setText("try again");
        }

    }
}
