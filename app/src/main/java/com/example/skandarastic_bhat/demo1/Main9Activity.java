package com.example.skandarastic_bhat.demo1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main9Activity extends AppCompatActivity {
    Button button;
    VideoView videoView;
MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        button=(Button) findViewById(R.id.vd);
        videoView=(VideoView) findViewById(R.id.play);
        mediaController= new MediaController(this);
    }
    public void videoplay(View v)
    {
        String uriPath = "android.resource://com.example.skandarastic_bhat.demo1/"+R.raw.rr;
        Uri uri = Uri.parse(uriPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
    }
}
