package com.abhishek.viewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                return new fragment1();

            case 1:
                return new fragment2();
            case 2:
                return new fragment3();
        default:
            return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int i) {

        switch(i){
            case 0:
                return "CHATS";

            case 1:
                return "STATUS";
            case 2:
                return "CALL";
            default:
                return "";

    }}

    @Override
    public int getCount() {
        return 3;
    }
}
