package com.passionategeekz.learnpython.data;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.passionategeekz.learnpython.R;

public class Attributes extends Fragment {
        private java.lang.String at="To code in Python, you'll need to understand how properties are assigned to classes and objects";
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.attributes, container, false);
        TextView t =(TextView)view.findViewById(R.id.at);
        t.setText(at);
        return view;
    }
}
