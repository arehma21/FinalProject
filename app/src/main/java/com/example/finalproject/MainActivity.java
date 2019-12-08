package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView D4;
    private ImageView D6;
    private ImageView D10;
    private ImageView D12;
    private int numDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button newGame = findViewById(R.id.NewGame);
        newGame.setOnClickListener(unused -> newGameclicked());
        Button rollD4 = findViewById(R.id.rollD4);
        D4 = findViewById(R.id.D4);
        rollD4.setOnClickListener(unused -> rollD4clicked());


    }

    private void newGameclicked() {
        Intent intent = new Intent(this, GameActivity.class);

        startActivity(intent);

    }
    private void rollD4clicked() {
        int rollNumber = (int) ((Math.random() * 4) + 1);
        if (rollNumber == 1) {
            D4.setImageResource(R.drawable.dice4_1);
        }
        if (rollNumber == 2) {
            D4.setImageResource(R.drawable.dice4_2);
        }
        if (rollNumber == 3) {
            D4.setImageResource(R.drawable.dice4_3);
        }
        if (rollNumber == 4) {
            D4.setImageResource(R.drawable.dice4_4);
        }
    }


}
