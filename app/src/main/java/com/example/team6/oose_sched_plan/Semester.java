package com.example.team6.oose_sched_plan;

import java.util.ArrayList;

public class Semester {
	public Semester(Term term, int year) {
		this.term = term; 
		this.year = year;
		courses = new ArrayList<>();
	}
	
	/*
	 * These values are public final because once they are initialized through constructor, they won't change throughout program execution
	 * In other words, no one will be updating this info as a result of program execution. 
	 * User shouldn't be allowed to change these values ever since validity of courses inside depend on semester being of a certain term.
	 */
	public final Term term;
	public final int year;
	
	//This however will be changing during program execution
	private ArrayList<Course> courses;
		
	public void add(Course course) {
		courses.add(course);
	}
	
	public void remove(Course course) {
		courses.remove(course);
	}
	
	public boolean contains(Course course) {
		return courses.contains(course);
	}
	
	public int calculateCreditHours()
	{
		int creditHours = 0;
		for(Course currentCourse : courses) {
			creditHours += currentCourse.creditHours;
		}
		
		return creditHours;
	}

	public String toString() {
		String result = term.toString() + year;
		return result;
	}

	public ArrayList<Course> getCourses() {return courses;}
	
	/*
	 * Returns whether or not this semester comes before (chronologically) a given semester. Used to for when checking if schedule contains prereqs and only want to check up to previous semester
	 * UPDATE: Due to change in implementation, since for now only doing semester by semester and assuming checking prereqs for latest semester, can use semesters.size() - 1 to go up to previous
	 *         but keeping because it could be useful in future if change implementation.
	 */
	public boolean isBefore(Semester otherSemester) {
		return (year <= otherSemester.year && term.ordinal() < otherSemester.term.ordinal());
	}
	
	public boolean equals(Semester otherSemester) {
		return (this.term == otherSemester.term && this.year == otherSemester.year);
	}
}
