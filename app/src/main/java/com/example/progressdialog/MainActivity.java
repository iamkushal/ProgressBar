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

public class MainActivity extends BaseActivity {

    Button button;
    ImageView imageView;

    @Override
    public void initView() {
        super.initView();
        final ImageView imageView = (ImageView) findViewById(R.id.image);
        Button button = (Button) findViewById(R.id.testButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showProgress();
//                Glide.with(MainActivity.this).load(R.drawable.cc).into(imageView);
            }
        });
    }

    @Override
    int getLayoutId(int id) {
        return R.layout.activity_main;
    }

}
