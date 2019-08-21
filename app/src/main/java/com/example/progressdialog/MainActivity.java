package com.example.progressdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    int duration = 1200;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

//        RotateAnimation rotateAnimation = new RotateAnimation(0,360,
//                Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
//
//        rotateAnimation.setDuration(duration);
//        rotateAnimation.setRepeatCount(Animation.INFINITE);
//        imageView.startAnimation(rotateAnimation);
        Glide.with(this).load(R.drawable.cc).into(imageView);



    }

}
