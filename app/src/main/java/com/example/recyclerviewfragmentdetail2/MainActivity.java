package com.example.recyclerviewfragmentdetail2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.recyclerviewfragmentdetail2.Fragment.CategoryFragment;
import com.example.recyclerviewfragmentdetail2.Fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        fm.beginTransaction()
                .add(R.id.main_container, new HomeFragment()).addToBackStack("")
                .commit();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mn_home:
                fm.beginTransaction().replace(R.id.main_container, new HomeFragment()).commit();
                break;

            case R.id.mn_category:
                fm.beginTransaction().replace(R.id.main_container, new CategoryFragment()).commit();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
