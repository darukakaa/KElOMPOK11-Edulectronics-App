package com.app.kelompok11_edulectronics_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button daftarisi;
    private Button informasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daftarisi = (Button) findViewById(R.id.daftarisi);
        daftarisi.setOnClickListener(new View.OnClickListener() {
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

    }
    public void opendaftarisi(){
        Intent intent = new Intent(this, daftarisi.class);
        startActivity(intent);
    }
    public void openinformasi(){
        Intent intent = new Intent(this, informasi.class);
        startActivity(intent);
    }


}