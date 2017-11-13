package com.example.team6.oose_sched_plan;


import android.os.Bundle;
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
    public static Schedule schedule;
    public static FragmentManager manager;

    public static final String ID = "ID";
    public static final String YEAR = "YEAR";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        manager = getChildFragmentManager();
        uniqueYear(view);
        for (String str_uniqueYear : str_uniqueYears) {
            if (str_uniqueYear != null) {
                Fragment scheduleFragment = newInstance(str_uniqueYear);
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.pager, scheduleFragment, str_uniqueYear);
                transaction.commit();
            }
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
        mDbHelper.close();
        // Get every semester in the schedule, add each year to a set
        for (Semester s : semesters) {
            setUniqueYears.add(String.valueOf(s.year));
        }

        //Convert Set to String
        String[] str = {};
        str= setUniqueYears.toArray(str);
        //str_uniqueYears= setUniqueYears.toArray(str_uniqueYears);

        //String array to int array
        int[] array_years = new int[str.length];
        str_uniqueYears = new String[str.length];


        for (int i = 0; i < str.length; i++) {
            array_years[i] = Integer.parseInt(str[i]);
        }

        //Sort the int array
        Arrays.sort(array_years);

        //Convert back to string
        for (int i = 0; i < array_years.length; i++) {
            str_uniqueYears[i] = String.valueOf(array_years[i]);
        }

    }

    public static ViewScheduleFragment newInstance(String year) {
        Bundle bundle = new Bundle();
        bundle.putString(YEAR, year);
        ViewScheduleFragment viewScheduleFragment = new ViewScheduleFragment();
        viewScheduleFragment.setArguments(bundle);
        return viewScheduleFragment;
    }
}
