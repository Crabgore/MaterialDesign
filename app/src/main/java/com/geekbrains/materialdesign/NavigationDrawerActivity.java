package com.geekbrains.materialdesign;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class NavigationDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        initToolBar();
        initFab();
        initDrawer();
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) drawerLayout.closeDrawer(GravityCompat.START);
        else super.onBackPressed();
    }

    private void initToolBar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void initFab() {
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(v -> Toast.makeText(getApplicationContext(), "fab clicked", Toast.LENGTH_SHORT).show());
    }

    private void initDrawer() {
        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        switch (id) {
            case R.id.nav_home:
                Toast.makeText(this, "home clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_gallery:
                Toast.makeText(this, "gallery clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_slideshow:
                Toast.makeText(this, "slideshow clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_tools:
                Toast.makeText(this, "tools clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_share:
                Toast.makeText(this, "share clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_send:
                Toast.makeText(this, "send clicked", Toast.LENGTH_SHORT).show();
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
