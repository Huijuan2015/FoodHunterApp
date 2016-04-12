package com.example.tinku.foodhunterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


        iv=(ImageView)findViewById(R.id.imageview);
        iv.setImageResource(R.drawable.logo);


    }
}
