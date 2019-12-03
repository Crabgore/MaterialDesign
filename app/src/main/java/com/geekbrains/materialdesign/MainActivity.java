package com.geekbrains.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

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
    }

    private void start (Intent intent) {
        startActivity(intent);
    }
}
