//Tanggal Pengerjaan : 17-5-2022
//NIM : 10119187
//Nama : Alvin Algadri
//Kelas : IF-5

package com.example.selfbiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Walkthrough extends AppCompatActivity {


    private Button btnNext;
    private Button btnSkip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);


        btnNext = findViewById(R.id.btn_next);
        btnSkip = findViewById(R.id.btn_skip);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Walkthrough.this, Walkthrough2.class);
                startActivity(intent);


            }


        });

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Walkthrough.this, BiodataActivity.class);
                startActivity(intent);


            }


        });
    }
}

