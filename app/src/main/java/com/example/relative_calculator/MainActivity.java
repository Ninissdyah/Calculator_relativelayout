package com.example.relative_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText masukan1,masukan2;
    TextView result;
    Button penjumlahan;
    Button pengurangan;
    Button perkalian;
    Button pembagian;
    float angka1, angka2, getResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masukan1 = findViewById(R.id.masukan1);
        masukan2 = findViewById(R.id.masukan2);
        result = findViewById(R.id.result);
        penjumlahan = findViewById(R.id.penjumlahan);
        pengurangan = findViewById(R.id.pengurangan);
        perkalian = findViewById(R.id.perkalian);
        pembagian = findViewById(R.id.pembagian);

        penjumlahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                mengambil nilai pada kolom masukan menjadi angka

                angka1 = Integer.parseInt(masukan1.getText().toString());
                angka2 = Integer.parseInt(masukan2.getText().toString());

                getResult = angka1 + angka2;


//                menampilkan result
                result.setText(String.valueOf(getResult));
            }
        });

        pengurangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                mengambil nilai pada kolom masukan menjadi angka
                angka1 = Integer.parseInt(masukan1.getText().toString());
                angka2 = Integer.parseInt(masukan2.getText().toString());

                getResult = angka1 - angka2;

//                menampilkan result
                result.setText(String.valueOf(getResult));
            }
        });

        perkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                mengambil nilai pada kolom masukan menjadi angka
                angka1 = Integer.parseInt(masukan1.getText().toString());
                angka2 = Integer.parseInt(masukan2.getText().toString());

                getResult = angka1 * angka2;

//                menampilkan result
                result.setText(String.valueOf(getResult));
            }
        });

        pembagian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                mengambil nilai pada kolom masukan menjadi angka
                angka1 = Integer.parseInt(masukan1.getText().toString());
                angka2 = Integer.parseInt(masukan2.getText().toString());

                getResult = angka1 / angka2;

//                menampilkan result
                result.setText(String.valueOf(getResult));
            }
        });
    }

}