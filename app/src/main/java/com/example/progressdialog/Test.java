package com.example.progressdialog;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Test extends BaseActivity {

    Button button;
    ImageView imageView;

    @Override
    public void initView() {
        super.initView();
        imageView = findViewById(R.id.image);
        button = findViewById(R.id.testButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showProgressBar();

            }
        });
    }

    @Override
    @LayoutRes
    int getLayoutId(int id) {
        return R.layout.activity_test;
    }


}
