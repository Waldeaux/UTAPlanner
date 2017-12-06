package com.example.team6.oose_sched_plan;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;
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
    private Context context;

    @InjectView(R.id.courseSwitch)
    public Switch courseToggleXML;
    public Switch courseToggle;

    @InjectView(R.id.electiveSwitch)
    public Switch electiveToggleXML;
    public Switch electiveToggle;

    @InjectView(R.id.Reset)
    public Button removeButtonXML;
    public Button removeButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_options, container, false);
        context = view.getContext();
        ButterKnife.inject(this, view);
        // Set the ViewPagerAdapter into ViewPager

        mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(view.getContext());
        schedule = new Schedule();
        schedule.Load(view.getContext(), Config.FILENAME, mDbHelper);

        //Switches
        courseToggle = courseToggleXML;
        electiveToggle = electiveToggleXML;
        courseToggle.setChecked(schedule.getCheckReqs());
        electiveToggle.setChecked(schedule.getCheckElectives());

        removeButton = removeButtonXML;

        courseToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(courseToggle.isChecked()) {
                    schedule.enableCheckReqs();
                    schedule.Save(context, Config.FILENAME);
                } else {
                    schedule.disableCheckReqs();
                    schedule.Save(context, Config.FILENAME);
                }
            }
        });

        electiveToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(electiveToggle.isChecked()) {
                    schedule.enableCheckElectives();
                    schedule.Save(context, Config.FILENAME);
                } else {
                    schedule.disableCheckElectives();
                    schedule.Save(context, Config.FILENAME);
                }
            }
        });

        removeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                context.deleteFile(Config.FILENAME);
            }
        });

        return view;
    }
}
