package com.passionategeekz.learnpython;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.passionategeekz.learnpython.ui.main.Introadapter;

public class intro extends AppCompatActivity {

    private String ag="Python is an interpreted high-level programming language that excels at many different types of computing. It is used to run large, well-known websites. It is used to process log files and make sense of their contents. It might even be used to create some of your favorite games!";
    private  String[]b={"Easy To Learn","Massive Library Support","Designing GUI in python is fun and easy","Raspberry Pi","Web Framework","Fastest Growing Language","Great at Automating regular tasks"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Introadapter Introadapter = new Introadapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(Introadapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }
}