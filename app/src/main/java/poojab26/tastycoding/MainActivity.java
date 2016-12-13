package poojab26.tastycoding;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    TextSwitcher textSwitcher;
    LinearLayout layout;

    String textSwitcherText[] = {"TextSwitcher Example", "Next Text in TextSwitcher", "Android TextSwitcher", "TextSwitcher Tutorial", "TextSwitcher in Android"};

    int switcherText = textSwitcherText.length;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playAudio();

        textSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
        layout = (LinearLayout) findViewById(R.id.layout);

        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView switcherTextView = new TextView(getApplicationContext());
                switcherTextView.setTextSize(24);
                switcherTextView.setTextColor(Color.BLACK);
                switcherTextView.setText("Click The Below Button");
                return switcherTextView;
            }
        });

        Animation animationOut = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        Animation animationIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);

        textSwitcher.setOutAnimation(animationOut);
        textSwitcher.setInAnimation(animationIn);
    }

    public void nextText(View view) {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                textSwitcher.setText(textSwitcherText[counter]);
                counter++;
                stopAudio();
            }
        }, 100);
    }
    public void playAudio() {
        Intent objIntent = new Intent(this, PlayAudio.class);
        startService(objIntent);
    }

    public void stopAudio() {
        Intent objIntent = new Intent(this, PlayAudio.class);
        stopService(objIntent);
    }
}

