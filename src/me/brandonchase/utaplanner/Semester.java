package me.brandonchase.utaplanner;

import java.util.ArrayList;

public class Semester {
	ArrayList<Course> courses;
	Term term;
	int year;
	int semesterNum;
	int[] errorFlags;
	int creditHours; //DISCUSSION: Should this be a function that returns hours? Then don't need to worry about updating every time courses changes. It is more dynamic as function.
	
	public void addCourse(Course course) {
		
	}
	
	public void removeCourse(Course course) {
		
	}
	
	public boolean containsCourse(Course course) {
		
	}
}
