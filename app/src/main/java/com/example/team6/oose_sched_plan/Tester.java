/*
 * This is the class where a main method is located. Don't think we need this long term since Android Studio GUI is going to be running and just using this package for data and logic.
 */
package com.example.team6.oose_sched_plan;

public class Tester {
	public static void main(String[] args) {
		try {
			Schedule s = new Schedule(new DegreePlan("Computer Science", 2017, 120));
			s.addCourse(Term.SPRING, 2017, new Course(Department.CSE, 1100, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.SPRING, 2017, new Course(Department.CSE, 1200, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.SPRING, 2017, new Course(Department.CSE, 1300, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.SPRING, 2018, new Course(Department.CSE, 1400, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.SPRING, 2018, new Course(Department.CSE, 1500, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.SPRING, 2018, new Course(Department.CSE, 1600, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.FALL, 2018, new Course(Department.CSE, 2100, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.FALL, 2018, new Course(Department.CSE, 2200, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.FALL, 2018, new Course(Department.CSE, 2300, "test1", "testdesc1", CreditCategory.Required));
			s.addCourse(Term.FALL, 2018, new Course(Department.CSE, 2400, "test1", "testdesc1", CreditCategory.Required));

			s.Save("Test.schedule");
			System.out.println("Saved");

			Schedule s2 = new Schedule();
			s2.Load("Test.schedule");
			System.out.println("Loaded");
			System.out.print(s2.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
