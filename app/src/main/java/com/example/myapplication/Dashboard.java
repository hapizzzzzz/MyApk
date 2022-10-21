package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.helper.Helper;

public class Dashboard extends AppCompatActivity {

    TextView tvUsername;
    ImageView kgambar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        tvUsername = findViewById(R.id.tvUsername);
        tvUsername.setText(Helper.getUsername());
        kgambar = findViewById(R.id.kgambar);

        kgambar.setOnClickListener(view -> {

            startActivity(new Intent(this, picture_click.class));

        });

    }
}