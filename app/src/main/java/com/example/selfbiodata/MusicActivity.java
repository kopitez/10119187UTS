//Tanggal Pengerjaan : 17-5-2022
//NIM : 10119187
//Nama : Alvin Algadri
//Kelas : IF-5

package com.example.selfbiodata;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MusicActivity extends AppCompatActivity {
    RecyclerView recyclerView2;
    LinearLayoutManager linearLayoutManager2;
    AdapterData2 adapterData2;
    List<String> listData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        recyclerView2 = findViewById(R.id.rvData2);
        listData2 = new ArrayList<>();

        listData2.add("Kendrick Lamar - Money Trees");
        listData2.add("Juice WRLD - Robbery");
        listData2.add("Carly Rae Jepsen - Call Me Maybe");
        listData2.add("Hoobastank - The Reason");
        listData2.add("Linkin Park - One More Light");
        listData2.add("Aimer - Torches");
        listData2.add("Man With A Mission - My Hero");
        listData2.add("Yung Lean - Kyoto");

        linearLayoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(linearLayoutManager2);

        adapterData2 = new AdapterData2(this, listData2);
        recyclerView2.setAdapter(adapterData2);
        adapterData2.notifyDataSetChanged();
    }
}