package com.geekbrains.materialdesign.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.geekbrains.materialdesign.R;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment, container, false);

        initUI(layout);

        return layout;
    }

    private void initUI(View layout) {
        TextView textView = layout.findViewById(R.id.title);
        textView.setText("Fragment #1");
    }
}
