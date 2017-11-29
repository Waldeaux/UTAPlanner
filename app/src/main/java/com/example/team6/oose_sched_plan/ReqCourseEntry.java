package com.example.team6.oose_sched_plan;

/**
 * Created by Brand on 11/10/2017.
 */

public class ReqCourseEntry {
    public ReqCourseEntry(Course course, boolean coreq){
        this.course = course;
        this.coreq = coreq;
    }
    public Course course;
    public boolean coreq;
}
