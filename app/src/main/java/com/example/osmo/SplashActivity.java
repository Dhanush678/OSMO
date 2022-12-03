package com.example.osmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    TextView textView,textView1;
    ImageView imageView;
    Animation animationUptoDown , animationDownToUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setStatusBarColor(ContextCompat.getColor(SplashActivity.this,R.color.splash));

        imageView = findViewById(R.id.image_view);
        animationUptoDown = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.uptodownanim);
        animationDownToUp = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.downtotopanim);

        imageView.setAnimation(animationUptoDown);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                finish();
            }
        },2000);
    }
}
