package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    String titles[];
    int img[];
MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.recyclerview);
        titles=getResources().getStringArray(R.array.title);
        img=new int[]{
                R.drawable.brasl,
                R.drawable.braslet,
                R.drawable.earing,
                R.drawable.set,
                R.drawable.sets,

        };
        adapter=new MyAdapter(this,titles,img);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);
    }
}