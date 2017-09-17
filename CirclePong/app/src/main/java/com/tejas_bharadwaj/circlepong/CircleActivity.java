package com.tejas_bharadwaj.circlepong;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CircleActivity extends AppCompatActivity {

    private Button leftBtn;
    private Button rightBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        leftBtn = (Button) findViewById(R.id.left);
        rightBtn = (Button) findViewById(R.id.right);
        GameView gameView = new GameView(CircleActivity.this);
        // EDGY CODE BELOW
        //Bitmap bitmap = new Bitmap.createBitmap(300, 300, Bitmap.Config.ARGB_8888);
    }
}