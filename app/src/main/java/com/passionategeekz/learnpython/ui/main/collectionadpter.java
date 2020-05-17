package com.passionategeekz.learnpython.ui.main;

import android.content.Context;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.passionategeekz.learnpython.R;
import com.passionategeekz.learnpython.introduction;
import  com.passionategeekz.learnpython.data.Comprehensions;
import  com.passionategeekz.learnpython.data.List_Comprehensions;
import com.passionategeekz.learnpython.data.Dictionary_Comprehensions;
import  com.passionategeekz.learnpython.data.Maps;
import  com.passionategeekz.learnpython.data.Filter;
import  com.passionategeekz.learnpython.data.Lambdas;
import  com.passionategeekz.learnpython.data.Generators;



public class collectionadpter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.Comprehensions, R.string.ListC, R.string.DictionaryC, R.string.Maps, R.string.Filter, R.string.Lambdas,R.string.Generators};
    private final Context mContext;

    public collectionadpter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Comprehensions in = new Comprehensions();
                return in;

            case 1:
                List_Comprehensions list_comprehensions = new List_Comprehensions();
                return list_comprehensions;

            case 2:
                Dictionary_Comprehensions dc = new Dictionary_Comprehensions();
                return dc;

            case 3:
                Maps maps = new Maps();
                return maps;

            case 4:
                Filter filter = new Filter();
                return filter;

            case 5:
                Lambdas lambdas = new Lambdas();
                return lambdas;

            case 6:
                Generators generators = new Generators();
                return generators;
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 7;
    }

    @Override
    public CharSequence getPageTitle (int i)
    {
        switch (i)
        {
            case 0:
                return "Comprehensions";
            case 1:
                return "List Comprehensions";
            case 2:
                return "Dictionary Comprehensions";
            case 3:
                return "Maps";
            case 4:
                return "Filter";
            case 5:
                return "Lambdas";
            case 6:
                return "Generators";
        }
        return null;
    }
}