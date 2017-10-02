package me.brandonchase.utaplanner;

import java.util.ArrayList;

public class Course {
	//-----PUBLIC INTERFACE-----
	// TODO: Constructor
	public boolean equals(Course otherCourse) {
		return (department == otherCourse.department && number == otherCourse.number);
	}
	
	public void setDepartment(Department x) { department = x; }
	public Department getDeparment() { return department; }
	
	public void setNumber(int x) { number = x; }
	public int getNumber() { return number; }
	
	public void setName(String x) { name = x; }
	public String getName() { return name; }
	
	public void setDescription(String x) { description = x; }
	public String getDescription() { return description; }
	
	public void setCreditCategory(CreditCategory x) { creditCategory = x; }
	public CreditCategory getCreditCategory() { return creditCategory; }
	
	// TODO: add and remove prereq, coreq, alternatives
	
	//------PRIVATE DATA------ DISCUSSION: Could these be public final vars since their values are never going to change.
	private Department department;
	private int number;
	private String name;
	private String description;
	private CreditCategory creditCategory;
	private ArrayList<Course> prereqs;
	
	/* DISCUSSION: Is having a list of courses in the course class lead to infinite dependency?
	 * For example, CSE 1200 has list of coreq containing CSE 1300 which has a list of coreq containing CSE 1200 which has a list of coreq containing CSE 1300 ... 
	 * That's why my thought was to have String id for course and then have list of ids.
	 */
	private ArrayList<Course> coreqs;
	private ArrayList<Course> alternatives;
}
