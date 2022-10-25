package com.example.a2018113_recylceview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.a2018113_recylceview.R;
import com.example.a2018113_recylceview.models.Plant;

import java.util.List;

public class PlantsAdapter extends RecyclerView.Adapter<PlantsAdapter.MyViewHolder> {

    List<Plant> plantList;
    OnItemClickCallback onItemClickCallback;

    public PlantsAdapter(List<Plant> plantList) {
        this.plantList = plantList;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public PlantsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//    return null;
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View plantView = layoutInflater.inflate(R.layout.item_plant,parent,false);
        MyViewHolder viewHolder = new MyViewHolder((ViewGroup) plantView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Plant plant = plantList.get(position);
        holder.plantName.setText(plant.getName());
        holder.plantSpecies.setText(plant.getSpecies());
        Glide.with(holder.itemView.getContext())
                .load(plant.getImage())
                .apply(new RequestOptions().override(80,80))
                .into(holder.plantImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(plantList.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {

//    return 0;
        return (plantList != null) ? plantList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView plantName, plantSpecies;
        public ImageView plantImage;
        public MyViewHolder(@NonNull ViewGroup parent) {
            super(parent);
            plantName = parent.findViewById(R.id.tv_title);
            plantSpecies = parent.findViewById(R.id.tv_species);
            plantImage = parent.findViewById(R.id.image_logo);
        }
    }

    public static class OnItemClickCallback {
        public void onItemClicked(Plant plant) {
        }
    }
}
