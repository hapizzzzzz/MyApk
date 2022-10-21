package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Barang extends AppCompatActivity {
    ListView lvBarang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang);

        lvBarang = findViewById(R.id.lvBarang);

        dataBarang();

    }

    public void dataBarang(){
        ArrayList<String> dataB = new ArrayList<>();
        dataB.add("Monitor");
        dataB.add("Mouse");
        dataB.add("Processor");
        dataB.add("Printer");

        ArrayAdapter<String> adp = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataB);

        lvBarang.setAdapter(adp);
    }
}
