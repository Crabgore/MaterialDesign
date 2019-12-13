package com.geekbrains.materialdesign.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.geekbrains.materialdesign.R;
import com.geekbrains.materialdesign.adapters.MyTabAdapter;
import com.geekbrains.materialdesign.fragments.Fragment1;
import com.geekbrains.materialdesign.fragments.Fragment2;
import com.geekbrains.materialdesign.fragments.Fragment3;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class TabsActivity extends AppCompatActivity {
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ArrayList<String> strings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        initUI();

        initFragments();

        initPager();
    }

    private void initUI() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void initFragments() {
        Fragment fragment1 = new Fragment1();
        Fragment fragment2 = new Fragment2();
        Fragment fragment3 = new Fragment3();

        fragments.add(fragment1);
        fragments.add(fragment2);
        fragments.add(fragment3);

        strings.add("Tab 1");
        strings.add("Tab 2");
        strings.add("Tab 3");
    }

    private void initPager() {
        MyTabAdapter myTabAdapter = new MyTabAdapter(getSupportFragmentManager(), fragments, strings);

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(myTabAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
