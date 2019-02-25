package com.example.recyclerviewfragmentdetail2.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.recyclerviewfragmentdetail2.R;

// Pke alt enter ---------------------
class HomsAdapter extends RecyclerView.ViewHolder {
    LinearLayout ln;
    ImageView img;
    TextView tv;


    public HomsAdapter(@NonNull View itemView, Context context) {
        super(itemView);
        ln = itemView.findViewById(R.id.ll_homs);
        img = itemView.findViewById(R.id.img_homs);
        tv = itemView.findViewById(R.id.tv_homs);

    }
}
