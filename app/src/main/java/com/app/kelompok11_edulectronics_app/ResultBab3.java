package com.app.kelompok11_edulectronics_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultBab3 extends AppCompatActivity {

    TextView txt_nilai,txt_comment;
    Button cobalagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_bab3);

        txt_nilai = findViewById(R.id.txt_nilai);
        txt_comment = findViewById(R.id.txt_comment);
        cobalagi = findViewById(R.id.btn_cobalagi);

        int nilai = getIntent().getExtras().getInt("nilai");
        txt_nilai.setText(String.valueOf(nilai));

        if(nilai >= 80) {
            txt_comment.setText("Hasilmu Bagus");
        }else if(nilai >= 60){
            txt_comment.setText("Hasilmu Cukup Bagus");
        }else {
            txt_comment.setText("kamu perlu belajar lagi");
        }

        cobalagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ResultBab3.this, LatihanBab3.class);
                startActivity(i);
                finish();
            }
        });
    }
}