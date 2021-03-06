//TODO: Only ask for major if schedule file doesn't exist.
package com.example.team6.oose_sched_plan;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

import java.io.File;

/**
 * A simple {@link Fragment} subclass.
 */
public class GenerateFragment extends Fragment {


    @InjectView(R.id.spin_term)
    Spinner spinTerm;
    @InjectView(R.id.spin_year)
    Spinner spinYear;
    @InjectView(R.id.list_available)
    ListView listAvailable;
    @InjectView(R.id.c_info_dep_number_field)
    TextView cInfoDepNumberField;
    @InjectView(R.id.c_info_coursename_field)
    TextView cInfoCoursenameField;
    @InjectView(R.id.c_info_descript_field)
    TextView cInfoDescriptField;
    @InjectView(R.id.c_info_coursecredit_field)
    TextView cInfoCoursecreditField;
    @InjectView(R.id.button_add)
    Button buttonAdd;
    @InjectView(R.id.list_current)
    ListView listCurrent;
    @InjectView(R.id.c_info_creditcategory_field)
    TextView cInfoCreditcategoryField;

    private Spinner spinner_term, spinner_year;
    private ArrayAdapter<String> dataAdapter;
    private ListView listview_available, listview_current;
    private Button button_add;
    private TextView cInfo_DepartmentNumber, cInfo_CourseName, cInfo_Description, cInfo_credit, cInfo_CreditCategory;
    private View row;

    private ArrayList<HashMap<String, String>> list_HashMap_Available = new ArrayList<>();
    private ArrayList<HashMap<String, String>> list_HashMap_Current = new ArrayList<>();

    private ArrayList<Course> list_course_available = new ArrayList<Course>();
    private ArrayList<Course> list_course_current;

    //store selected items
    private HashMap<String, String> selected_item;
    private int selected_position;
    private String degreeChosen = "";

    // used for 2 line list items
    private static String[] from = new String[]{"course", "name"};
    private static int[] to = new int[]{android.R.id.text1, android.R.id.text2};
    private static int nativeLayout = android.R.layout.two_line_list_item;

    //Database
    DegreePlanAdapter.FeedReaderDbHelper mDbHelper;
    SQLiteDatabase db;

    //Schedule
    Schedule schedule;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_generate, container, false);
        ButterKnife.inject(this, view);
        TinyDB tinydb = new TinyDB(view.getContext());

        //sharedPreferences = view.getContext().getSharedPreferences(Config.SHARED_PREF_NAME, view.getContext().MODE_PRIVATE);
        addItemsOnCurrentSchedule();

        //create add button
        button_add = buttonAdd;
        button_add.setBackgroundResource(R.drawable.b_button_deselected);

        schedule = new Schedule();
        mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(view.getContext());

//        alertDegreePlan(view,tinydb);
//        if (tinydb.getString(Config.SHARED_DEGREE_PLAN).equals(""))
//        {
        addItemsOnAvailable(view);
        File file = new File(view.getContext().getFilesDir(), Config.FILENAME);
        if (file.exists() ) {
            LoadTerms(view);
            schedule.Load(view.getContext(), Config.FILENAME, mDbHelper);
        }
        else {
            alertDegreePlan(view, tinydb);
        }
        mDbHelper.close();
        return view;
    }

    /* ================================================================
    ||  TERM - Gets info and populates "term" dropdown spinner.
        // TODO use query to add degree plans
    ||=================================================================*/
    public void addItemsOnSpinTerm() {
        spinner_term = spinTerm;
        List<String> list_terms = new ArrayList<String>();

        int spin_year;
        if (spinner_year.getSelectedItem().equals("Other")) {
            list_terms.add("Transfer");
            list_terms.add("High School");
            list_terms.add("Placement Exam");
        }
        else {
            list_terms.add("SPRING");
            list_terms.add("SUMMER");
            list_terms.add("FALL");
        }

        dataAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, list_terms);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_term.setAdapter(dataAdapter);

        spinner_term.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                int spin_year;
                if (spinner_year.getSelectedItem().equals("Other")) {
                    spin_year = 0;
                }
                else {
                    spin_year = Integer.parseInt(spinner_year.getSelectedItem().toString());
                }
                Term spin_term = Term.valueOf(StringToEnum(spinner_term.getSelectedItem().toString()));
                list_course_current = schedule.getCoursesInSemester(spin_term,spin_year);
                list_course_available = schedule.generateAvailableCourses(spin_term,spin_year,mDbHelper); //FIX: Update variable then pass it to convert hashmap
                mDbHelper.close();
                // CONVERT SCHEDULE TO HASHMAP
                list_HashMap_Current = convertToHashMap(list_course_current);
                list_HashMap_Available = convertToHashMap(list_course_available);

                // UPDATE the LISTVIEWS
                // ONLY NEEDS COURSE/NAME TO UPDATE THE LISTVIEWS
                listview_current.setAdapter(new SimpleAdapter(view.getContext(), list_HashMap_Current, nativeLayout, from, to));
                listview_available.setAdapter(new SimpleAdapter(view.getContext(), list_HashMap_Available, nativeLayout, from, to));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    /* ================================================================
    ||  TERM YEAR - Gets info and populates "Year" dropdown spinner.
        // TODO use query to add degree plan years
    ||=================================================================*/
    public void addItemsOnSpinYear() {
        spinner_year = spinYear;
        final List<String> list_years = new ArrayList<String>();
        list_years.add("Other");
        list_years.add("2017");
        list_years.add("2018");
        list_years.add("2019");
        list_years.add("2020");
        list_years.add("2021");
        dataAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, list_years);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_year.setAdapter(dataAdapter);

        spinner_year.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {;

                int spin_year;
                if (spinner_year.getSelectedItem().equals("Other")) {
                    spin_year = 0;
                }
                else {
                    spin_year = Integer.parseInt(spinner_year.getSelectedItem().toString());
                }

                //Term spin_term = Term.valueOf(spinner_term.getSelectedItem().toString());
                updateGUI(); // Updates the terms when year is selected
                spinner_term.setSelection(0);
                Term spin_term = Term.valueOf(StringToEnum(spinner_term.getSelectedItem().toString()));

                list_course_current = schedule.getCoursesInSemester(spin_term,spin_year);
                list_course_available = schedule.generateAvailableCourses(spin_term,spin_year,mDbHelper); //FIX: Update variable then pass it to convert hashmap
                mDbHelper.close();
                // CONVERT SCHEDULE TO HASHMAP
                list_HashMap_Current = convertToHashMap(list_course_current);
                list_HashMap_Available = convertToHashMap(list_course_available);

                // UPDATE the LISTVIEWS
                // ONLY NEEDS COURSE/NAME TO UPDATE THE LISTVIEWS
                listview_current.setAdapter(new SimpleAdapter(view.getContext(), list_HashMap_Current, nativeLayout, from, to));
                listview_available.setAdapter(new SimpleAdapter(view.getContext(), list_HashMap_Available, nativeLayout, from, to));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    /* ================================================================
    ||  AVAILABLE - Gets info and populates "Available courses" list_HashMap_Available. Allows user to select Course to update COURSE INFO;
    ||=================================================================*/
    public void addItemsOnAvailable(final View view) {
        listview_available = listAvailable;
        listview_available.setAdapter(new SimpleAdapter(this.getContext(), list_HashMap_Available, nativeLayout, from, to));
        listview_available.setClickable(true);
        listview_available.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3) {
                addItemsOnCourseInfo(list_HashMap_Available, position);
                selected_item = list_HashMap_Available.get(position);
                selected_position = position;

                listview_current.clearChoices();
                listview_current.setAdapter(new SimpleAdapter(v.getContext(), list_HashMap_Current, nativeLayout, from, to));
                if (row != null) {
                    row.setBackgroundResource(R.color.alpha);
                }
                row = v;
//                //v.setBackgroundResource(R.drawable.b_selected);

                addListenerOnAddButton();
            }
        });
    }

    /* ================================================================
    ||  COURSE INFO - Gets info from course selected,
    ||=================================================================*/
    public void addItemsOnCourseInfo(ArrayList<HashMap<String, String>> list, int position) {
        String department = list.get(position).get("course");
        String name = list.get(position).get("name");
        String description = list.get(position).get("description");
        String creditCategory = list.get(position).get("creditcategory");
        String creditHours = list.get(position).get("credithours");

        cInfo_DepartmentNumber = cInfoDepNumberField;
        cInfo_CourseName = cInfoCoursenameField;
        cInfo_Description = cInfoDescriptField;
        cInfo_credit = cInfoCoursecreditField;
        cInfo_CreditCategory = cInfoCreditcategoryField;

        cInfo_DepartmentNumber.setText(department);
        cInfo_CourseName.setText(name);
        cInfo_Description.setText(description);
        cInfo_credit.setText(creditHours);
        cInfo_CreditCategory.setText(creditCategory);
    }

    /* ================================================================
    ||  ADD Button - gets the SELECTED ITEM and puts it into the current schedule.
    ||  - does not do any validation currently
    ||=================================================================*/
    public void addListenerOnAddButton() {
        button_add = buttonAdd;
        button_add.setText(R.string.button_add);
        button_add.setBackgroundResource(R.drawable.b_button_selected);
        button_add.setOnClickListener(new AdapterView.OnClickListener() {
            public void onClick(View arg0) {
                if (selected_item != null) {

                    //Get info from spinner term/ year
                    int spin_year;
                    if (spinner_year.getSelectedItem().equals("Other")) {
                        spin_year = 0;
                    }
                    else {
                        spin_year = Integer.parseInt(spinner_year.getSelectedItem().toString());
                    }
                    //Term spin_term = Term.valueOf(spinner_term.getSelectedItem().toString());
                    Term spin_term = Term.valueOf(StringToEnum(spinner_term.getSelectedItem().toString()));
                    // Add the course to the SCHEDULE
                    schedule.addCourse(spin_term, spin_year, list_course_available.get(selected_position));
                    schedule.Save(arg0.getContext(), Config.FILENAME);
                    // UPDATE CURRENT COURSES
                    list_course_current = schedule.getCoursesInSemester(spin_term,spin_year);

                    // CONVERT SCHEDULE TO HASHMAP
                    list_HashMap_Current = convertToHashMap(list_course_current);
                    list_course_available = schedule.generateAvailableCourses(spin_term,spin_year,mDbHelper); //FIX: Update variable then pass it to convert hashmap
                    list_HashMap_Available = convertToHashMap(list_course_available);
                    mDbHelper.close();
                    //list_HashMap_Current.add(selected_item);
                    //list_HashMap_Available.remove(selected_position);
                    String[] from = new String[]{"course", "name"};
                    int nativeLayout = android.R.layout.two_line_list_item;
                    int[] to = new int[]{android.R.id.text1, android.R.id.text2};

                    listview_current.setAdapter(new SimpleAdapter(arg0.getContext(), list_HashMap_Current, nativeLayout, from, to));
                    listview_available.setAdapter(new SimpleAdapter(arg0.getContext(), list_HashMap_Available, nativeLayout, from, to));
                    listview_current.setClickable(true);
                    selected_item = null;
                    button_add.setBackgroundResource(R.drawable.b_button_deselected);
                }
            }
        });
    }

    //change to remove button
    public void addListenerOnRemoveButton() {
        button_add = buttonAdd;
        button_add.setText(R.string.button_remove);
        button_add.setBackgroundResource(R.drawable.b_button_remove);
        button_add.setOnClickListener(new AdapterView.OnClickListener() {
            public void onClick(View arg0) {
                if (selected_item != null) {
                    // GET SPINNER INFORMATION
                    int spin_year;
                    if (spinner_year.getSelectedItem().equals("Other")) {
                        spin_year = 0;
                    }
                    else {
                        spin_year = Integer.parseInt(spinner_year.getSelectedItem().toString());
                    }
                    //Term spin_term = Term.valueOf(spinner_term.getSelectedItem().toString());
                    Term spin_term = Term.valueOf(StringToEnum(spinner_term.getSelectedItem().toString()));
                    schedule.removeCourse(spin_term,spin_year,list_course_current.get(selected_position));
                    schedule.Save(arg0.getContext(), Config.FILENAME);


                    // UPDATE CURRENT COURSES
                    list_course_current = schedule.getCoursesInSemester(spin_term,spin_year);
                    list_course_available = schedule.generateAvailableCourses(spin_term,spin_year,mDbHelper); //FIX: Update variable then pass it to convert hashmap
                    mDbHelper.close();
                    // CONVERT SCHEDULE TO HASHMAP
                    list_HashMap_Current = convertToHashMap(list_course_current);
                    list_HashMap_Available = convertToHashMap(list_course_available);

                    // ONLY NEEDS COURSE/NAME TO UPDATE THE LISTVIEWS
                    String[] from = new String[]{"course", "name"};
                    int nativeLayout = android.R.layout.two_line_list_item;
                    int[] to = new int[]{android.R.id.text1, android.R.id.text2};

                    // UPDATE the LISTVIEWS
                    listview_current.setAdapter(new SimpleAdapter(arg0.getContext(), list_HashMap_Current, nativeLayout, from, to));
                    listview_available.setAdapter(new SimpleAdapter(arg0.getContext(), list_HashMap_Available, nativeLayout, from, to));
                    listview_current.setClickable(true);
                    selected_item = null;
                    button_add.setBackgroundResource(R.drawable.b_button_deselected);

                }

            }
        });
    }

    /* ================================================================
    ||  CURRENT SCHEDULE - LISTENS FOR ITEM CLICKS ON CURRENT TO UPDATE SELECTION
    ||=================================================================*/
    public void addItemsOnCurrentSchedule() {
        listview_current = listCurrent;
        listview_current.setAdapter(new SimpleAdapter(this.getContext(), list_HashMap_Current, nativeLayout, from, to));

        listview_current.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3) {

                // Update the COURSE INFO
                addItemsOnCourseInfo(list_HashMap_Current, position);
                selected_item = list_HashMap_Current.get(position);
                selected_position = position;


                listview_available.clearChoices();
                listview_available.setSelection(-1);
                listview_available.setAdapter(new SimpleAdapter(v.getContext(), list_HashMap_Available, nativeLayout, from, to));
                if (row != null) {
                    row.setBackgroundResource(R.color.alpha);
                }
                row = v;
//                //v.setBackgroundResource(R.drawable.b_selected);

                addListenerOnRemoveButton();

            }
        });
    }

    public void LoadTerms(View view) {
    //Delete all entries to avoid duplicates
        //DegreePlanInfo.DeleteAllEntries(view);

        mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(view.getContext());
        db = mDbHelper.getWritableDatabase();
        mDbHelper.onUpgrade(db, 1, 1);
        DegreePlanInfo.PopulateDatabase(db);


        addItemsOnSpinYear();
        addItemsOnSpinTerm();
        // Uses array list Courses enum
        list_course_available = schedule.generateAvailableCourses(Term.SPRING, 2017, mDbHelper);
        list_HashMap_Available = convertToHashMap(list_course_available);

//              Save degreePicked to tinyDB
//        degreeChosen = list_majors.getItem(which);

        //Update list
        String[] from = new String[]{"course", "name"};
        int[] to = new int[]{android.R.id.text1, android.R.id.text2};
        int nativeLayout = android.R.layout.two_line_list_item;

        // LOADS available list of courses
        listview_available.setAdapter(new SimpleAdapter(view.getContext(), list_HashMap_Available, nativeLayout, from, to));

        mDbHelper.close();
    }

    /* ================================================================
    ||  DEGREE PLAN - Alerts user with popup for Degree Plans.
    ||=================================================================*/
    public void alertDegreePlan(final View view, final TinyDB tinydb) {
        final AlertDialog.Builder builderSingle = new AlertDialog.Builder(this.getContext());
        builderSingle.setTitle("Select a Degree Plan: ");
        final ArrayAdapter<String> list_majors = new ArrayAdapter<String>(this.getContext(), android.R.layout.select_dialog_singlechoice);
        final AlertDialog.Builder builderYear = new AlertDialog.Builder(this.getContext());
        builderYear.setTitle("Select a Degree Plan Year: ");
        final ArrayAdapter<String> list_years = new ArrayAdapter<String>(this.getContext(), android.R.layout.select_dialog_singlechoice);

        ArrayList<String> queryMajors = Database.QueryDegreePlanNames(view.getContext());

        for (String s : queryMajors) {
            if (s.equals("CE")) {
                list_majors.add("CPE - Computer Engineering");
            }
            else if (s.equals("SE")) {
                list_majors.add("SE - Software Engineering");
            }
            else {
                list_majors.add("CSE - Computer Science Engineering");
            }
        }

        builderSingle.setAdapter(list_majors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (which == 0)
                    schedule.setMajor(new DegreePlan("CSE",0,0));
                else if (which == 1)
                    schedule.setMajor(new DegreePlan("CS",0,0));
                else if (which == 2)
                    schedule.setMajor(new DegreePlan("SE",0,0));

                int chosen_Degree = which;
                builderYear.show();
            }
        });
        builderSingle.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                builderSingle.show();
            }
        });
        
        list_years.add("2017");
        list_years.add("2016");
        list_years.add("2015");


        builderYear.setAdapter(list_years, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                LoadTerms(view);
            }
        });

        builderYear.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                builderYear.show();
            }
        });

        builderSingle.show();

    }

    /* ================================================================
    ||  FUNCTION TO CONVERT - ARRAY LIST<COURSE> -->  ARRAY_LIST<HASHMAP<STRING,STRING>>
    ||=================================================================*/
    public ArrayList<HashMap<String, String>> convertToHashMap(ArrayList<Course> course_list) {
        ArrayList<HashMap<String, String>> list_course_hashmap = new ArrayList<>();
        for (Course course : course_list) {
            HashMap<String, String> course_hashmap = new HashMap<>();
            course_hashmap.put("course", String.valueOf(course.department) + String.valueOf(course.number));
            course_hashmap.put("name", String.valueOf(course.name));
            course_hashmap.put("description", String.valueOf(course.description));
            course_hashmap.put("creditcategory", String.valueOf(course.creditCategory));
            course_hashmap.put("credithours", String.valueOf(course.creditHours));
            list_course_hashmap.add(course_hashmap);
        }
        return list_course_hashmap;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void updateGUI() {
        List<String> list_terms = new ArrayList<String>();
        int spin_year;
        if (spinner_year.getSelectedItem().equals("Other")) {
            list_terms.add("Transfer");
            list_terms.add("High School");
            list_terms.add("Placement Exam");
        }
        else {
            list_terms.add("SPRING");
            list_terms.add("SUMMER");
            list_terms.add("FALL");
        }

        dataAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, list_terms);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_term.setAdapter(dataAdapter);
    }

    private String StringToEnum(String str) {
        str = str.toUpperCase();
        str = str.replace(" ","");
        return str;
    }
}
