package com.app.kelompok11_edulectronics_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bab1 extends AppCompatActivity {
    private Button ltslbab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab1);

        ltslbab1 = (Button) findViewById(R.id.ltslbab1);
        ltslbab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openlatsol1(); }
        });
    }
    public void openlatsol1(){
        Intent intent = new Intent(this, LatihanSoalBab1.class);
        startActivity(intent);
    }
}