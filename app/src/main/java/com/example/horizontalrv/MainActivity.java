package com.example.horizontalrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> imageurls = new ArrayList<>();
    private ArrayList<String> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getImages();
    }
    private void getImages(){
        imageurls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ9a6IxlRLrTEX7JVnsK6QjOMsdTqlFrx_hjw&usqp=CAU");
        items.add("Aishwarya");
        imageurls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQkRdYL3z8e-GjQVFfd12h_32tJyahy0g6ggA&usqp=CAU");
        items.add("Sumit");
        imageurls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRqEbArbyoopYCN-cEZlOyn4WjUNWJZNMwAXg&usqp=CAU");
        items.add("Ritika");
        imageurls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT8hSTPoOYRN0EbWSWvE7HAiX0vAgfSIONscQ&usqp=CAU");
        items.add("Anjali");
        imageurls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSGMgqeZTfbfHOHy8WDc7GjPZiFqzQFaPh2Pw&usqp=CAU");
        items.add("Sachin");
        imageurls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQQ-Qoe8XW9cJMnbJzNwOBzLsAdcX6Ggx7IGw&usqp=CAU");
        items.add("Ruhi");
        imageurls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQpvDR_01AyPiizVZMgNtw45_Hkhi6uH9AaRQ&usqp=CAU");
        items.add("Priyanka");
        imageurls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSnecLzZ42zUFfyr3F4kF4ZxI604M2p_w5AxQ&usqp=CAU");
        items.add("Abhishek");
        initRecyclerView();
    }
    private void initRecyclerView(){

        RecyclerView list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        HorizontalAdapter adapter = new HorizontalAdapter(this, items, imageurls);
        list.setAdapter(adapter);

    }
}