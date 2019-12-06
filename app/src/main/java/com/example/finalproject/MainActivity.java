package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button newGame = findViewById(R.id.NewGame);
        newGame.setOnClickListener(unused -> newGameclicked());

    }
    private void newGameclicked() {
        Intent intent = new Intent(this, GameActivity.class);

        startActivity(intent);
        

    }
}
