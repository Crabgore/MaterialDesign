package com.geekbrains.materialdesign.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.geekbrains.materialdesign.R;
import com.geekbrains.materialdesign.fragments.Fragment1;
import com.geekbrains.materialdesign.fragments.Fragment2;
import com.geekbrains.materialdesign.fragments.Fragment3;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        initUI();
    }

    private void initUI() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        replaceFragment(new Fragment1());

        BottomNavigationView bottomNavigationView = findViewById(R.id.btv);
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener listener = menuItem -> {
        switch (menuItem.getItemId()) {
            case R.id.frag1:
                replaceFragment(new Fragment1());
                return true;
            case R.id.frag2:
                replaceFragment(new Fragment2());
                return true;
            case R.id.frag3:
                replaceFragment(new Fragment3());
                return true;
        }
        return false;
    };

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame, fragment)
                .commit();
    }
}
