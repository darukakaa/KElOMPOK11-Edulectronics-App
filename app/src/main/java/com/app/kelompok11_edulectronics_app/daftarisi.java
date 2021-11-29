package com.app.kelompok11_edulectronics_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class daftarisi extends AppCompatActivity {
    private Button b1komp;
    private Button b1an;
    private Button b2ohm;
    private Button b2seri;
    private Button vidmatr;
    private Button home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarisi);

        b1komp = (Button) findViewById(R.id.b1kom);
        b1komp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openkomp();
            }
        });
        b2ohm = (Button) findViewById(R.id.b2ohm);
        b2ohm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openbohm(); }
        });
        b2seri = (Button) findViewById(R.id.b2seri);
        b2seri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openseri(); }
        });
        vidmatr = (Button) findViewById(R.id.vidmatr);
        vidmatr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openvidmtr();}
        });

    }
    public void openkomp(){
        Intent intent = new Intent(this, Bab1.class);
        startActivity(intent);
    }
    public void openbohm(){
        Intent intent = new Intent(this, Bab2.class);
        startActivity(intent);
    }
    public void openseri(){
        Intent intent = new Intent(this, Bab3.class);
        startActivity(intent);
    }
    public void openvidmtr(){
        Intent intent = new Intent(this, Videorangkumanmateri.class);
        startActivity(intent);
    }
}