//DISCUSSION: Just move major to schedule and remove this class?
package com.example.team6.oose_sched_plan;

public class DegreePlan {
	public DegreePlan(String major, int startingYear, int totalCreditHours) {
		this.major = major;
		this.startingYear = startingYear;
		this.totalCreditHours = totalCreditHours;
	}

	public int getTotalCreditHours() { return totalCreditHours; }

	private String major;
	private int startingYear;
	private int totalCreditHours;
}
