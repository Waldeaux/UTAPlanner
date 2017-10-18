/*
 * This is the class where a main method is located. Don't think we need this long term since Android Studio GUI is going to be running and just using this package for data and logic.
 */
package me.brandonchase.utaplanner;

public class Tester {
	public static void main(String[] args) {
		try {
			Schedule s = new Schedule();
			s.addSemester(Term.Fall, 2017);
			s.getSemester(Term.Fall, 2017).add(new Course(Department.AAST, 1100, "Test Name", "Test Desc", CreditCategory.CreativeArts));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
