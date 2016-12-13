package poojab26.tastycoding;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.TextSwitcher;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    TextSwitcher textSwitcher;
    VideoView videoView;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
        videoView =(VideoView)findViewById(R.id.videoView1);

        playVideo();

    }

    public void playVideo()
    {
        //Creating MediaController
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        //specify the location of media file
        Uri uri=Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.h);

        //Setting MediaController and URI, then starting the videoView
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
    }




