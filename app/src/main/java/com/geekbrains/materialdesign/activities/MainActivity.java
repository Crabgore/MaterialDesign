package com.geekbrains.materialdesign.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.geekbrains.materialdesign.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        findViewById(R.id.text).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TextActivity.class);
            start(intent);
        });
        findViewById(R.id.snack).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SnackActivity.class);
            start(intent);
        });
        findViewById(R.id.bottom_sheet).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BottomActivity.class);
            start(intent);
        });
        findViewById(R.id.buttons).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ButtonsActivity.class);
            start(intent);
        });
        findViewById(R.id.toolbar).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ToolbarActivity.class);
            start(intent);
        });
        findViewById(R.id.navigationDrawer).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NavigationDrawerActivity.class);
            start(intent);
        });
        findViewById(R.id.progressBar).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProgressBarActivity.class);
            start(intent);
        });
        findViewById(R.id.collapsing).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CollapsingActivity.class);
            start(intent);
        });
        findViewById(R.id.fab).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FabActivity.class);
            start(intent);
        });
        findViewById(R.id.recycler).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
            start(intent);
        });
        findViewById(R.id.tabs).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TabsActivity.class);
            start(intent);
        });
        findViewById(R.id.bna).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BottomNavigationActivity.class);
            start(intent);
        });
    }

    private void start (Intent intent) {
        startActivity(intent);
    }
}
