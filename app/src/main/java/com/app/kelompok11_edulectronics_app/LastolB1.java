package com.app.kelompok11_edulectronics_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class LastolB1 extends AppCompatActivity {
    private Button proses;
    private RadioGroup radiogr1,radiogr2,radiogr3,radiogr4,radiogr5;
    private RadioButton value_no1,value_no2,value_no3,value_no4,value_no5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastol_b1);
        radiogr1 = findViewById(R.id.radiogroup1);
        radiogr2 = findViewById(R.id.radiogroup2);
        radiogr3 = findViewById(R.id.radiogroup3);
        radiogr4 = findViewById(R.id.radiogroup4);
        radiogr5 = findViewById(R.id.radiogroup5);

        proses = (Button) findViewById(R.id.proses);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pointa = radiogr1.getCheckedRadioButtonId();
                value_no1 = (RadioButton) findViewById(pointa);

                int pointb = radiogr2.getCheckedRadioButtonId();
                value_no2 = (RadioButton) findViewById(pointb);

                int pointc = radiogr3.getCheckedRadioButtonId();
                value_no3 = (RadioButton) findViewById(pointc);

                int pointd = radiogr4.getCheckedRadioButtonId();
                value_no4 = (RadioButton) findViewById(pointd);

                int pointe = radiogr5.getCheckedRadioButtonId();
                value_no5 = (RadioButton) findViewById(pointe);

                int nilai = 0; // variable untuk menampung nilai

                if(value_no1.getText().toString().toLowerCase().equals("c. Kumparan yang terbuat dari kabel panjang dan dililitkan")){
                    nilai = nilai + 20;
                }
                if(value_no2.getText().toString().toLowerCase().equals("a. B")) {
                    nilai = nilai + 20;
                }
                if(value_no3.getText().toString().toLowerCase().equals("d. Karbon Kasar")) {
                    nilai = nilai + 20;
                }
                if(value_no4.getText().toString().toLowerCase().equals("c. Resistor Tetap dan Variabel")) {
                    nilai = nilai + 20;
                }
                if(value_no5.getText().toString().toLowerCase().equals("d. A dan B benar")) {
                    nilai = nilai + 20;
                }
                Intent i = new Intent(LastolB1.this, ResultBab1.class);
                i.putExtra("nilai",nilai);
                startActivity(i);
                finish();
            }
        });
    }
}