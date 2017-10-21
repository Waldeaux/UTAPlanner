package com.example.tswal.scheduler;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DeleteAllEntries();
        //PopulateDatabase();
        PrintDatabase();
        //db.execSQL(("DROP TABLE entry;"));



    }

    public void PopulateDatabase(){
        Courses.FeedReaderDbHelper mDbHelper = new Courses.FeedReaderDbHelper(getApplicationContext());
        SQLiteDatabase db = mDbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "ENGL");
        values.put(Courses.CourseEntry.COURSE_NAME, "Rhetoric and Composition");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 1301);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(Courses.CourseEntry.COURSE_NAME, "Calculus I");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 1426);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(Courses.CourseEntry.COURSE_NAME, "Calculus II");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 2425);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "PHYS");
        values.put(Courses.CourseEntry.COURSE_NAME, "General Technical Physics I");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 1443);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "PHYS");
        values.put(Courses.CourseEntry.COURSE_NAME, "General Technical Physics II");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 1444);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "ENGR");
        values.put(Courses.CourseEntry.COURSE_NAME, "Engineering Problem Solving");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 1300);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Introduction Computer Science and Engineering");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 1105);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Intermediate Programming");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 1320);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Object-Oriented Programming");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 1325);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Practical Computer Hardware/Software Systems");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 2100);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Computer Organization and Assembly Language Programming");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 2312);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Discrete Structures");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 2315);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Algorithms and Data Structures");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 2320);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Programming Languages");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 3302);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Fundamentals of Software Engineering");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 3310);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Theoretical Concepts in Computer Science and Engineering");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 3315);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Operating Systems");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 3320);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Database Systems and File structures");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 3330);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Artificial Intelligence");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 4308);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Professional Practices");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 4314);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Computer System Design Project I");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 4316);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Computer System Design Project II");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 4317);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Computer Network Organization");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 4344);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Computer Graphics");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 4303);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Compilers for Algorithmic Languages");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 4305);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Autonomous Robot Design and Programming");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 4360);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "IE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Engineering Probability");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 3301);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(Courses.CourseEntry.COURSE_NAME, "Introduction to Probability");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 3313);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Linear Algebra for CSE");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 3380);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(Courses.CourseEntry.COURSE_NAME, "Introduction to Matrices and Linear Algebra");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 3330);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "COMS");
        values.put(Courses.CourseEntry.COURSE_NAME, "Professional and Technical Communication for Science and Engineering");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 2302);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "HIST");
        values.put(Courses.CourseEntry.COURSE_NAME, "History of the United States to 1865");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 1311);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "HIST");
        values.put(Courses.CourseEntry.COURSE_NAME, "History of the United States, 1865 to Present");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 1312);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "POLS");
        values.put(Courses.CourseEntry.COURSE_NAME, "Government of the United States");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 2311);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "POLS");
        values.put(Courses.CourseEntry.COURSE_NAME, "State and Local Government");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 2312);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "IE");
        values.put(Courses.CourseEntry.COURSE_NAME, "Economics for Engineers");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 2308);
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        values.put(Courses.CourseEntry.COURSE_DEPARTMENT, "ECON");
        values.put(Courses.CourseEntry.COURSE_NAME, "Principles of Macroeconomics");
        values.put(Courses.CourseEntry.COURSE_NUMBER, 2305);
// Insert the new row, returning the primary key value of the new row
        db.insert(Courses.CourseEntry.TABLE_NAME, null, values);
        mDbHelper.close();
    }

    public void PrintDatabase(){
        Courses.FeedReaderDbHelper mDbHelper = new Courses.FeedReaderDbHelper(getApplicationContext());
        SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();
        String text = "";
        final TextView helloTextView = (TextView) findViewById(R.id.text_view_id);
// Define a projection that specifies which columns from the database
// you will actually use after this query.
        String[] projection = {
                Courses.CourseEntry._ID,
                Courses.CourseEntry.COURSE_DEPARTMENT,
                Courses.CourseEntry.COURSE_NUMBER
        };

        Cursor cursor = dbRead.query(
                Courses.CourseEntry.TABLE_NAME,                     // The table to query
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
                    cursor.getColumnIndexOrThrow(Courses.CourseEntry.COURSE_DEPARTMENT));
            text += itemId;
            text += "\n";
        }

        helloTextView.setText(text);
        cursor.close();
        mDbHelper.close();
    }

    public void DeleteAllEntries(){

        Courses.FeedReaderDbHelper mDbHelper = new Courses.FeedReaderDbHelper(getApplicationContext());
        SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();
        dbRead.execSQL(("DELETE FROM " + Courses.CourseEntry.TABLE_NAME));
    }
}
