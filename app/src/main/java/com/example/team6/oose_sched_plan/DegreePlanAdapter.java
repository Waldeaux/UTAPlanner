package com.example.tswal.skeletonprojecttest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by tswal on 11/9/2017.
 */

public class DegreePlanAdapter {


    public static class CourseEntry implements BaseColumns {
        public static final String TABLE_NAME = "Courses";
        public static final String _ID = "CourseID";
        public static final String COURSE_DEPARTMENT = "CourseDepartment";
        public static final String COURSE_NAME = "CourseName";
        public static final String COURSE_NUMBER = "CourseNumber";
        public static final String COURSE_DESCRIPTION = "CourseDescription";
        public static final String COURSE_TERM = "CourseTerm";
    }

    public static class ElectiveTable implements BaseColumns{
        public static final String TABLE_NAME = "Electives";
        public static final String _ID = "ElectiveID";
        public static final String MAJOR_NAME = "MajorName";
        public static final String MAJOR_YEAR = "MajorYear";
        public static final String COURSE_DEPARTMENT = "CourseDepartment";
        public static final String COURSE_NUMBER = "CourseNumber";
        public static final String ELECTIVE_TYPE = "ElectiveType";
    }

    public static class DegreePlanTable implements BaseColumns{
        public static final String _ID = "DegreePlanID";
        public static final String TABLE_NAME = "DegreePlans";
        public static final String MAJOR_NAME = "MajorName";
        public static final String MAJOR_YEAR = "MajorYear";
        public static final String REQUIRED_COURSE_HOURS = "RequiredCourseHours";
        public static final String TECHNICAL_ELECTIVE_HOURS = "TechnicalElectiveHours";
        public static final String MATH_ELECTIVE_HOURS = "MathElectiveHours";
        public static final String SCIENCE_ELECTIVE_HOURS = "ScienceElectiveHours";
        public static final String PHILOSOPHICAL_ELECTIVE_HOURS = "PhilosophicalElectiveHours";
        public static final String CREATIVE_ARTS_ELECTIVE_HOURS = "CreativeArtsElectiveHours";
    }

    public static class RequiredCourseTable implements BaseColumns{
        public static final String TABLE_NAME = "RequiredCourses";
        public static final String _ID = "RequiredCourseID";
        public static final String MAJOR_NAME = "MajorName";
        public static final String MAJOR_YEAR = "MajorYear";
        public static final String COURSE_DEPARTMENT = "CourseDepartment";
        public static final String COURSE_NUMBER = "CourseNumber";
    }

    public static class RequisiteCourseTable implements BaseColumns{
        public static final String TABLE_NAME = "Requisites";
        public static final String _ID = "RequisiteCourseID";
        public static final String COURSE_DEPARTMENT = "CourseDepartment";
        public static final String COURSE_NUMBER = "CourseNumber";
        public static final String REQUISITE_COURSE_DEPARTMENT = "RequisiteCourseDepartment";
        public static final String REQUISITE_COURSE_NUMBER = "RequisiteCourseNumber";
        public static final String REQUISITE_KEY = "RequisiteKey";
    }

    public static final String SQL_CREATE_COURSE_ENTRIES =
            "CREATE TABLE " + CourseEntry.TABLE_NAME + " (" +
                    CourseEntry._ID + " INTEGER PRIMARY KEY, " +
                    CourseEntry.COURSE_DEPARTMENT + " TEXT, " +
                    CourseEntry.COURSE_NAME + " TEXT, " +
                    CourseEntry.COURSE_NUMBER + " INTEGER, " +
                    CourseEntry.COURSE_DESCRIPTION+ " TEXT, " +
                    CourseEntry.COURSE_TERM + " TEXT)";

    public static final String SQL_CREATE_ELECTIVE_TABLE=
            "CREATE TABLE " + ElectiveTable.TABLE_NAME + " (" +
                    ElectiveTable._ID + " INTEGER PRIMARY KEY, " +
                    ElectiveTable.MAJOR_NAME + " TEXT, " +
                    ElectiveTable.MAJOR_YEAR + " INTEGER, " +
                    ElectiveTable.COURSE_DEPARTMENT + " TEXT, " +
                    ElectiveTable.COURSE_NUMBER + " INTEGER, " +
                    ElectiveTable.ELECTIVE_TYPE + " TEXT)";

    private static final String SQL_CREATE_DEGREE_PLAN_TABLE =
            "CREATE TABLE " + DegreePlanTable.TABLE_NAME + " (" +
                    DegreePlanTable._ID + " INTEGER PRIMARY KEY, " +
                    DegreePlanTable.MAJOR_NAME + " TEXT, " +
                    DegreePlanTable.MAJOR_YEAR + " INTEGER, " +
                    DegreePlanTable.REQUIRED_COURSE_HOURS + " INTEGER, " +
                    DegreePlanTable.TECHNICAL_ELECTIVE_HOURS + " INTEGER, " +
                    DegreePlanTable.MATH_ELECTIVE_HOURS + " INTEGER, " +
                    DegreePlanTable.SCIENCE_ELECTIVE_HOURS + " INTEGER, " +
                    DegreePlanTable.PHILOSOPHICAL_ELECTIVE_HOURS + " INTEGER, " +
                    DegreePlanTable.CREATIVE_ARTS_ELECTIVE_HOURS + " INTEGER)";

    private static final String SQL_CREATE_REQUIRED_COURSE_TABLE=
            "CREATE TABLE " + RequiredCourseTable.TABLE_NAME + " (" +
                    RequiredCourseTable._ID + " INTEGER PRIMARY KEY, " +
                    RequiredCourseTable.MAJOR_NAME + " TEXT, " +
                    RequiredCourseTable.MAJOR_YEAR + " INTEGER, " +
                    RequiredCourseTable.COURSE_DEPARTMENT + " TEXT, " +
                    RequiredCourseTable.COURSE_NUMBER + " INTEGER)";


    private static final String SQL_CREATE_REQUISITE_COURSE_TABLE =
            "CREATE TABLE " + RequisiteCourseTable.TABLE_NAME + " (" +
                    RequisiteCourseTable._ID + " INTEGER PRIMARY KEY, " +
                    RequisiteCourseTable.COURSE_DEPARTMENT + " TEXT, " +
                    RequisiteCourseTable.COURSE_NUMBER + " INTEGER, " +
                    RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT + " TEXT," +
                    RequisiteCourseTable.REQUISITE_COURSE_NUMBER + " INTEGER, " +
                    RequisiteCourseTable.REQUISITE_KEY + " INTEGER)";

    private static final String SQL_DELETE_COURSE_ENTRIES =
            "DROP TABLE IF EXISTS " + CourseEntry.TABLE_NAME;

    private static final String SQL_DELETE_ELECTIVE_TABLE =
            "DROP TABLE IF EXISTS " + ElectiveTable.TABLE_NAME;

    private static final String SQL_DELETE_DEGREE_PLAN_TABLE =
            "DROP TABLE IF EXISTS " + DegreePlanTable.TABLE_NAME;

    private static final String SQL_DELETE_REQUIRED_COURSE_TABLE =
            "DROP TABLE IF EXISTS " + RequiredCourseTable.TABLE_NAME;

    private static final String SQL_DELETE_REQUISITE_COURSE_TABLE =
            "DROP TABLE IF EXISTS " + RequisiteCourseTable.TABLE_NAME;



    public static class FeedReaderDbHelper extends SQLiteOpenHelper {
        // If you change the database schema, you must increment the database version.
        public static final int DATABASE_VERSION = 1;
        public static final String DATABASE_NAME = "Scheduler.db";

        public FeedReaderDbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }
        public void onCreate(SQLiteDatabase db) {

            db.execSQL(SQL_CREATE_COURSE_ENTRIES);
            db.execSQL(SQL_CREATE_ELECTIVE_TABLE);
            db.execSQL(SQL_CREATE_DEGREE_PLAN_TABLE);
            db.execSQL(SQL_CREATE_REQUIRED_COURSE_TABLE);
            db.execSQL(SQL_CREATE_REQUISITE_COURSE_TABLE);
        }
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // This database is only a cache for online data, so its upgrade policy is
            // to simply to discard the data and start over
            db.execSQL(SQL_DELETE_COURSE_ENTRIES);
            db.execSQL(SQL_DELETE_ELECTIVE_TABLE);
            db.execSQL(SQL_DELETE_DEGREE_PLAN_TABLE);
            db.execSQL(SQL_DELETE_REQUIRED_COURSE_TABLE);
            db.execSQL(SQL_DELETE_REQUISITE_COURSE_TABLE);

            onCreate(db);
        }
        public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            onUpgrade(db, oldVersion, newVersion);
        }
    }

}
