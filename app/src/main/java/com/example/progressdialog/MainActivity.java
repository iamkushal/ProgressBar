package com.example.progressdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    int duration = 1200;
    AnimationDrawable animationDrawable;
    Button button;
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView) findViewById(R.id.image);
        Button button = (Button) findViewById(R.id.testButton);

//        RotateAnimation rotateAnimation = new RotateAnimation(0,360,
//                Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
//
//        rotateAnimation.setDuration(duration);
//        rotateAnimation.setRepeatCount(Animation.INFINITE);
//        imageView.startAnimation(rotateAnimation);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Glide.with(MainActivity.this).load(R.drawable.cc).into(imageView);
            }
        });




    }

}
