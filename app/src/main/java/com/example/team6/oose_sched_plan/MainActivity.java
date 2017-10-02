package com.example.team6.oose_sched_plan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;


/*========================================================
|  This class holds the view for both ViewFragment and Generate Fragment
|
|
========================================================*/
public class MainActivity extends AppCompatActivity   {

    private Intent intent;
    DegreePlanAdapter mDbHelper;
    FragmentTransaction transaction;

    // The OnClick listeners allows for events to occur when buttons on the BottomNaviation are pressed.
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_view:
                    setTitle("View Schedules");
                    //ViewFragment fragment = new ViewFragment();
                    transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fram, new ViewFragment());
                    transaction.commit();
                    return true;
                case R.id.navigation_generate:
                    setTitle("Generate Schedules");
                    //Toast.makeText(MainActivity.this, "Generate", Toast.LENGTH_SHORT).show();
                    //GenerateFragment fragment2 = new GenerateFragment();
                    transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fram, new GenerateFragment());
                    transaction.commit();
                    return true;
                case R.id.navigation_sort:
                    return true;
            }
            return false;
        }

      };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDbHelper = new DegreePlanAdapter(this);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // Initialize the view to View Schedules
        setTitle("View Schedules");
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fram, new ViewFragment());
        transaction.commit();
    }
}
