package com.example.progressdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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


    @Override
    public void initView() {
//        super.initView();
        initProgressDialog();
        button = findViewById(R.id.testButton);
/*
        final ImageView imageView = findViewById(R.id.image);
*/

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Test.class);
                startActivity(intent);
/*                showProgressBar();
//                Glide.with(MainActivity.this).load(R.drawable.cc).into(imageView);*/
            }
        });
    }

    @Override
    int getLayoutId(int id) {
        return R.layout.activity_main;
    }

}
