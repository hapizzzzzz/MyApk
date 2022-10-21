package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {


    ImageView menara;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        menara = findViewById(R.id.menara);

        menara.setOnClickListener(view -> {
            startActivity(new Intent(this, Barang.class));
        });

    }
}