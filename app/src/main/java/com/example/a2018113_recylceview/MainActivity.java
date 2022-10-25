package com.example.a2018113_recylceview;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a2018113_recylceview.adapters.PlantsAdapter;
import com.example.a2018113_recylceview.datas.PlantData;
import com.example.a2018113_recylceview.models.Plant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvPlant;
    public List<Plant> plantList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Plant List");
        rvPlant = findViewById(R.id.rv_plant);
        plantList = PlantData.getDataPlant();

        PlantsAdapter plantsAdapter = new PlantsAdapter(plantList);
        rvPlant.setAdapter(plantsAdapter);
        rvPlant.setLayoutManager(new LinearLayoutManager(this));
        rvPlant.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        plantsAdapter.setOnItemClickCallback(new PlantsAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Plant data) {
                Intent moveIntent = new Intent(MainActivity.this, PlantDetailActivity.class);
                moveIntent.putExtra(PlantDetailActivity.ITEM_EXTRA, data);
                startActivity(moveIntent);
            }
        });
    }
}