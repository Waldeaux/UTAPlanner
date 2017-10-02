package com.example.team6.oose_sched_plan;

/**
 * Created by Thomas on 9/29/2017.
 */

public class DegreePlanInfo {


    String course_dep;
    String course_num;
    String degree_name;
    String degree_year;

    public DegreePlanInfo(String course_dep, String course_num, String degree_name, String degree_year) {
        this.course_dep = course_dep;
        this.course_num = course_num;
        this.degree_name = degree_name;
        this.degree_year = degree_year;
    }

    public String getCourse_dep() {
        return course_dep;
    }

    public void setCourse_dep(String course_dep) {
        this.course_dep = course_dep;
    }

    public String getCourse_num() {
        return course_num;
    }

    public void setCourse_num(String course_num) {
        this.course_num = course_num;
    }

    public String getDegree_name() {
        return degree_name;
    }

    public void setDegree_name(String degree_name) {
        this.degree_name = degree_name;
    }

    public String getDegree_year() {
        return degree_year;
    }

    public void setDegree_year(String degree_year) {
        this.degree_year = degree_year;
    }
}

