package com.example.finalproject;

import android.os.Bundle;
import android.util.Log;
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

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date.*;
import java.io.OutputStreamWriter;
import android.content.Context;
import android.net.Uri;
//import com.google.gson.JsonObject;

public class GameActivity extends AppCompatActivity {
    private ImageView diceImage = findViewById(R.id.diceImage);
    private boolean logRolls = false;
    private ArrayList<JsonObject> log = new ArrayList<JsonObject>();
    private ArrayList<String>logString = new ArrayList<String>();
    private int lastRoll;
    private Timestamp timeLastRoll;
    private String rollCheck;
    private String filepath;
    private String dataString;




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
            log.add(diceRoll);
            logString.add(diceRoll.toString());
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
    private void saveLogclicked(String data, Context context) {

        for (int i = 0; i < logString.size(); i++) {
            dataString = dataString + "\n" + logString.get(i);
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("rollLog.txt", Context.MODE_PRIVATE));
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }
    private void sendLogclicked() {

    }


}
