package poojab26.tastycoding;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnlesson1,btnlesson2,btnlesson3,btnlesson4,btnlesson5,btnlesson6,btnlesson7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_main);

        btnlesson1 = (Button)findViewById(R.id.less1);
        btnlesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecipeLessons.class);
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                prefs.edit().putString("lesson", "1").commit();
                startActivity(intent);
            }
        });
        btnlesson2=(Button)findViewById(R.id.less2);
        btnlesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecipeLessons.class);
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                prefs.edit().putString("lesson", "2").commit();
                startActivity(intent);
            }
        });
        btnlesson3=(Button)findViewById(R.id.less3);
        btnlesson4=(Button)findViewById(R.id.less4);
        btnlesson5=(Button)findViewById(R.id.less5);
        btnlesson6=(Button)findViewById(R.id.less6);
        btnlesson7=(Button)findViewById(R.id.less7);
    }
    }




