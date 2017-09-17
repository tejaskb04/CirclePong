package com.tejas_bharadwaj.circlepong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CircleActivity extends AppCompatActivity {

    private GameView gameView;
    private Button leftBtn;
    private Button rightBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        gameView = (GameView) findViewById(R.id.game_view);
        leftBtn = (Button) findViewById(R.id.left);
        rightBtn = (Button) findViewById(R.id.right);
    }
}