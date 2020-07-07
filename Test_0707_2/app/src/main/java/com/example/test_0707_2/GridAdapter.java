package com.example.test_0707_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder> {
    private List<Row> mDataset = new ArrayList<>();

    @NonNull
    @Override
    public GridAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_recycler_row, parent,false);
        final GridViewHolder holder = new GridViewHolder(view);
        holder.contentView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int position = holder.getAdapterPosition();
                Row row = mDataset.get(position);
                Toast.makeText(v.getContext(), "You clicked No." + position + " message", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent( v.getContext() ,MessageActivity.class);
                v.getContext().startActivity(intent);
            }
        });

        return holder;
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class GridViewHolder extends RecyclerView.ViewHolder {
        private ImageView tvImage;
        private TextView tvName;
        private View contentView;

        public GridViewHolder(View v) {
            super(v);
            contentView = v;
            tvImage = v.findViewById(R.id.grid_image);
            tvName = v.findViewById(R.id.grid_name);
        }

        public void onBind(int position, Row data) {
            tvImage.setImageResource(data.image);
            tvName.setText(data.name);
        }
    }

    @Override
    public void onBindViewHolder(GridViewHolder holder, final int position) {
        holder.onBind(position, mDataset.get(position));
    }

    public GridAdapter(List<Row> myDataset) {
        mDataset.addAll(myDataset);
    }
}
