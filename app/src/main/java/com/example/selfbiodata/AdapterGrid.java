//Tanggal Pengerjaan : 17-5-2022
//NIM : 10119187
//Nama : Alvin Algadri
//Kelas : IF-5

package com.example.selfbiodata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterGrid extends RecyclerView.Adapter<AdapterGrid.ViewHolder> {

    ArrayList<ItemModel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textJudul;
        TextView textDesc;
        ImageView gambar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textJudul = itemView.findViewById(R.id.text_judul);
            textDesc  = itemView.findViewById(R.id.text_desc);
            gambar    = itemView.findViewById(R.id.image_scene);
        }
    }

    AdapterGrid(ArrayList<ItemModel> data) {
        this.dataItem = data;
    }

    @NonNull
    @Override
    public AdapterGrid.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterGrid.ViewHolder holder, int position) {

        TextView text_judul = holder.textJudul;
        TextView text_desc = holder.textDesc;
        ImageView image_scene = holder.gambar;

        text_judul.setText(dataItem.get(position).getName());
        text_desc.setText(dataItem.get(position).getDesc());
        image_scene.setImageResource(dataItem.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }


}
