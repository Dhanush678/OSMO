package com.example.osmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    float x1,x2,y1,y2;

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         next=findViewById(R.id.next);
         next.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(getApplicationContext(),videoactivity.class));
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
               if(x1 > x2){
                    startActivity(new Intent(getApplicationContext(),videoactivity.class));
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                    finish();
                }
                break;
        }
        return false;
    }


}