package com.geekbrains.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class SnackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        initUI();
    }

    private void initUI() {
        findViewById(R.id.btn).setOnClickListener(this::makeSnack);
    }

    private void makeSnack(final View view) {
        Snackbar snackbar = Snackbar.make(view, "Сообдение", Snackbar.LENGTH_LONG);

        snackbar.setAction("Action", v -> Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show());

        snackbar.show();
    }


}
