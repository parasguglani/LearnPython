package com.passionategeekz.learnpython.ui.main;

import android.content.Context;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.passionategeekz.learnpython.R;
import com.passionategeekz.learnpython.introduction;
import  com.passionategeekz.learnpython.data.Intro_To_Socket;
import  com.passionategeekz.learnpython.data.Remote_IP;
import  com.passionategeekz.learnpython.data.Handleing_Socket;
import  com.passionategeekz.learnpython.data.Create_Socket_Client;
import  com.passionategeekz.learnpython.data.createsocketserver;


public class networkingadpter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.Intro, R.string.Remote, R.string.Handleing, R.string.createsock, R.string.Createsockclient};
    private final Context mContext;

    public networkingadpter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Intro_To_Socket intro_to_socket = new Intro_To_Socket();
                return intro_to_socket;

            case 1:
                Remote_IP remote_ip = new Remote_IP();
                return remote_ip;
            case 2:
                Handleing_Socket handleing_socket = new Handleing_Socket();
                return handleing_socket;

            case 3:
                Create_Socket_Client create_socket_client = new Create_Socket_Client();
                return create_socket_client;
            case 4:
                createsocketserver in = new createsocketserver();
                return in;

            case 5:
                introduction inn = new introduction();
                return inn;
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
                return "Intro To Socket";
            case 1:
                return "Remote IP";
            case 2:
                return "Handleing Socket";
                case 3:
                    return  "Create Socket Server";
            case 4:
                return "Create Socket Client";
        }
        return null;
    }
}
