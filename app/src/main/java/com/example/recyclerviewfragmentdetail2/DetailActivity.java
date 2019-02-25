package com.example.recyclerviewfragmentdetail2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

//    Membuat Variable class
    ImageView imgd;
    TextView tvd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

//        Untuk Menginisialisasi Variable yang dibuat di Atas
        tvd = findViewById(R.id.tv_detail);
        imgd = findViewById(R.id.img_detail);

//        Untuk Menangkap Data yang kita kita kirim dari onBindViewHolder pada class HomeAdapter
        imgd.setImageResource(getIntent().getIntExtra("b", 0));
        tvd.setText(getIntent().getStringExtra("a"));

    }
}
