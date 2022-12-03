package com.example.osmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class mainpage extends AppCompatActivity {
    float x1,x2,y1,y2;
    ViewPager viewPager;
    ArrayList<Integer> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
//
//        viewPager=findViewById(R.id.viewPager);
//        arrayList.add(R.drawable.image);
//        arrayList.add(R.drawable.beyondearth);
//        arrayList.add(R.drawable.cybersecurity);
//        arrayList.add(R.drawable.cybersecurity);
//        Myadapter myadapter=new Myadapter(mainpage.this,arrayList);
//        viewPager.setAdapter(myadapter);
//






    }

}