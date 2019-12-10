package com.geekbrains.materialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    private List<String> list;
    private List<Drawable> drawables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        initLists();

        initRecycler();
    }

    private void initLists() {
        list = new ArrayList<>();
        list.add("Знак Кхорна");
        list.add("Знак Нургла");
        list.add("Знак Слаанеш");
        list.add("Знак Тзинча");

        drawables = new ArrayList<>();
        drawables.add(getDrawable(R.drawable.khorne_mark));
        drawables.add(getDrawable(R.drawable.nurgle_mark));
        drawables.add(getDrawable(R.drawable.slaanesh_mark));
        drawables.add(getDrawable(R.drawable.tzeentch_mark));
    }

    private void initRecycler() {
        RecyclerView recyclerView = findViewById(R.id.recycler);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        MyAdapter myAdapter = new MyAdapter(this, list, drawables);
        recyclerView.setAdapter(myAdapter);

        DividerItemDecoration itemDecoration = new DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL);
        itemDecoration.setDrawable(getResources().getDrawable(R.drawable.separator));
        recyclerView.addItemDecoration(itemDecoration);
    }
}
