package com.passionategeekz.learnpython.ui.main;

import android.content.Context;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.passionategeekz.learnpython.R;
import com.passionategeekz.learnpython.introduction;
import com.passionategeekz.learnpython.data.Getting_Time;
import com.passionategeekz.learnpython.data.Getting_Websites;
import com.passionategeekz.learnpython.data.Downloading_file;



public class conncetionadpater extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.gettingtime, R.string.gettingweb,R.string.downloading};
    private final Context mContext;

    public conncetionadpater (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Getting_Time in = new Getting_Time();
                return in;

            case 1:
                Getting_Websites inn = new Getting_Websites();
                return inn;

            case 2:
                Downloading_file downloading_file= new Downloading_file();
                return  downloading_file;
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle (int i)
    {
        switch (i)
        {
            case 0:
                return "Getting Time";
            case 1:
                return "Getting Websites";
            case 2:
                return "Downloading file" ;

        }
        return null;
    }
}
