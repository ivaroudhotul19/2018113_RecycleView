package com.example.a2018113_recylceview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.example.a2018113_recylceview.models.Plant;


public class PlantDetailActivity extends AppCompatActivity {

    ImageView image;
    TextView title, description, species;
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_plant_detail);
        image = findViewById(R.id.image_logo);
        title = findViewById(R.id.tv_title);
        description = findViewById(R.id.tv_desciption);
        species = findViewById(R.id.tv_species);

        Plant plant = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (plant != null) {
            image.setImageResource(plant.getImage());
            title.setText(plant.getName());
            description.setText(plant.getDescription());
            species.setText(plant.getSpecies());
        }

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Plant Detail");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}