package com.passionategeekz.learnpython.ui.main;

import android.content.Context;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.passionategeekz.learnpython.R;
import com.passionategeekz.learnpython.introduction;
import  com.passionategeekz.learnpython.data.Module;
import com.passionategeekz.learnpython.data.Package;
import com.passionategeekz.learnpython.data.Classes;
import com.passionategeekz.learnpython.data.Attributes;
import com.passionategeekz.learnpython.data.Methods;


public class asadpter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.Module, R.string.Package, R.string.Classes , R.string.Attributes, R.string.Methods};
    private final Context mContext;

    public asadpter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                Module m= new Module();
                return m;

            case 1:
                Package p = new Package();
                return p;

            case 2:
                Classes cl = new Classes();
                return cl;

            case 3:
                Attributes at = new Attributes();
                return at;

            case 4:
                Methods mt = new Methods();
                return mt;


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
                return "Module";
            case 1:
                return "Package";
            case 2:
                return "Classes";
            case 3:
                return "Attributes";
            case 4:
                return "Methods";

        }
        return null;
    }
}