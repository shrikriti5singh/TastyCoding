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
    EditText gettxt;
    TextView textB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.python_one);

        gettxt = (EditText) findViewById(R.id.gettext);
        textB = (TextView) findViewById(R.id.textB);

        String text = gettxt.getText().toString();
        if (text.equals("milk = 1")){
            textB.setText("You are right");

        }
        else
        {
            textB.setText("try again");
        }

    }
}
