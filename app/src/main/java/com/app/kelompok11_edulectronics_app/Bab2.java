package com.app.kelompok11_edulectronics_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bab2 extends AppCompatActivity {
    private Button latbab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab2);

        latbab2 = (Button) findViewById(R.id.latbab2);
        latbab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openlat2(); }
        });
    }
    public void openlat2(){
        Intent intent = new Intent(this, LatihanBab2.class);
        startActivity(intent);
    }
}