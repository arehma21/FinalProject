package com.example.finalproject;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;
import com.google.gson.JsonObject;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date.*;
//import com.google.gson.JsonObject;

public class GameActivity extends AppCompatActivity {
    private ImageView diceImage = findViewById(R.id.diceImage);
    private boolean logRolls = false;
    private ArrayList<JsonObject> log = new ArrayList<JsonObject>();
    private int lastRoll;
    private Timestamp timeLastRoll;
    private String rollCheck;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        Button d4 = findViewById(R.id.d4Game);
        Button d6 = findViewById(R.id.d6Game);
        Button d8 = findViewById(R.id.d8Game);
        Button d10 = findViewById(R.id.d10Game);
        Button d12 = findViewById(R.id.d12Game);
        Button d20 = findViewById(R.id.d20Game);
        d4.setOnClickListener(unused -> d4clicked());
    }
    private void d4clicked() {
        int rollNumber = (int) ((Math.random() * 4) + 1);
        lastRoll = rollNumber;
        if (rollNumber == 1) {
            diceImage.setImageResource(R.drawable.dice4_1);
        }
        if (rollNumber == 2) {
            diceImage.setImageResource(R.drawable.dice4_2);
        }
        if (rollNumber == 3) {
            diceImage.setImageResource(R.drawable.dice4_3);
        }
        if (rollNumber == 4) {
            diceImage.setImageResource(R.drawable.dice4_4);
        }
        Timestamp currentTimeStamp = new Timestamp(System.currentTimeMillis());
        timeLastRoll = currentTimeStamp;
        if (logRolls) {
            JsonObject diceRoll = new JsonObject();
            diceRoll.addProperty("Number", rollNumber);
            diceRoll.addProperty("Time", currentTimeStamp.toString());
            diceRoll.addProperty("Check", rollCheck);
        }
    }
    private void d6clicked() {

    }
    private void d10clicked() {

    }
    private void d12clicked() {

    }
    private void d20clicked() {

    }


}
