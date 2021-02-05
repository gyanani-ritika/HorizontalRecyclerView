package com.example.horizontalrv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder> {

    private ArrayList<String> items = new ArrayList<>();
    private ArrayList<String> imageurls = new ArrayList<>();
    private Context context;

    public HorizontalAdapter(Context context, ArrayList<String> items, ArrayList<String> imageurls) {
        this.items = items;
        this.imageurls = imageurls;
        this.context = context;
    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_layout,parent, false);
        return new  HorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {
        Glide.with(context)
                .asBitmap()
                .load(imageurls.get(position))
                .into(holder.imgv);
        holder.txt.setText(items.get(position));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder {
        ImageView imgv;
        TextView txt;


        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
                imgv =itemView.findViewById(R.id.imgv);
                txt = itemView.findViewById(R.id.txt1);
        }
    }

}
