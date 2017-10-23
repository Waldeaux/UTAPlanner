package com.example.team6.oose_sched_plan;

import java.util.ArrayList;

public class Database {
	
	// Returns list of courses that are offered in specified term. Used when getting courses that user can add to a certain semester.
	public static ArrayList<Course> queryCoursesInTerm(Term term, int year)
	{
		ArrayList<Course> coursesInSemester = new ArrayList<>();
		//SQL QUERY
		return coursesInSemester;
	}
	
	//Given department and course number, returns course class with all info about course. Used when loading course from file, when only have this given info.
	public static Course queryCourse(Department department, int number)
	{
		String departmentAsString = department.toString();
		Course resultCourse;
		resultCourse = new Course(Department.valueOf("CSE"), 1, "foo", "foo", CreditCategory.valueOf("Required")); //REMOVE: just here to remove error that result may not be initialized 
		//SQL QUERY
		return resultCourse;
	}
	
	public static ArrayList<Course> queryPrereqs(Course course) {
		ArrayList<Course> prereqs = new ArrayList<>();
		//SQL QUERY
		return prereqs;
	}
	
	public static ArrayList<Course> queryCoreqs(Course course) {
		ArrayList<Course> coreqs = new ArrayList<>();
		//SQL QUERY
		return coreqs;
	}
}
