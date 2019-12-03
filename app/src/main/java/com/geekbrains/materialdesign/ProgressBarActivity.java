package com.geekbrains.materialdesign;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class ProgressBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        ProgressBar round = findViewById(R.id.round);
        ProgressBar line = findViewById(R.id.line);

        findViewById(R.id.show).setOnClickListener(v -> {
            round.setVisibility(View.VISIBLE);
            line.setVisibility(View.VISIBLE);
        });
        findViewById(R.id.hide).setOnClickListener(v -> {
            round.setVisibility(View.GONE);
            line.setVisibility(View.GONE);
        });
    }
}
