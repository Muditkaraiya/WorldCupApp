package com.example.worldcupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView listView;
private static CustomAdapter adapter;
ArrayList<ModelClass>dataModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        dataModels=new ArrayList<>();
        dataModels.add(new ModelClass("Germany","4",R.drawable.germany));
        dataModels.add(new ModelClass("France","2",R.drawable.france));
        dataModels.add(new ModelClass("Brazil","4",R.drawable.brazil));
        dataModels.add(new ModelClass("saudiArabia","4",R.drawable.saudiarabia));
        dataModels.add(new ModelClass("Spain","4",R.drawable.spain));
        dataModels.add(new ModelClass("UnitedKingdom","4",R.drawable.unitedkingdom));
        dataModels.add(new ModelClass("Usa","4",R.drawable.unitedstates));

        adapter=new CustomAdapter(dataModels,getApplicationContext());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Total wins in campaign "+dataModels.get(position).getWorldCupWins(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}