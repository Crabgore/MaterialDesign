package com.geekbrains.materialdesign.activities;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.geekbrains.materialdesign.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class BottomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        initUI();
    }

    private void initUI() {
        LinearLayout bottomSheet = findViewById(R.id.bottom_sheet);
        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);

        findViewById(R.id.btn_sheet).setOnClickListener(v -> {
            if (bottomSheetBehavior.getState() == BottomSheetBehavior.STATE_HIDDEN) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            } else bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        });
    }
}
