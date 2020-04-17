package com.example.cosmicarcadeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button quizBtn;
    private Button gameBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quizBtn = findViewById(R.id.quizBtn);
        gameBtn = findViewById(R.id.gameBtn);

        quizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, quizActivity.class));
                finish();
            }
        });

        gameBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GamesActivity.class));
                finish();
            }
        });
    }
}
