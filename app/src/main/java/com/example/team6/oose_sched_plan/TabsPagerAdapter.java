package com.example.team6.oose_sched_plan;

/**
 * Created by Thomas on 11/4/2017.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.view.View;


public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(View v,FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // create new viewschedule instance
        String getyear = ViewFragment.str_uniqueYears[position];
        return ViewFragment.newInstance(getyear);
    }

    @Override
    public int getCount() {
        return ViewFragment.str_uniqueYears.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return ViewFragment.str_uniqueYears[position];
    }



}