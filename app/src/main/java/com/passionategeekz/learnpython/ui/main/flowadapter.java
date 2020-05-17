package com.passionategeekz.learnpython.ui.main;

import android.content.Context;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.passionategeekz.learnpython.R;
import com.passionategeekz.learnpython.introduction;
import  com.passionategeekz.learnpython.data.Conditional;
import  com.passionategeekz.learnpython.data.Looping_for;
import  com.passionategeekz.learnpython.data.Looping_while;
import com.passionategeekz.learnpython.data.Range;

public class flowadapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.Conditional, R.string.LoopingF, R.string.LoopingW,R.string.Range};
    private final Context mContext;

    public flowadapter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Conditional in = new Conditional();
                return in;

            case 1:
                Looping_for  inn = new Looping_for();
                return inn;

            case 2:
                Looping_while lw= new Looping_while();
                return lw;

            case 3:
                Range r= new Range();
                return r;
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
    @Override
    public CharSequence getPageTitle (int i)
    {
        switch (i)
        {
            case 0:
                return "Conditional";
            case 1:
                return "Looping for";
            case 2:
                return "Looping while";
            case 3:
                return "Range";

        }
        return null;
    }

}