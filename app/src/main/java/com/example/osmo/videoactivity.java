package com.example.osmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoactivity extends AppCompatActivity {
    float x1,x2,y1,y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoactivity);
        VideoView videoView = findViewById(R.id.video);
        String videoPath="android.resource://" + getPackageName() + "/" + R.raw.pyramid;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        Button back=findViewById(R.id.next2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),categories.class));
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                finish();
            }
        });




    }
    public boolean onTouchEvent(MotionEvent touchEvent){

        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 < x2){
                    startActivity(new Intent(getApplicationContext(),categories.class));
                    overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                    finish();

                }else if(x1 > x2){
                    startActivity(new Intent(getApplicationContext(),introActivity.class));
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                    finish();
                }
                break;
        }
        return false;
    }
}