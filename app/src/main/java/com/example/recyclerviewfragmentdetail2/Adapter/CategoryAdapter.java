package com.example.recyclerviewfragmentdetail2.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.recyclerviewfragmentdetail2.R;

public class CategoryAdapter extends RecyclerView.Adapter<CategorsAdapter> {

    private final Context context;

    CategoryAdapter categoryAdapter;

    String[] namaCategory = {"Bantimurung Bulusaraung","Tanjung Bira","Danau Tempe","Permandian Air Panas Lejja","Malino","Pantai Losari","Benteng Rotterdam","Jalan Somba Opu","Pulau Takabonerate","Trans Studio"};
    int[] gambarTempat = {R.drawable.bantimurung, R.drawable.bira, R.drawable.danau_tempe, R.drawable.lejja, R.drawable.malino, R.drawable.pantai_losari, R.drawable.rotterdam, R.drawable.somba_opu, R.drawable.takabonerate, R.drawable.trans_studio};

    public CategoryAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategorsAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CategorsAdapter categorsAdapter, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

