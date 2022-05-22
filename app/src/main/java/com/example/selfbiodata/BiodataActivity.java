//Tanggal Pengerjaan : 17-5-2022
//NIM : 10119187
//Nama : Alvin Algadri
//Kelas : IF-5

package com.example.selfbiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BiodataActivity extends AppCompatActivity {


    private ImageButton btnDaily;
    private ImageButton btnProfile;
    private ImageButton btnGalery;
    private ImageButton btnMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        btnDaily = findViewById(R.id.btn_daily);

        btnDaily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BiodataActivity.this, DailyActivity.class);
                startActivity(intent);


            }


        });

        btnProfile = findViewById(R.id.btn_profile);

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BiodataActivity.this, ProfileActivity.class);
                startActivity(intent);


            }


        });

        btnGalery = findViewById(R.id.btn_galery);

        btnGalery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BiodataActivity.this, GaleryActivity.class);
                startActivity(intent);


            }


        });

        btnMusic = findViewById(R.id.btn_music);

        btnMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BiodataActivity.this, MusicActivity.class);
                startActivity(intent);


            }


        });
    }
}

