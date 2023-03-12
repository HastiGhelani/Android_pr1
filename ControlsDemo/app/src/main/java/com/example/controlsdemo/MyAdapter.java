package com.example.controlsdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Car> carList;

    public MyAdapter(List<Car> carList) {
        this.carList = carList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.custom_list_item,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Car car = carList.get(position);
        holder.txtTitle.setText(car.getTitle());
        holder.txtDescription.setText(car.getDescription());
        holder.txtPrice.setText(String.valueOf(car.getPrice()));
        holder.img.setImageResource(car.getImg());
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    //create a new class MyViewHolder
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        //create widgets
        TextView txtTitle, txtDescription, txtPrice;
        ImageView img;

        //Initialize the views
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.title);
            txtDescription = itemView.findViewById(R.id.subtitle);
            txtPrice = itemView.findViewById(R.id.lblPrice);
            img = itemView.findViewById(R.id.icon);
        }
    }
}
