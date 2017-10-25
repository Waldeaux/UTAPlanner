package com.example.team6.oose_sched_plan;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Thomas on 9/29/2017.
 */

public class DegreePlanInfo {

    public static void PopulateDatabase(SQLiteDatabase db){
        String reqParse = "";
        ContentValues values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Rhetoric and Composition");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1301);
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Calculus I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1426);
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Calculus II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2425);
        //MATH1426 or HONR-SC 1426
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "PHYS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "General Technical Physics I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1443);
        //MATH1426
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "PHYS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "General Technical Physics II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1444);
        //PHYS1443|MATH2425
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Contemporary Mathematics");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1301);
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Preparation for Calculus");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1421);
        //MATH1301 or 1302 or 1315
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "College Algebra");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1302);
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "College Algebra for Economics and Business Analysis");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1315);
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ENGR");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Engineering Problem Solving");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1300);
        //co math1421 or 1426 2425 2426 3319 HONR-SC 1426 or 2425
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1104);
        //cse 1105
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction Computer Science and Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1105);
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Honors Calculus");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1426);
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Honors Calculus II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2425);
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Computers and Programming");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1310);
        //Math 1421 1426 2425 2326 3330 honrsc1426
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Mathematical Introduction to Computers and Programming");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1312);
        //Math 1421 1426 2425 2326 3330 honrsc1426
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Intermediate Programming");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1320);
        //cse 1310 1312 co Math 1421 1426 2425 2326 3330 honrsc1426 AND cse 1105
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Object-Oriented Programming");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1325);
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Practical Computer Hardware/Software Systems");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2100);
        //cse 1320
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Computer Organization and Assembly Language Programming");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2312);
        //cse 1320
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Discrete Structures");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2315);
        //cse 1310 AND (Math 1426 or co MATH 2425) AND co engr 1300
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Algorithms and Data Structures");
        //cse 1320 AND cse 2315
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2320);
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Programming Languages");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3302);
        //cse 1325 AND 2312 AND 2320
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Fundamentals of Software Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3310);
        //cse 1325 and 2315
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Theoretical Concepts in Computer Science and Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3315);
        //cse 2315
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Operating Systems");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3320);
        //cse 2312 and (co IE 3301 or math 3313)
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Database Systems and File structures");
        //cse 1325 and cse 2320
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3330);

        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Artificial Intelligence");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "FALL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4308);
        //cse 2320 and ie 3301
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Professional Practices");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4314);
        //coms 2302
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Computer System Design Project I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4316);
        //cse 3310 and cse 3320 and co cse 4314 and (pre cse 3442)
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Embedded Systems");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "FALL");
        //cse 2100 and 2441
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Digital Logic");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2441);
        //cse 1320 and 2315
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Practical Hardware/Software Systems");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2100);
        //cse 2312
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Computer System Design Project II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4317);
        //cse 4316
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Computer Network Organization");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4344);
        //cse 3320
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Computer Graphics");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4303);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "SPRING");
        //cse 2320 and (cse 3380 or math 3330)
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Compilers for Algorithmic Languages");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4305);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "SPRING");
        //cse 3302 and 3315
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Autonomous Robot Design and Programming");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4360);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "FALL");
        //cse 2320 and 3320 and (cse 3380 or math 3330)
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Engineering Probability");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3301);
        //math 2425
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Calculus III");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2326);
        //math 2425 or honr-sc 2425
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Probability");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3313);
        //math 2326
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Linear Algebra for CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3380);
        //cse 2315
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Matrices and Linear Algebra");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3330);
        //math 1426 or honr sc 1426
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "COMS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Professional and Technical Communication for Science and Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2302);
        //engl 1301 and (engr 1300 or engl 1302) 30+ hours
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Rhetoric and Composition");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1302);
        //engl 1301
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "HIST");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "History of the United States to 1865");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1311);
        //engl 1301
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "HIST");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "History of the United States, 1865 to Present");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1312);
        //engl 1301
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "POLS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Government of the United States");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2311);
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "POLS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "State and Local Government");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2312);
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Economics for Engineers");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2308);
        //co math 1426
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ECON");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Principles of Macroeconomics");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2305);
        // Insert the new row, returning the primary key value of the new row
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
    }

    public static void PrintDatabase(Context context){
        DegreePlanAdapter.FeedReaderDbHelper mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(context);
        SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();
        String text = "";

        // Define a projection that specifies which columns from the database
        // you will actually use after this query.
        String[] projection = {
                DegreePlanAdapter.CourseEntry._ID,
                DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT,
                DegreePlanAdapter.CourseEntry.COURSE_NUMBER
        };

        Cursor cursor = dbRead.query(
                DegreePlanAdapter.CourseEntry.TABLE_NAME,                     // The table to query
                projection,                               // The columns to return
                //selection,                                // The columns for the WHERE clause
                null,
                //selectionArgs,                            // The values for the WHERE clause
                null,
                null,                                     // don't group the rows
                null,                                     // don't filter by row groups
                null                               // The sort order
        );

        text += cursor.getCount();
        while(cursor.moveToNext()) {
            String itemId = cursor.getString(
                    cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT));
            text += itemId;
            text += "\n";
        }
        cursor.close();
        mDbHelper.close();
    }

    public static ArrayList<HashMap<String,String>> QueryDegreePlans(Context context, DegreePlanAdapter.FeedReaderDbHelper mDbHelper, ArrayList<HashMap<String, String>> list_dynam_Available){
        SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();
        // Define a projection that specifies which columns from the database
        // you will actually use after this query.
        String[] projection = {
                DegreePlanAdapter.CourseEntry._ID,
                DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT,
                DegreePlanAdapter.CourseEntry.COURSE_NUMBER,
                DegreePlanAdapter.CourseEntry.COURSE_NAME
        };

        Cursor cursor = dbRead.query(
                DegreePlanAdapter.CourseEntry.TABLE_NAME,                     // The table to query
                projection,                               // The columns to return
                null,//selection,                                // The columns for the WHERE clause
                null,//selectionArgs,                            // The values for the WHERE clause
                null,                                     // don't group the rows
                null,                                     // don't filter by row groups
                null                               // The sort order
        );

        int counter = 0;
        while(cursor.moveToNext()) {
            HashMap<String, String> item = new HashMap<String, String>();
            String query_department = cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT));
            String query_number = cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NUMBER));
            item.put("course", query_department + " " + query_number);
            String query_name = cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME));
            item.put("name", query_name);

            list_dynam_Available.add(item);
            counter +=1;
        }
        Toast toast = Toast.makeText(context, counter + " courses found.", Toast.LENGTH_SHORT);
        toast.show();

        //
        cursor.close();
        //mDbHelper.close();
        return list_dynam_Available;
    }

    public static void DeleteAllEntries(View view){

        DegreePlanAdapter.FeedReaderDbHelper mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(view.getContext());
        SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();
        dbRead.execSQL(("DELETE FROM " + DegreePlanAdapter.CourseEntry.TABLE_NAME));
    }
}

