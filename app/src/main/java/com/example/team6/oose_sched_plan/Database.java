package com.example.team6.oose_sched_plan;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;

public class Database {
	
	// Returns list of courses that are offered in specified term. Used when getting courses that user can add to a certain semester.
	public static ArrayList<Course> queryCoursesInTerm(Term term, int year, DegreePlanAdapter.FeedReaderDbHelper mDbHelper)
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase();
		ArrayList<Course> coursesInSemester = new ArrayList<>();
		String[] projection = {
				DegreePlanAdapter.CourseEntry._ID,
				DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT,
				DegreePlanAdapter.CourseEntry.COURSE_NAME,
				DegreePlanAdapter.CourseEntry.COURSE_NUMBER
		};

		String selection = DegreePlanAdapter.CourseEntry.COURSE_TERM + " = ?";
		String[] selectionArgs = { term.toString() };
		String sortOrder =
				DegreePlanAdapter.CourseEntry.COURSE_NUMBER + " DESC";

//        Cursor cursor = db.query(
//                DegreePlanAdapter.CourseEntry.TABLE_NAME,                     // The table to query
//                projection,                               // The columns to return
//                selection,                                // The columns for the WHERE clause
//                selectionArgs,                            // The values for the WHERE clause
//                null,                                     // don't group the rows
//                null,                                     // don't filter by row groups
//                null                               		  // The sort order
//        );

		Cursor cursor = db.rawQuery("SELECT * FROM " + DegreePlanAdapter.CourseEntry.TABLE_NAME, null);

		while(cursor.moveToNext()) {
            coursesInSemester.add(new Course(Department.valueOf(cursor.getString(1)), cursor.getInt(3), cursor.getString(2), "", CreditCategory.Required));
        }
//        selectionArgs[0] = "";
//        cursor = db.query(
//                DegreePlanAdapter.CourseEntry.TABLE_NAME,                     // The table to query
//                projection,                               // The columns to return
//                selection,                                // The columns for the WHERE clause
//                selectionArgs,                            // The values for the WHERE clause
//                null,                                     // don't group the rows
//                null,                                     // don't filter by row groups
//                null                               		  // The sort order
//        );
//        while(cursor.moveToNext()) {
//            coursesInSemester.add(new Course(Department.valueOf(cursor.getString(1)), cursor.getInt(3), cursor.getString(2), "", CreditCategory.Required));
//        }
		return coursesInSemester;
	}
	
	//Given department and course number, returns course class with all info about course. Used when loading course from file, when only have this given info.
	public static Course queryCourse(Department department, int number, DegreePlanAdapter.FeedReaderDbHelper mDbHelper)
	{
        SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();
        //SQL QUERY
        String[] projection = {
                DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT,
                DegreePlanAdapter.CourseEntry.COURSE_NUMBER,
                DegreePlanAdapter.CourseEntry.COURSE_NAME
        };

        String selection = DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT + " = ? AND " + DegreePlanAdapter.CourseEntry.COURSE_NUMBER + "= ?";
        String[] selectionArgs = {department.toString(), String.valueOf(number)};
        Cursor cursor = dbRead.query(
                DegreePlanAdapter.CourseEntry.TABLE_NAME,                     // The table to query
                projection,                               // The columns to return
                selection,                                // The columns for the WHERE clause
                selectionArgs,                            // The values for the WHERE clause
                null,                                     // don't group the rows
                null,                                     // don't filter by row groups
                null                               		  // The sort order
        );
        cursor.moveToNext();
		return new Course(Department.valueOf(cursor.getString(0)), cursor.getInt(1), cursor.getString(2), "", CreditCategory.valueOf("Required")); //REMOVE: just here to remove error that result may not be initialized;
	}
	
	public static ArrayList<Course> queryPrereqs(Course course, DegreePlanAdapter.FeedReaderDbHelper mDbHelper) {

		ArrayList<Course> prereqs = new ArrayList<>();
        //Need case for alternate credits
        /*
        SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();

		String[] projection = {
				DegreePlanAdapter.CourseEntry._ID,
				DegreePlanAdapter.CourseEntry.COURSE_PREREQUISITES
		};

		String selection = DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT + " = ? AND " +  DegreePlanAdapter.CourseEntry.COURSE_NUMBER + " = ?";
		String[] selectionArgs = { course.department.toString(), String.valueOf(course.number)};

		String sortOrder =
				DegreePlanAdapter.CourseEntry.COURSE_NUMBER + " DESC";

		Cursor cursor = dbRead.query(
				DegreePlanAdapter.CourseEntry.TABLE_NAME,                     // The table to query
				projection,                               // The columns to return
				selection,                                // The columns for the WHERE clause
				selectionArgs,                            // The values for the WHERE clause
				null,                                     // don't group the rows
				null,                                     // don't filter by row groups
				null                               		  // The sort order
		);

		cursor.moveToNext();
		String[] prereqIndices = cursor.getString(1).split(",");
		String[] prereqSelectionArgs = new String[1];
        String[] prereqProjection = {
                DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT,
                DegreePlanAdapter.CourseEntry.COURSE_NUMBER,
                DegreePlanAdapter.CourseEntry.COURSE_NAME
        };

        selection = DegreePlanAdapter.CourseEntry._ID + " = ?";
        for(int x = 0; x < prereqIndices.length; x++) {
            prereqSelectionArgs[0] = prereqIndices[x];
		    cursor = dbRead.query(
                    DegreePlanAdapter.CourseEntry.TABLE_NAME,                     // The table to query
                    prereqProjection,                               // The columns to return
                    selection,                                // The columns for the WHERE clause
                    prereqSelectionArgs,                            // The values for the WHERE clause
                    null,                                     // don't group the rows
                    null,                                     // don't filter by row groups
                    null                               		  // The sort order
            );
            cursor.moveToNext();
            prereqs.add(new Course(Department.valueOf(cursor.getString(0)), cursor.getInt(1), cursor.getString(2), "", CreditCategory.Required ));
        }*/
		return prereqs;
	}
	
	public static ArrayList<Course> queryCoreqs(Course course) {
		ArrayList<Course> coreqs = new ArrayList<>();
		//SQL QUERY
		return coreqs;
	}
}
