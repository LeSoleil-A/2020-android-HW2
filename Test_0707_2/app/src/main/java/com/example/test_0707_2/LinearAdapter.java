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

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder> {
    private List<Row> mDataset = new ArrayList<>();

    @NonNull
    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent,false);
        final LinearViewHolder holder = new LinearViewHolder(view);
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

    public static class LinearViewHolder extends RecyclerView.ViewHolder {
        private TextView tvIndex;
        private ImageView tvImage;
        private TextView tvName;
        private View contentView;

        public LinearViewHolder(View v) {
            super(v);
            contentView = v;
            tvIndex = v.findViewById(R.id.tv_index);
            tvImage = v.findViewById(R.id.tv_image);
            tvName = v.findViewById(R.id.tv_name);
        }

        public void onBind(int position, Row data) {
            tvIndex.setText(data.name + " sends you a new message!");
            //Bitmap bm = BitmapFactory.decodeFile(data.image);
            tvImage.setImageResource(data.image);
            //tvImage.setImageResource(R.drawable.timg);//改变ImageView的src，也可以用setImageBitmap()指定一个bitmap对象
            tvName.setText(data.name);
            if (position < 3) {
                tvIndex.setTextColor(Color.parseColor("#FFD700"));
            } else {
                tvIndex.setTextColor(Color.parseColor("#FFFFFF"));
                }
            }
        }

    @Override
    public void onBindViewHolder(LinearViewHolder holder, final int position) {
        holder.onBind(position, mDataset.get(position));

    }

    public LinearAdapter(List<Row> myDataset) {
        mDataset.addAll(myDataset);
    }


}
