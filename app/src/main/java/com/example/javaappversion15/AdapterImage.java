package com.example.javaappversion15;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterImage extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<structImageView> DataItems ;
    Context context;

    public AdapterImage(ArrayList<structImageView> dataItems, Context context) {
        DataItems = dataItems;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.imageview , parent , false) ;

        ViewHolder viewHolder = new ViewHolder(view) ;

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return DataItems.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
        }
    }
}
