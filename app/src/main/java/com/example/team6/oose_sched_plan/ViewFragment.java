package com.example.team6.oose_sched_plan;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import butterknife.ButterKnife;
import butterknife.InjectView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewFragment extends Fragment {
    @InjectView(R.id.pager)
    ViewPager pager;
    public static String[] str_uniqueYears = {};
//    @InjectView(R.id.sliding_tabs)
//    TabLayout slidingTabs;

    public static Schedule schedule;
    public static FragmentManager manager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view, container, false);
        ButterKnife.inject(this, view);

        uniqueYear(view);
        // Set the ViewPagerAdapter into ViewPager

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        manager = getChildFragmentManager();

        for (String str_uniqueYear : str_uniqueYears) {
            Fragment scheduleFragment = new ViewScheduleFragment();
            //manager = getChildFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            Bundle args = new Bundle();
            //args.putInt(ARG_PAGE_NUMBER, page);
            scheduleFragment.setArguments(args);
            transaction.add(R.id.pager, scheduleFragment, str_uniqueYear);
            transaction.commit();
        }
        ViewPager viewPager = pager;
        viewPager.setAdapter(new TabsPagerAdapter(view, getChildFragmentManager()));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    // Get the unique years to load the TabAdapterStrip
    public void uniqueYear(View view) {
        DegreePlanAdapter.FeedReaderDbHelper mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(view.getContext());
        Set<String> setUniqueYears = new HashSet<>();
        schedule = new Schedule();

        //Load the schedule
        schedule.Load(view.getContext(), Config.FILENAME, mDbHelper);
        ArrayList<Semester> semesters = schedule.getSemesters();

        // Get every semester in the schedule, add each year to a set
        for (Semester s : semesters) {
            setUniqueYears.add(String.valueOf(s.year));
        }

        //Convert Set to String
        str_uniqueYears = setUniqueYears.toArray(str_uniqueYears);

        int[] array_years = new int[str_uniqueYears.length];
        for (int i = 0; i < str_uniqueYears.length; i++) {
            array_years[i] = Integer.parseInt(str_uniqueYears[i]);
        }

        //Sort the int array
        Arrays.sort(array_years);

        //Convert back to string
        for (int i = 0; i < array_years.length; i++) {
            str_uniqueYears[i] = String.valueOf(array_years[i]);
        }

        mDbHelper.close();
    }
}
