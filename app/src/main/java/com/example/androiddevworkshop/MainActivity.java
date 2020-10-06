package com.example.androiddevworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Accessing the the recycler view */
        RecyclerView customList = (RecyclerView) findViewById(R.id.customList);

        /* Tell the RecyclerView how to display data with help of LayoutManager */
        customList.setLayoutManager(new LinearLayoutManager(this));

        /* Data to be displayed as a list */
        String[] data = {"Apple Pie", "Lemon Tart" , "Brownies", "Truffle" , "Chocolate Mousse" , "Cupcakes", "Gulab Jamun" , "Rasmalai" , "Kheer" , "Jalebi"};

        /* Set Adapter to the RecycleView */
        customList.setAdapter(new CustomAdapter(data));
    }
}
