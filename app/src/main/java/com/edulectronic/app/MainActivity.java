package com.edulectronic.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button materi;

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
    }
    public void opendaftarisi(){
        Intent intent = new Intent(this, daftarisi.class);
        startActivity(intent);
    }
}