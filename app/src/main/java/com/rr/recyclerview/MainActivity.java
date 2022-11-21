package com.rr.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recylerView);

        list = new ArrayList<>();
        list.add("R1 v1");
        list.add("R1 v2");
        list.add("R1 v3");
        list.add("R1 v4");
        list.add("R1 v5");


        recyclerView.setAdapter(new CustomAdapter(this, list));
        recyclerView.getAdapter().notifyDataSetChanged();
    }
}