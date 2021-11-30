package com.app.kelompok11_edulectronics_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bab1 extends AppCompatActivity {
    private Button latbab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab1);

        latbab1 = (Button) findViewById(R.id.latbab1);
        latbab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openlat1(); }
        });
    }
    public void openlat1(){
        Intent intent = new Intent(this, LatihanBab1.class);
        startActivity(intent);
    }
}