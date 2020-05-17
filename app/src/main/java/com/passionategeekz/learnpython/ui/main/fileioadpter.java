package com.passionategeekz.learnpython.ui.main;

import android.content.Context;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.passionategeekz.learnpython.R;
import com.passionategeekz.learnpython.introduction;
import  com.passionategeekz.learnpython.data.File_Basic;
import  com.passionategeekz.learnpython.data.Reading_file;
import  com.passionategeekz.learnpython.data.Navigating;
import  com.passionategeekz.learnpython.data.Writing;
import  com.passionategeekz.learnpython.data.Reading_and_Writing;
import  com.passionategeekz.learnpython.data.Complex_Objects;


public class fileioadpter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.File, R.string.Reading, R.string.Navigating, R.string.Writing, R.string.readandwrite, R.string.Complex};
    private final Context mContext;

    public fileioadpter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                File_Basic file_basic= new File_Basic();
                return file_basic;

            case 1:
                Reading_file reading_file = new Reading_file();
                return reading_file;
            case 2:
                Navigating navigating= new Navigating();
                return navigating;

            case 3:
                Writing writing = new Writing();
                return writing;
            case 4:
                Reading_and_Writing reading_and_writing= new Reading_and_Writing();
                return reading_and_writing;

            case 5:
                Complex_Objects complex_objects = new Complex_Objects();
                return complex_objects;
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 6;
    }

    @Override
    public CharSequence getPageTitle (int i)
    {
        switch (i)
        {
            case 0:
                return "File Basic";
            case 1:
                return "Reading file";
            case 2:
                return "Navigating";
            case 3:
                return "Writing";
            case 4 :
                return "Reading and Writing";
            case 5:
                return "Complex Objects";

        }
        return null;
    }
}
