package com.example.team6.oose_sched_plan;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Thomas on 11/4/2017.
 */

public class ViewScheduleFragment extends Fragment {

    @InjectView(R.id.elist)
    ExpandableListView elist;

    List<String> expandableListTerm;
    static HashMap<String, List<String>> expandableListCourses;
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    private String year_instance = "";

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_schedule, container, false);
        ButterKnife.inject(this, view);

        Bundle args = getArguments();
        try {
            year_instance = args.getString("YEAR");
        } catch (NullPointerException e) {
            year_instance = "-1";
        }

//        if ( args != null) {
//            year_instance = args.getString("YEAR");
//        }
//        else {
//            year_instance = "-1";
//        }

        // create new hash map with course info
        expandableListCourses = ExpandableListData.getData(year_instance);
        expandableListTerm = new ArrayList<>(expandableListCourses.keySet());
        expandableListView= elist;
            // Set the expandable list view to layout

        expandableListAdapter = new ExpandableListScheduleAdapter(this.getContext(),expandableListTerm,expandableListCourses);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.expandGroup(2);
//        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
//
//                @Override
//                public void onGroupExpand(int groupPosition) {
//                    Toast.makeText(view.getContext(),
//                            expandableListTerm.get(groupPosition) + " List Expanded.",
//                            Toast.LENGTH_SHORT).show();
//                }
//            });
//
//        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
//
//                @Override
//                public void onGroupCollapse(int groupPosition) {
//                    Toast.makeText(view.getContext(),
//                            expandableListTerm.get(groupPosition) + " List Collapsed.",
//                            Toast.LENGTH_SHORT).show();
//
//                }
//            });
//
//        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
//                @Override
//                public boolean onChildClick(ExpandableListView parent, View v,
//                                            int groupPosition, int childPosition, long id) {
////                    Toast.makeText(
////                            view.getContext(),
////                            expandableListTerm.get(groupPosition)
////                                    + " -> "
////                                    + expandableListCourses.get(
////                                    expandableListTerm.get(groupPosition)).get(
////                                    childPosition), Toast.LENGTH_SHORT
////                    ).show();
//                    return false;
//                }
//            });
        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
