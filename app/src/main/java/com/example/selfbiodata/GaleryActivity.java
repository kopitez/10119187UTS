//Tanggal Pengerjaan : 17-5-2022
//NIM : 10119187
//Nama : Alvin Algadri
//Kelas : IF-5

package com.example.selfbiodata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class GaleryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterGrid adapterGrid;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        recyclerView = findViewById(R.id.recycler_view2);
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<>();
                for (int i = 0; i < MyItem.judulGambar.length; i++){
                    data.add(new ItemModel(
                            MyItem.judulGambar[i],
                            MyItem.descGambar[i],
                            MyItem.gambar[i]
                    ));

        }

                adapterGrid = new AdapterGrid(data);
                recyclerView.setAdapter(adapterGrid);
    }
}