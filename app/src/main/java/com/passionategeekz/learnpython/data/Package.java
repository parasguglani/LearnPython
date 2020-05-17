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

public class Package extends Fragment {

    private java.lang.String ag = "Python is an interpreted high-level programming language that excels at many different types of computing. It is used to run large, well-known websites. It is used to process log files and make sense of their contents. It might even be used to create some of your favorite games!";
    private java.lang.String[] b = {"Easy To Learn", "Massive Library Support", "Designing GUI in python is fun and easy", "Raspberry Pi", "Web Framework", "Fastest Growing Language", "Great at Automating regular tasks"};

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro, container, false);
        TextView t = (TextView) view.findViewById(R.id.textView2);
        t.setText(ag);
        ArrayAdapter<java.lang.String> adapter = new ArrayAdapter<java.lang.String>(getActivity(), R.layout.listv, b);
        ListView lv = (ListView) view.findViewById(R.id.lb);
        lv.setAdapter(adapter);

        return view;
    }
}