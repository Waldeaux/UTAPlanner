package com.example.team6.oose_sched_plan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Thomas on 11/10/2017.
 */

public class OptionsFragment extends Fragment {
    private Schedule schedule;
    private DegreePlanAdapter.FeedReaderDbHelper mDbHelper;

    @InjectView(R.id.courseSwitch)
    public Switch courseToggleXML;
    public Switch courseToggle;

    @InjectView(R.id.electiveSwitch)
    public Switch electiveToggleXML;
    public Switch electiveToggle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_options, container, false);
        ButterKnife.inject(this, view);
        // Set the ViewPagerAdapter into ViewPager

        mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(view.getContext());
        schedule = new Schedule();
        schedule.Load(view.getContext(), Config.FILENAME, mDbHelper);

        //Switches
        courseToggle = courseToggleXML;
        electiveToggle = electiveToggleXML;

        courseToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(courseToggle.isChecked()) {
                    schedule.enableCheckReqs();
                } else {
                    schedule.disableCheckReqs();
                }
            }
        });

        electiveToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(electiveToggle.isChecked()) {
                    schedule.enableCheckElectives();
                } else {
                    schedule.disableCheckElectives();
                }
            }
        });

        return view;
    }






}
