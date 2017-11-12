package com.example.team6.oose_sched_plan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import butterknife.ButterKnife;

/**
 * Created by Thomas on 11/10/2017.
 */

public class OptionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_options, container, false);
        ButterKnife.inject(this, view);
        // Set the ViewPagerAdapter into ViewPager
        return view;
    }
}
