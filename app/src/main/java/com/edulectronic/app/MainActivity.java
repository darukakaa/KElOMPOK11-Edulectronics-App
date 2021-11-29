package com.edulectronic.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button materi;
    private Button informasi;
    private Button home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materi = (Button) findViewById(R.id.materi);
        materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendaftarisi();

            }
        });
        informasi = (Button) findViewById(R.id.informasi);
        informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openinformasi();
            }
        });
        home = (Button) findViewById(R.id.home);
        home.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainactivity();
            }
        }));
    }
    public void opendaftarisi(){
        Intent intent = new Intent(this, daftarisi.class);
        startActivity(intent);
    }
    public void openinformasi(){
        Intent intent = new Intent(this, Informasi.class);
        startActivity(intent);
    }
    public void openMainactivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}