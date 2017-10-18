package com.example.team6.oose_sched_plan;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GenerateFragment extends Fragment {


    @InjectView(R.id.spin_deg)
    Spinner spinDeg;
    @InjectView(R.id.spin_year)
    Spinner spinYear;
    @InjectView(R.id.ok_button)
    Button okButton;
    @InjectView(R.id.list_available)
    ListView listAvailable;

    public GenerateFragment() {

    }

    private Spinner spinner_major = null, spinner_year;
    private ListView list_available;
    private Button button_submit;
    private ArrayAdapter<String> dataAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_generate, container, false);
        ButterKnife.inject(this, view);
        addItemsOnSpinMajor();
        addItemsOnSpinYear();
        addItemsOnAvailable();
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();

        return view;
    }

    public void addItemsOnSpinMajor() {
        spinner_major = spinDeg;
        List<String> list_majors = new ArrayList<String>();
        list_majors.add("CSE - Computer Science Engineering");
        list_majors.add("SE - Software Engineering");
        list_majors.add("CPE - Computer Engineering");
        dataAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, list_majors);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_major.setAdapter(dataAdapter);
    }

    public void addItemsOnSpinYear() {
        spinner_year = spinYear;
        List<String> list_years = new ArrayList<String>();
        list_years.add("2017");
        list_years.add("2018");
        list_years.add("2019");
        list_years.add("2020");
        list_years.add("2021");
        dataAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, list_years);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_year.setAdapter(dataAdapter);
    }

    public void addItemsOnAvailable() {
        list_available = listAvailable;
        String[][] listview = {{"CSE 1310", "Intro to Programming"}, {"CSE 1105","Intro to CSE"}, {"MATH 1426", "Calculus I"}, {"PHYS 1443","Physics I"}};
        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>(listview.length);
        for (int i = 0; i < listview.length; i++) {
            HashMap<String, String> item = new HashMap<String, String>();
            item.put("course", listview[i][0] );
            item.put("number", listview[i][1]);
            list.add(item);
        }
        String[] from = new String[] { "course", "number" };
        int[] to = new int[] { android.R.id.text1, android.R.id.text2 };
        int nativeLayout = android.R.layout.two_line_list_item;

        list_available.setAdapter(new SimpleAdapter(this.getContext(), list, nativeLayout , from, to));
    }

    public void addListenerOnButton() {

    }

    public void addListenerOnSpinnerItemSelection() {
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
