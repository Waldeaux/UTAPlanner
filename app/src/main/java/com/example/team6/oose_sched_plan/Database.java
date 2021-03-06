package com.example.team6.oose_sched_plan;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class Database {

	//TODO: Given major, year?, and creditCategory, give number of electives required
	public static DegreePlan QueryDegreePlan(String degreePlanName, int degreePlanYear, Context context) {
		DegreePlanAdapter.FeedReaderDbHelper mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(context);
		SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();

		//Queries major based on input*****************************************************************************
		String[] projection = {
				DegreePlanAdapter.DegreePlanTable.MAJOR_NAME,
				DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR,
				DegreePlanAdapter.DegreePlanTable.REQUIRED_COURSE_HOURS,
				DegreePlanAdapter.DegreePlanTable.MATH_ELECTIVE_HOURS,
				DegreePlanAdapter.DegreePlanTable.SCIENCE_ELECTIVE_HOURS,
				DegreePlanAdapter.DegreePlanTable.TECHNICAL_ELECTIVE_HOURS,
				DegreePlanAdapter.DegreePlanTable.CREATIVE_ARTS_ELECTIVE_HOURS,
				DegreePlanAdapter.DegreePlanTable.PHILOSOPHICAL_ELECTIVE_HOURS
		};

		String selection = DegreePlanAdapter.DegreePlanTable.MAJOR_NAME + " = ? AND " + DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR + " = ?";
		String[] selectionArgs = {
				degreePlanName,
				String.valueOf(degreePlanYear)
		};
		Cursor cursor = dbRead.query(
				DegreePlanAdapter.DegreePlanTable.TABLE_NAME,
				projection,
				selection,
				selectionArgs,
				null,
				null,
				null

		);
		int totalHours = 0;
		DegreePlan result = new DegreePlan("NULL", 0, 0);
		while (cursor.moveToNext()) {
			totalHours = 0;
			totalHours += cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.REQUIRED_COURSE_HOURS));
			totalHours += cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.MATH_ELECTIVE_HOURS));
			totalHours += cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.SCIENCE_ELECTIVE_HOURS));
			totalHours += cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.TECHNICAL_ELECTIVE_HOURS));
			totalHours += cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.CREATIVE_ARTS_ELECTIVE_HOURS));
			totalHours += cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.PHILOSOPHICAL_ELECTIVE_HOURS));
			result = new DegreePlan(
					cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.MAJOR_NAME)),
					cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR)),
					totalHours
			);

		}
		return result;
	}
		public static ArrayList<String> QueryDegreePlanNames(Context context){
		ArrayList<String> results = new ArrayList<String>();
		DegreePlanAdapter.FeedReaderDbHelper mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(context);
		SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();

		//Queries major based on input*****************************************************************************
		String[] projection = {
				DegreePlanAdapter.DegreePlanTable.MAJOR_NAME
		};


		Cursor cursor = dbRead.query(
				DegreePlanAdapter.DegreePlanTable.TABLE_NAME,
				projection,
				null,
				null,
				null,
				null,
				null

		);

		while(cursor.moveToNext()) {
			results.add(cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.MAJOR_NAME)));

		}
		return results;
	}
	public static ArrayList<Course> QueryElectives(String major, int year, String electiveType,  DegreePlanAdapter.FeedReaderDbHelper mDbHelper){
		ArrayList<Course> results = new ArrayList<Course>();
		//DegreePlanAdapter.FeedReaderDbHelper mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(context);
		SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();

		//Queries major based on input*****************************************************************************
		String[] projection = {
				DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT,
				DegreePlanAdapter.ElectiveTable.COURSE_NUMBER
		};

		String selection = DegreePlanAdapter.ElectiveTable.MAJOR_NAME + " = ? AND " + DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE + " = ? AND "+ DegreePlanAdapter.ElectiveTable.MAJOR_YEAR + " = ?";
		String[] selectionArgs = {
				major,
				electiveType,
				String.valueOf(year)
		};

		Cursor cursor = dbRead.query(
				DegreePlanAdapter.ElectiveTable.TABLE_NAME,
				projection,
				selection,
				selectionArgs,
				null,
				null,
				null

		);

		Cursor nestedCursor;
		String nestedDepartment;
		String nestedCourseNumber;
		String[] nestedSelectionArgs = new String[2];
		String[] nestedProjection = {
				DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT,
				DegreePlanAdapter.CourseEntry.COURSE_NUMBER,
				DegreePlanAdapter.CourseEntry.COURSE_NAME,
				DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION
		};
		String nestedSelection = DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT + " = ? AND " + DegreePlanAdapter.CourseEntry.COURSE_NUMBER + " = ?";
		while(cursor.moveToNext()) {
			nestedSelectionArgs[0]= cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT));
			nestedSelectionArgs[1] = String.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER)));

			nestedCursor = dbRead.query(
					DegreePlanAdapter.CourseEntry.TABLE_NAME,
					nestedProjection,
					nestedSelection,
					nestedSelectionArgs,
					null,
					null,
					null
			);

			while(nestedCursor.moveToNext()){
				results.add(new Course(
						Department.valueOf(nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT))),
						nestedCursor.getInt(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NUMBER)),
						nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME)),
						nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION))));
			}
		}
		return results;
	}

	/********************************************************************
	 *
	 * @param {String} major - All-caps major department
	 * @param {Int} year - Year for which the degree plan started in
	 * @param {Context} context - Application context
	 * @return
	 */

	public static ArrayList<Course> QueryCoursesByMajor(String major, int year, DegreePlanAdapter.FeedReaderDbHelper mDbHelper){
		ArrayList<Course> results = new ArrayList<Course>();
		//DegreePlanAdapter.FeedReaderDbHelper mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(context);
		SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();

		//Queries major based on input*****************************************************************************
		String[] projection = {
				DegreePlanAdapter.DegreePlanTable.MAJOR_NAME,
				DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR
		};

		String selection = DegreePlanAdapter.DegreePlanTable.MAJOR_NAME + " = ? AND " + DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR + " = ?";
		String[] selectionArgs = {
				major,
				String.valueOf(year)
		};

		Cursor cursor = dbRead.query(
				DegreePlanAdapter.DegreePlanTable.TABLE_NAME,
				projection,
				selection,
				selectionArgs,
				null,
				null,
				null

		);

		//If major is found, save information for future queries*************************************************
		String majorName ="";
		int majorYear = 0;
		if(cursor.getCount() == 1) {
			cursor.moveToNext();
			majorName = cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.MAJOR_NAME));
			majorYear = cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR));
		}

		//Course results criteria instantiation******************************************************************
		String[] courseProjection = {
				DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT,
				DegreePlanAdapter.CourseEntry.COURSE_NUMBER,
				DegreePlanAdapter.CourseEntry.COURSE_NAME,
				DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION
		};
		String courseSelection = DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT + " = ? AND " + DegreePlanAdapter.CourseEntry.COURSE_NUMBER + " = ?";
		String[] courseSelectionArgs = new String[2];

		//Nested query criteria instantiation*******************************************************************
		String[] requiredCourseProjection = {
				DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT,
				DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER
		};

		String requiredCourseSelection = DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME + " = ? AND " + DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR + " = ?";
		String[] requiredCourseSelectionArgs = {
				majorName,
				String.valueOf(majorYear)
		};

		//Query for courses that are required in input major***************************************************
		cursor = dbRead.query(
				DegreePlanAdapter.RequiredCourseTable.TABLE_NAME,
				requiredCourseProjection,
				requiredCourseSelection,
				requiredCourseSelectionArgs,
				null,
				null,
				null
		);


		String courseDepartment;
		int courseNumber;
		Cursor nestedCursor = null;

		//Iterate through each required course and gather that course's information from course entry table**********
		while(cursor.moveToNext()){
			courseDepartment = cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT));
			courseNumber = cursor.getInt(cursor.getColumnIndexOrThrow((DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER)));
			courseSelectionArgs[0] = courseDepartment;
			courseSelectionArgs[1] = String.valueOf(courseNumber);
			nestedCursor = dbRead.query(
					DegreePlanAdapter.CourseEntry.TABLE_NAME,
					courseProjection,
					courseSelection,
					courseSelectionArgs,
					null,
					null,
					null
			);
			nestedCursor.moveToNext();
			results.add(new Course(
					Department.valueOf(nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT))),
					nestedCursor.getInt(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NUMBER)),
					nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME)),
					nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION)))
			);
		}

		//Set selection criteria to elective table's format***********************************************************
		requiredCourseProjection[0] = DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT;
		requiredCourseProjection[1] = DegreePlanAdapter.ElectiveTable.COURSE_NUMBER;

		requiredCourseSelection = DegreePlanAdapter.ElectiveTable.MAJOR_NAME + " = ? AND " + DegreePlanAdapter.ElectiveTable.MAJOR_YEAR + " = ?";

		String[] electiveCourseProjection = {
				DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT,
				DegreePlanAdapter.ElectiveTable.COURSE_NUMBER,
				DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE
		};

		//Query electives for input major****************************************************************************
		cursor = dbRead.query(
				DegreePlanAdapter.ElectiveTable.TABLE_NAME,
				electiveCourseProjection,
				requiredCourseSelection,
				requiredCourseSelectionArgs,
				null,
				null,
				null
		);

		//Iterate through each elective and gather course's information from course entry table*********************
		while(cursor.moveToNext()){
			courseDepartment = cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT));
			courseNumber = cursor.getInt(cursor.getColumnIndexOrThrow((DegreePlanAdapter.ElectiveTable.COURSE_NUMBER)));
			courseSelectionArgs[0] = courseDepartment;
			courseSelectionArgs[1] = String.valueOf(courseNumber);
			nestedCursor = dbRead.query(
					DegreePlanAdapter.CourseEntry.TABLE_NAME,
					courseProjection,
					courseSelection,
					courseSelectionArgs,
					null,
					null,
					null
			);
			nestedCursor.moveToNext();
			results.add(new Course(
					Department.valueOf(nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT))),
					nestedCursor.getInt(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NUMBER)),
					nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME)),
					nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION)),
					CreditCategory.valueOf(cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE))))
			);
			nestedCursor.close();
		}
		cursor.close();
		dbRead.close();
		return results;
	}

	public static int QueryElectiveCount(String creditCategory, String degreePlanName, int degreePlanYear, DegreePlanAdapter.FeedReaderDbHelper mDbHelper) {
		SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();

		String[] projection = {
				creditCategory
		};
		String selection = DegreePlanAdapter.DegreePlanTable.MAJOR_NAME + " = ? AND " + DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR + " = ?";
		String[] selectionArgs = {
				degreePlanName,
				String.valueOf(degreePlanYear)
		};

		try{
			Cursor cursor = dbRead.query(
					DegreePlanAdapter.DegreePlanTable.TABLE_NAME,
					projection,
					selection,
					selectionArgs,
					null,
					null,
					null

			);
			if(cursor.getCount() > 0) {
				cursor.moveToNext();
				return cursor.getInt(cursor.getColumnIndexOrThrow(creditCategory));
			}
			return 0;
		}
		catch(Exception e){
			return 999;
		}


	}

	/****************************************************************************
	 *
	 *
	 * @param {FeedReaderHelper} mDbHelper - FeedReaderHelper with the application context
	 * @param {Course} course - Course for which to look up requisites
	 * @return {ReqQueryResult} - Object that has corequisite flag and a 2D list of requisites grouped
	 * together by alternate requirement status
	 */

	public static ReqQueryResult QueryPrereqs(DegreePlanAdapter.FeedReaderDbHelper mDbHelper, Course course){
		ReqQueryResult result = new ReqQueryResult();
		SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();

		//Dummy variables for nested queries********************************************************************
		Department dummyDepartment;
		int dummyNumber;
		String dummyName;
		String dummyDescription;
		int dummyKey = 0;

		//Query criteria instantiation for requested course**************************************************
		String[] projection = {
				DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,
				DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,
				DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT,
				DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER,
				DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY
		};

		String selection = DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT + " = ? AND " + DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER + " = ?";
		String[] selectionArgs = {course.department.toString(), Integer.toString(course.number)};

		//Query requested course's requisites************************************************************************
		Cursor cursor = dbRead.query(
				DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME,
				projection,
				selection,
				selectionArgs,
				null,
				null,
				null
		);

		if (cursor != null && cursor.getCount() != 0) {

			Cursor nestedCursor;
			String[] nestedProjection = {
					DegreePlanAdapter.CourseEntry.COURSE_NAME,
					DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION
			};
			String[] nestedSelectionArgs = new String[2];
			String nestedSelection = DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT + " = ? AND " + DegreePlanAdapter.CourseEntry.COURSE_NUMBER + " = ?";

			//Gather information of each requisite from course entry table**************************************************
			while (cursor.moveToNext()) {
				dummyDepartment = Department.valueOf(cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT)));
				dummyNumber = cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER));
				if (dummyKey != Math.abs(cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY)))) {
					result.reqs.add(new ArrayList<ReqCourseEntry>());
					dummyKey = Math.abs(cursor.getInt(cursor.getColumnIndexOrThrow((DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY))));
				}
				nestedSelectionArgs[0] = dummyDepartment.toString();
				nestedSelectionArgs[1] = Integer.toString(dummyNumber);

				nestedCursor = dbRead.query(
						DegreePlanAdapter.CourseEntry.TABLE_NAME,
						nestedProjection,
						nestedSelection,
						nestedSelectionArgs,
						null,
						null,
						null
				);

				if (nestedCursor != null && nestedCursor.getCount() != 0) {
					nestedCursor.moveToNext();
					if (cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY)) < 0) {
						result.reqs.get(result.reqs.size() - 1).add(new ReqCourseEntry(new Course(dummyDepartment, dummyNumber, nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME)), nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION))), true));
					} else {
						result.reqs.get(result.reqs.size() - 1).add(new ReqCourseEntry(new Course(dummyDepartment, dummyNumber, nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME)), nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION))), false));
					}
				}
				nestedCursor.close();
			}
		}
		cursor.close();
		dbRead.close();
		return result;
	}


	public static ArrayList<Course> queryCourses(Term term, int year, DegreePlanAdapter.FeedReaderDbHelper mDbHelper)
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase();
		ArrayList<Course> coursesInSemester = new ArrayList<>();
		String[] projection = {
				DegreePlanAdapter.CourseEntry._ID,
				DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT,
				DegreePlanAdapter.CourseEntry.COURSE_NAME,
				DegreePlanAdapter.CourseEntry.COURSE_NUMBER
		};

		String selection = DegreePlanAdapter.CourseEntry.COURSE_TERM + "";
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

//		String s = "SELECT * " +
//				"FROM " + DegreePlanAdapter.CourseEntry.TABLE_NAME +
//				" WHERE " + selection + " = " + "Spring";
//		Cursor cursor = db.rawQuery("SELECT * " +
//				"FROM " + DegreePlanAdapter.CourseEntry.TABLE_NAME +
//				" WHERE " + selection + " = " + "Spring", null);
		Cursor cursor = db.rawQuery("SELECT * " +
				"FROM " + DegreePlanAdapter.CourseEntry.TABLE_NAME, null);

		while(cursor.moveToNext()) {
			coursesInSemester.add(new Course(Department.valueOf(cursor.getString(1)), cursor.getInt(3), cursor.getString(2), "", CreditCategory.OTHER));
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
		db.close();
		return coursesInSemester;
	}


	public static Course QueryCourse(String department, int number, String major, int majorYear, DegreePlanAdapter.FeedReaderDbHelper mDbHelper)
	{
		SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();
		//SQL QUERY
		String[] projection = {
				DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT,
				DegreePlanAdapter.CourseEntry.COURSE_NUMBER,
				DegreePlanAdapter.CourseEntry.COURSE_NAME,
				DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION
		};
		String selection = DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT + " = ? AND " + DegreePlanAdapter.CourseEntry.COURSE_NUMBER + "= ?";
		String[] selectionArgs = {department, String.valueOf(number)};
		Cursor cursor = dbRead.query(
				DegreePlanAdapter.CourseEntry.TABLE_NAME,                     // The table to query
				projection,                               // The columns to return
				selection,                                // The columns for the WHERE clause
				selectionArgs,                            // The values for the WHERE clause
				null,                                     // don't group the rows
				null,                                     // don't filter by row groups
				null                               		  // The sort order
		);


		String[] creditCategoryProjection = {
				DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE
		};

		String creditSelection = DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT + " = ? AND " + DegreePlanAdapter.ElectiveTable.COURSE_NUMBER + "= ? AND " +
				DegreePlanAdapter.ElectiveTable.MAJOR_NAME + "= ? AND " + DegreePlanAdapter.ElectiveTable.MAJOR_YEAR + "= ?";

		String[] creditSelectionArgs = {department, String.valueOf(number), major, String.valueOf(majorYear)};

		Course result = new Course(Department.AAST, 0, "NULL COURSE", "");
		if(cursor.getCount() > 0) {
			cursor.moveToNext();
			Cursor electiveCursor = dbRead.query(
					DegreePlanAdapter.ElectiveTable.TABLE_NAME,
					creditCategoryProjection,
					creditSelection,
					creditSelectionArgs,
					null,
					null,
					null
			);
			if(electiveCursor.getCount() > 0){
				electiveCursor.moveToNext();
				result = new Course(
						Department.valueOf(cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT))),
						cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NUMBER)),
						cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME)),
						cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION)),
						CreditCategory.valueOf(electiveCursor.getString(electiveCursor.getColumnIndexOrThrow(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE)))
				);}
			else{
				result = new Course(
						Department.valueOf(cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT))),
						cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NUMBER)),
						cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME)),
						cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION))
				);
			}
		}
		dbRead.close();
		return result;
	}
	//Given department and course number, returns course class with all info about course. Used when loading course from file, when only have this given info.

	public static Course QueryCourse(String department, int number, DegreePlanAdapter.FeedReaderDbHelper mDbHelper)
	{
		SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();
		//SQL QUERY
		String[] projection = {
				DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT,
				DegreePlanAdapter.CourseEntry.COURSE_NUMBER,
				DegreePlanAdapter.CourseEntry.COURSE_NAME,
				DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION
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
		Course result = new Course(Department.AAST, 0, "NULL COURSE", "");
		if(cursor.getCount() > 0) {
			cursor.moveToNext();

			result = new Course(
					Department.valueOf(cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT))),
					cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NUMBER)),
					cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME)),
					cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION))
			);
		}
		dbRead.close();
		cursor.close();
		return result;
	}

	public static ReqQueryResult queryReqs(Course course, DegreePlanAdapter.FeedReaderDbHelper mDbHelper) {

		ReqQueryResult result = new ReqQueryResult();
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
		return result;
	}

	//returns number of courses that must be taken for a certain elective type to be met
	public static int queryNumberOfElectiveCourses(Course course, DegreePlan major, DegreePlanAdapter.FeedReaderDbHelper mDbHelper) {
		return -1;//PLACEHOLDER
	}
}