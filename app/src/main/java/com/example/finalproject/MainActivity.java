package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;
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
import java.net.URISyntaxException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date.*;
import java.io.OutputStreamWriter;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView D4;
    private ImageView D6;
    private ImageView D10;
    private ImageView D12;
    private int numDice;
    private Socket mSocket;
    private EditText mInputMessageView;

    //private String URL;
    {
        try {
            mSocket = IO.socket("http://chat.socket.io");
        } catch (URISyntaxException e) {}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSocket.connect();
        setContentView(R.layout.activity_main);
        //Communication app = (Communication)getApplication();
        //mSocket= app.getmSocket();
        if (mSocket.connected()){
            Toast.makeText(MainActivity.this, "Connected!!", Toast.LENGTH_SHORT).show();
        }
        Button newGame = findViewById(R.id.NewGame);
        newGame.setOnClickListener(unused -> newGameclicked());
        Button rollD4 = findViewById(R.id.rollD4);
        D4 = findViewById(R.id.D4);
        rollD4.setOnClickListener(unused -> rollD4clicked());


    }

    private void newGameclicked() {
        Intent intent = new Intent(this, GameActivity.class);

        startActivity(intent);
        finish();

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
        //mSocket.emit("")

    }


}
