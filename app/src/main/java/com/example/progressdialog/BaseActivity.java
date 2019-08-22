package com.example.progressdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;

abstract public class BaseActivity extends AppCompatActivity {

    ImageView imageView;
    int layoutId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId(layoutId));
        initView();

    }

    private void initProgressDialog() {
       imageView = (ImageView) findViewById(R.id.image);

    }

    public void showProgress(){

        Glide.with(this).load(R.drawable.cc).into(imageView);
    }

    abstract int getLayoutId(int id);

    public void initView() {
        initProgressDialog();
    }
}
