package com.example.team6.oose_sched_plan;

public class Course {
	public Course(Department department, int number, String name, String description, CreditCategory creditCategory) {
		this.department = department;
		this.number = number;
		this.name = name;
		this.description = description;
		this.creditCategory = creditCategory;
		
		this.creditHours = numberToCreditHours(number);
	}
	
	/*
	 * These values are public final because once they are initialized through constructor, they won't change throughout program execution
	 * In other words, no one will be updating this info as a result of program execution. 
	 * Database may change but those changes will be reflected since course is loaded from database query.
	 */
	public final Department department;
	public final int number;
	public final String name;
	public final String description;
	public final CreditCategory creditCategory;
	public final int creditHours;
	
	/*
	 * DISCUSSION: Maybe have horizontal priority (total number of classes it is direct prereq for) 
	 * and vertical priority (the max height of tree that it is directly and indirectly a prereq for)
	 * stored in here and initialized in constructor. Technically, it shouldn't change until course is added to schedule, at which point we don't care, because classes used to calculate 
	 * priorities can't be added until it is added.
	 * 
	 * If so, TODO: add functions to do this.
	 */
	
	/*
	 * Lists of courses used to be here for prereqs and coreqs but logic is moved to query, 
	 * primarily because senior level courses will have a lot of nested lists of courses, and resulting info, that takes up memory space and isn't needed.
	 * Only need to know prereqs and coreqs when checking if course is valid to add to semester, so logic will be done then.
	 */
	
	//Returns department of course from a string identifier that follows pattern "department+number". IE, returns CSE from "CSE1105".
	public static Department parseDepartment(String identifier) {
			String departmentBuffer = "";
			
			//Go through identifier and pull out department
			for(int i = 0; i < identifier.length(); i++) {
				char currentChar = identifier.charAt(i);
			    if(Character.isLetter(currentChar) || currentChar == '_') {
			    	departmentBuffer += currentChar;
			    } else {
			    	break; //once reach number, stop since department has been read. IE, stop after reaching 1 in CSE1300.
			    }
			    
			}
			
			return Department.valueOf(departmentBuffer);
	}

	//Returns number of course from a string identifier that follows pattern "department+number". IE, returns 1105 from "CSE1105".
	public static int parseNumber(String identifier) {
			String numberBuffer = "";

			//Go through identifier and pull out number
			for(int i = 0; i < identifier.length(); i++) {
				char currentChar = identifier.charAt(i);
			    if(Character.isDigit(currentChar)) {
			    	numberBuffer += currentChar;
			    }
			}

			return Integer.parseInt(numberBuffer);
	}
	
	public boolean equals(Object otherCourse) {
		if(otherCourse instanceof Course) {
			Course temp = (Course) otherCourse;
			return (this.department.equals(temp.department) && this.number == temp.number);
		}

		else {
			return false;
		}
	}

	public String toString() {
		String result = department.toString() + String.valueOf(number);
		return result;
	}

	//Takes course number and extracts number of credit hours (second digit) by using math properties. IE 1300 returns 3.
	private int numberToCreditHours(int number)
	{
		return (number / 100) % 10;
	}
}
