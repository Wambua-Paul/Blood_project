package com.example.bloodtransfusion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
//import android.os.Handler;
//import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME = 4000; //This is 4 seconds
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}