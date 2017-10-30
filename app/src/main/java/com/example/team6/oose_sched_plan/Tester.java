/*
 * This is the class where a main method is located. Don't think we need this long term since Android Studio GUI is going to be running and just using this package for data and logic.
 */
package com.example.team6.oose_sched_plan;

import java.util.*;

public class Tester {
	public static void main(String[] args) {
		try {
			Schedule s = new Schedule();
			s.addCourse(Term.Spring, 2017, new Course(Department.CSE, 1100, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.Spring, 2017, new Course(Department.CSE, 1200, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.Spring, 2017, new Course(Department.CSE, 1300, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.Spring, 2018, new Course(Department.CSE, 1400, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.Spring, 2018, new Course(Department.CSE, 1500, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.Spring, 2018, new Course(Department.CSE, 1600, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.Fall, 2018, new Course(Department.CSE, 2100, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.Fall, 2018, new Course(Department.CSE, 2200, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.Fall, 2018, new Course(Department.CSE, 2300, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.Fall, 2018, new Course(Department.CSE, 2400, "test1", "testdesc1", CreditCategory.Required));

			s.Save("Test.schedule");
			System.out.println("Saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
