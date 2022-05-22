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

public class Walkthrough2 extends AppCompatActivity {


    private Button btnNext2;
    private Button btnSkip2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough2);


        btnNext2 = findViewById(R.id.btn_next2);
        btnSkip2 = findViewById(R.id.btn_skip2);

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Walkthrough2.this, Walkthrough3.class);
                startActivity(intent);


            }


        });

        btnSkip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Walkthrough2.this, BiodataActivity.class);
                startActivity(intent);


            }


        });
    }
}

