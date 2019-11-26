package com.geekbrains.materialdesign;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.telephony.mbms.MbmsErrors;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

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
    }

    private void start (Intent intent) {
        startActivity(intent);
    }
}
