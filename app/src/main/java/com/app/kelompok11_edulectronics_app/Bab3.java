package com.app.kelompok11_edulectronics_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bab3 extends AppCompatActivity {
    private Button latbab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab3);

        latbab3 = (Button) findViewById(R.id.latbab3);
        latbab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openlat3(); }
        });
    }
    public void openlat3(){
        Intent intent = new Intent(this, LatihanBab3.class);
        startActivity(intent);
    }
}