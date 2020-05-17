package com.passionategeekz.learnpython.ui.main;

import android.content.Context;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.passionategeekz.learnpython.R;
import com.passionategeekz.learnpython.data.Interpreter;
import com.passionategeekz.learnpython.introduction;
import com.passionategeekz.learnpython.data.Number;
import  com.passionategeekz.learnpython.data.Stdio;
import  com.passionategeekz.learnpython.data.String;
import  com.passionategeekz.learnpython.data.Lists;




public class blockadpter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.interpreter, R.string.Number ,R.string.String,R.string.lists,R.string.Std };
    private final Context mContext;

    public blockadpter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Interpreter in = new Interpreter();
                return in;

            case 1:
                Number inn = new Number();
                return inn;

            case 2:
                String i = new String();
                return i;

            case 3:
                Lists l= new Lists();
                return l;

            case 4:
                Stdio st= new Stdio();
                return st;
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 5;
    }

    @Override
    public CharSequence getPageTitle (int i)
    {
        switch (i)
        {
            case 0:
                return "Interpreter";
            case 1:
                return "Number";
            case 2:
                return "String";
            case 3:
                return "Lists";
            case 4:
                return "Std I/O";

        }
        return null;
    }
}