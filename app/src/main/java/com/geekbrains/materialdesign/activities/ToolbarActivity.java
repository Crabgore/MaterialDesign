package com.geekbrains.materialdesign.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.geekbrains.materialdesign.R;

import java.util.Objects;

public class ToolbarActivity extends AppCompatActivity {

    private static final String TAG = "Toolbar";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        initUI();
    }

    private void initUI() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_round);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            Log.d(TAG, "onOptionsItemSelected");
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
