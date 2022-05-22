//Tanggal Pengerjaan : 17-5-2022
//NIM : 10119187
//Nama : Alvin Algadri
//Kelas : IF-5

package com.example.selfbiodata;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;


import java.util.ArrayList;
import java.util.List;


public class DailyActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    AdapterData adapterData;
    List<String> listData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        recyclerView = findViewById(R.id.rvData);
        listData = new ArrayList<>();

        listData.add("Bangun Tidur");
        listData.add("Kuliah");
        listData.add("Solat");
        listData.add("Makan");
        listData.add("Mandi");
        listData.add("Nonton");
        listData.add("Mengerjakan Tugas");
        listData.add("Tidur");

        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapterData = new AdapterData(this, listData);
        recyclerView.setAdapter(adapterData);
        adapterData.notifyDataSetChanged();


    }
}