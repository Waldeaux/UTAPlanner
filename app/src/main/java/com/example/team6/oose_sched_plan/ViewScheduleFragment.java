package com.example.team6.oose_sched_plan;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleExpandableListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Thomas on 11/4/2017.
 */

public class ViewScheduleFragment extends Fragment {

    @InjectView(R.id.elist)
    ExpandableListView elist;

    private static String year_instance;
    private SimpleAdapter adapter;
    DegreePlanAdapter.FeedReaderDbHelper mDbHelper;

    // used for 2 line list items
    private static String[] from = new String[]{"course", "name"};
    private static int[] to = new int[]{android.R.id.text1, android.R.id.text2};
    private static int nativeLayout = android.R.layout.two_line_list_item;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);
        ButterKnife.inject(this, view);

        // Set the expandable list view to layout
        //ExpandableListView expListView= elist;

        ArrayList<String> year_group;
        //Create an instance of the SCHEDULE from ViewFragment
        //Schedule schedule = ViewFragment.schedule;
        //mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(view.getContext());
        //schedule.generateAvailableCourses(Term.Spring,Integer.parseInt(year_instance),mDbHelper);

        // Get the courses
        //listview_available.setAdapter(new SimpleAdapter(view.getContext(), list_HashMap_Available, nativeLayout, from, to));
        //expListView.setAdapter(new SimpleExpandableListAdapter(view.getContext(),));

        return view;
    }


    //    public void InflateViewSchedule() {
//        LayoutInflater vi = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View v = vi.inflate(R.layout.fragment_schedule, null);
//
//        /*
//        // fill in any details dynamically here
//        TextView textView = (TextView) v.findViewById(R.id.a_text_view);
//        textView.setText("your text");
//
//        // insert into main view
//        ViewGroup insertPoint = (ViewGroup) findViewById(R.id.insert_point);
//        insertPoint.addView(v, 0, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));
//        */
//    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
