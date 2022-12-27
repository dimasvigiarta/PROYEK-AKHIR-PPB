package com.example.divstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    TextView textViewName, textViewHarga;
    ImageView gambar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textViewName = findViewById(R.id.textViewName);
        textViewHarga = findViewById(R.id.textViewHarga);
        gambar2 = findViewById(R.id.gambar2);


        String gambar = getIntent().getStringExtra("gambar");
        String name = getIntent().getStringExtra("name");
        String harga = getIntent().getStringExtra("harga");

        textViewName.setText(name);
        textViewHarga.setText(harga);
        Glide.with(getApplicationContext()).load(gambar).into(gambar2);
    }
}