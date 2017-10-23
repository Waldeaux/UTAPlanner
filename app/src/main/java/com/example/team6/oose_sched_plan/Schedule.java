package com.example.team6.oose_sched_plan;

import java.util.ArrayList;

public class Schedule {
	public Schedule() {
		semesters = new ArrayList<>();
	}

	//------------------------------------------------------------------------------
	//------------------------------ PUBLIC INTERFACE ------------------------------
	//------------------------------------------------------------------------------

	//ADD COURSE
		public void addCourse(Term term, int year, Course course) {
			Semester s = getSemester(term, year);

			if (s.year == -1) { //if semester doesn't exist, add semester then try again
				addSemester(term, year);
				addCourse(term, year, course);
			} else {
				s.add(course);
			}
		}

	//REMOVE COURSE
		public void removeCourse(Term term, int year, Course course) {
			Semester s = getSemester(term, year);

			if (s.year != -1) { //only remove course from semester if semester exists
				s.remove(course);
			}
		}

	//GET LIST OF AVAILABLE COURSES FOR SEMESTER
		/*
		 * Returns list of courses that are valid for given semester. Currently code in function calls assumes given semester is current semester (which it will be for semester-by-semester)
		 * but will updated soon so that it is more versatile.
		 */
		public ArrayList<Course> generateAvailableCourses(Term term, int year) {
			//Get courses offered in specified semester
			ArrayList<Course> validCourses = Database.queryCoursesInTerm(term, year);

			//Remove courses that have already been taken
			//TODO: make sure removing a course doesnt mess up iteration through list
			for(Course currentCourse : validCourses) {
				//Remove courses that have already been taken
				if(this.contains(currentCourse)) {
					validCourses.remove(currentCourse);
					continue; //already removed so don't need to check any other conditions for removal
				}

				//Remove courses that don't have prereqs met.
				ArrayList<Course> prereqs = Database.queryPrereqs(currentCourse);
				if(!this.meetsPrereqs(prereqs)) {
					validCourses.remove(currentCourse);
					continue; //already removed so don't need to check any other conditions for removal
				}

				//Remove courses that don't have coreqs met.
				ArrayList<Course> coreqs = Database.queryCoreqs(currentCourse);
				if(!this.meetsCoreqs(coreqs)) {
					validCourses.remove(currentCourse);
				}
			}

			//return list of courses that have passed all checks for validity and not been removed from list
			return validCourses;
		}

	//MISCELLANEOUS FUNCTIONS THAT MIGHT BE NEEDED
		public int calculateCreditHours() {
			int creditHours = 0;
			for(Semester currentSemester : semesters) {
				creditHours += currentSemester.calculateCreditHours();
			}

			return creditHours;
		}

		/*
		* DISCUSSION: how to get access to degree plan to get total credit hours b/c right now student class contains degreePlan and Schedule,
		* so I guess student would be public interface for GUI and student could pass it.
		* If remove student since assume only one student will use this app since it is on phone, have degreeplan as member of schedule and then has direct access.
		* Also, just occurred that Major is better name for DegreePlan?
		*/
		public int calculateRemainingCreditHours(DegreePlan major) {
			return (major.totalCreditHours - this.calculateCreditHours());
		}

		public boolean isValid() {
			//Does have all required courses
			//For all technical electives, does have required number of classes
			//Do all preqreqs, coreqs come before class they are supposed to (this will be true for building semester by semester)

			return false; //REMOVE: just here to remove warning that no value returned
		}

		//Methods on back burner for Iteration 3
		public void removeConflicts() {}





	//---------------------------------------------------------------------
	//------------------------------ PRIVATE ------------------------------
	//---------------------------------------------------------------------
	private ArrayList<Semester> semesters;

	private void addSemester(Term term, int year) {
		semesters.add(new Semester(term, year));
	}

	//returns -1 for semester year if semester not in schedule
	private Semester getSemester(Term term, int year) {
		for(Semester s : semesters) {
			if(s.term == term && s.year == year) {
				return s;
			}
		}
		
		//if semester not in schedule, return error semester
		return new Semester(Term.Fall, -1);
	}
	
	public boolean contains(Course course) {
		boolean containsCourse = false;
		for(Semester currentSemester : semesters) {
			if(currentSemester.contains(course)) {
				containsCourse = true;
				break;
			}
		}
		
		return containsCourse;
	}
	
	//TODO: Adjust for if not doing semester by semester building (get passed term and year and only check up to semester before it)
	private boolean meetsPrereqs(ArrayList<Course> prereqs) {
		boolean containsAllPrereqs = true; //assume true and be proven false by semester that doesn't contain coreq
		
		//check that schedule contains each coreq
		for(Course prereq : prereqs) {
			boolean containsPrereq = false;
			//loop through all semesters  except current one since courses in current semester can't satisfy prereq conditions
			for(int i = 0; i < semesters.size() - 1; i++) {
				if(semesters.get(i).contains(prereq)) {
					containsPrereq = true;
					break; //found prereq so stop searching for it in schedule
				}
			}
			
			if(!containsPrereq) {
				containsAllPrereqs = false;
				break; //schedule did not contain specified coreq, so stop checking any more coreqs and return that schedule doesn't meet coreq 
			}
		}
		
		return containsAllPrereqs;
	}
	
	//TODO: Adjust for if not doing semester by semester building (get passed term and year and only check up to that semester)
	private boolean meetsCoreqs(ArrayList<Course> coreqs) {
		boolean containsAllCoreqs = true; //assume true and be proven false by semester that doesn't contain coreq
		
		//check that schedule contains each coreq
		for(Course coreq : coreqs) {
			boolean containsCoreq = false;
			//loop through all semesters since current semester can also contain coreq
			for(Semester currentSemester : semesters) {
				if(currentSemester.contains(coreq)) {
					containsCoreq = true;
					break; //found coreq so stop searching for it in schedule
				}
			}
			
			if(!containsCoreq) {
				containsAllCoreqs = false;
				break; //schedule did not contain specified coreq, so stop checking any more coreqs and return that schedule doesn't meet coreq 
			}
		}
		
		return containsAllCoreqs;
	}
}
