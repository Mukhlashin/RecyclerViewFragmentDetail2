package com.example.recyclerviewfragmentdetail2.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.recyclerviewfragmentdetail2.Adapter.CategoryAdapter;
import com.example.recyclerviewfragmentdetail2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {

    RecyclerView rvCategory;
    CategoryAdapter adapter;


    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_category, container, false);
        rvCategory = layout.findViewById(R.id.rv_category);
        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        rvCategory.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
    }
}
