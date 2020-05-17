package com.passionategeekz.learnpython.ui.main;

import android.content.Context;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.passionategeekz.learnpython.R;
import com.passionategeekz.learnpython.data.Installation;
import com.passionategeekz.learnpython.introduction;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class Introadapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.introtab_text_1, R.string.intro_text_2};
    private final Context mContext;

    public Introadapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                introduction in = new introduction();
                return in;

            case 1:
                Installation inn = new Installation();
                return inn;
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }

    @Override
    public CharSequence getPageTitle (int i)
    {
        switch (i)
        {
            case 0:
                return "Introduction";
            case 1:
                return "Installation";

        }
        return null;
    }
}