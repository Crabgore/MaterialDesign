package com.geekbrains.materialdesign.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.geekbrains.materialdesign.R;
import com.google.android.material.snackbar.Snackbar;

public class ButtonsActivity extends AppCompatActivity {

    private static final String TAG = "Buttons";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        initUI();
    }

    private void initUI() {
        findViewById(R.id.flat).setOnClickListener(v -> Log.d(TAG, "Flat clicked"));
        findViewById(R.id.bordered).setOnClickListener(v -> Log.d(TAG, "Bordered clicked"));
        findViewById(R.id.raised).setOnClickListener(v -> Log.d(TAG, "Raised clicked"));
        findViewById(R.id.raisedColored).setOnClickListener(v -> Log.d(TAG, "Raised Colored clicked"));
        findViewById(R.id.fab).setOnClickListener(this::makeSnack);
    }

    private void makeSnack(final View view) {
        Snackbar snackbar = Snackbar.make(view, "Snackbar", Snackbar.LENGTH_LONG);

        snackbar.setAction("Action", v -> Log.d(TAG, "clicked"));

        snackbar.show();
    }
}
