package com.tejas_bharadwaj.circlepong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CircleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(CircleActivity.this));
    }
}