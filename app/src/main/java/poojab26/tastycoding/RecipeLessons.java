package poojab26.tastycoding;

import android.app.Activity;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by pblead26 on 14-Dec-16.
 */
public class RecipeLessons extends Activity {
    VideoView videoView;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_lessons_activity);

        videoView =(VideoView)findViewById(R.id.videoView1);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        s = prefs.getString("lesson", null);
        playVideo();

    }

    public void playVideo()
    {
        //Creating MediaController
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri;

        //specify the location of media file
        if (s=="1") {
            uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lesson1);

            //Setting MediaController and URI, then starting the videoView
            videoView.setMediaController(mediaController);
            videoView.setVideoURI(uri);
            videoView.requestFocus();
            videoView.start();
        }
        if(s=="2"){
            uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.lesson2);

            //Setting MediaController and URI, then starting the videoView
            videoView.setMediaController(mediaController);
            videoView.setVideoURI(uri);
            videoView.requestFocus();
            videoView.start();
        }

    }
}