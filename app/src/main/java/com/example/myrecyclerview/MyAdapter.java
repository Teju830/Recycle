package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyviewHolder> {
    Context ctx;
    String title[];
    int image[];

    public MyAdapter(Context ctx, String[] title, int[] image) {
        this.ctx = ctx;
        this.title = title;
        this.image = image;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyviewHolder(LayoutInflater.from(ctx).inflate(R.layout.every_row_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.txt.setText(title[position]);
        holder.img.setImageResource(image[position]);

    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.iv);
            txt=itemView.findViewById(R.id.tv);
        }
    }
}
