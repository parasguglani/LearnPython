package com.passionategeekz.learnpython.ui.main;

import android.content.Context;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.passionategeekz.learnpython.R;
import com.passionategeekz.learnpython.introduction;
import com.passionategeekz.learnpython.data.Stacks;
import com.passionategeekz.learnpython.data.Dictionaries;
import com.passionategeekz.learnpython.data.Interating_Data_Structures;

public class cdsadpter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.Stacks, R.string.Dictionaries, R.string.Interating};
    private final Context mContext;

    public cdsadpter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Stacks in = new Stacks();
                return in;

            case 1:
                Dictionaries inn = new Dictionaries();
                return inn;

            case 2:
                Interating_Data_Structures interating_data_structures = new Interating_Data_Structures();
                return  interating_data_structures;
        } return null;
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
                return "Lists,Stacks,Queue";
            case 1:
                return "Dictionaries";
            case 2:
                return "Interating Data Structures";


        }
        return null;
    }

}
