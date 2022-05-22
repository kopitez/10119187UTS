//Tanggal Pengerjaan : 17-5-2022
//NIM : 10119187
//Nama : Alvin Algadri
//Kelas : IF-5

package com.example.selfbiodata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterData2 extends RecyclerView.Adapter<AdapterData2.HolderData> {
    List<String> listData2;
    LayoutInflater inflater2;

    public AdapterData2(Context context, List<String> listData2) {
        this.listData2 = listData2;
        this.inflater2 = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater2.inflate(R.layout.item_data2, parent, false);
        return new HolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        holder.txtData2.setText(listData2.get(position));
    }

    @Override
    public int getItemCount() {
        return listData2.size();
    }

    public class HolderData extends RecyclerView.ViewHolder  {
        TextView txtData2;
        public HolderData(@NonNull View itemView) {
            super(itemView);

            txtData2 = itemView.findViewById(R.id.dataText2);
        }
    }
}
