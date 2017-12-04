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
		if (year == otherSemester.year && term.ordinal() < otherSemester.term.ordinal()) {
			return true;
		} else if (year < otherSemester.year) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals(Semester otherSemester) {
		return (this.term == otherSemester.term && this.year == otherSemester.year);
	}

	//Returns term of semester from a string identifier that follows pattern "term+year".
	public static Term parseTerm(String identifier) {
		String termBuffer = "";

		//Go through identifier and pull out department
		for(int i = 0; i < identifier.length(); i++) {
			char currentChar = identifier.charAt(i);
			if(Character.isLetter(currentChar)) {
				termBuffer += currentChar;
			} else {
				break; //once reach number, stop since department has been read. IE, stop after reaching 1 in CSE1300.
			}

		}

		return Term.valueOf(termBuffer);
	}

	//Returns year of semester from a string identifier that follows pattern "term+year".
	public static int parseYear(String identifier) {
		String yearBuffer = "";

		//Go through identifier and pull out number
		for(int i = 0; i < identifier.length(); i++) {
			char currentChar = identifier.charAt(i);
			if(Character.isDigit(currentChar)) {
				yearBuffer += currentChar;
			}
		}

		return Integer.parseInt(yearBuffer);
	}
}
