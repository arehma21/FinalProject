package com.example.finalproject;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {

    private int HitPoints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        Button takeDamage = findViewById(R.id.damage);
        takeDamage.setOnClickListener(unused -> takeDamageClicked());

    }
    private void takeDamageClicked() {
        LinearLayout damageparent = findViewById(R.id.DamageParent);
        View damageChunk = getLayoutInflater().inflate(R.layout.damage_chunk,
                damageparent, false);
        TextView dmgType = damageChunk.findViewById(R.id.damageType);
        TextView amount = damageChunk.findViewById(R.id.amount);
    }
}
