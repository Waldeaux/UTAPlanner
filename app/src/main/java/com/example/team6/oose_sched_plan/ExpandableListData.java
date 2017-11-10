package com.example.team6.oose_sched_plan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Thomas on 11/8/2017.
 */

public class ExpandableListData {
    public static LinkedHashMap<String, List<String>> getData(String year_instance) {

        Schedule schedule = ViewFragment.schedule;
        ArrayList<Course> spring_Schedule = schedule.getCoursesInSemester(Term.Spring, Integer.parseInt(year_instance));
        ArrayList<Course> summer_Schedule = schedule.getCoursesInSemester(Term.Summer, Integer.parseInt(year_instance));
        ArrayList<Course> fall_Schedule = schedule.getCoursesInSemester(Term.Fall, Integer.parseInt(year_instance));

        LinkedHashMap <String, List<String>> expandableListCourses = new LinkedHashMap<>();
        List<String> spring_Converted = convertToList(spring_Schedule);
        List<String> summer_Converted = convertToList(summer_Schedule);
        List<String> fall_Converted = convertToList(fall_Schedule);

        expandableListCourses.put("Spring", spring_Converted);
        expandableListCourses.put("Summer", summer_Converted);
        expandableListCourses.put("Fall", fall_Converted);




        return expandableListCourses;
    }

    // Gets course list and converts it to a list
    private static List<String> convertToList(ArrayList<Course> course_list) {
        List<String> list_course = new ArrayList<>();
        for (Course course : course_list) {
            list_course.add( String.valueOf(course.department) + " " + String.valueOf(course.number) + " - " +String.valueOf(course.name));
//            list_course.add(String.valueOf(course.name));
//            list_course.add( String.valueOf(course.description));
//            list_course.add( String.valueOf(course.creditCategory));
//            list_course.add( String.valueOf(course.creditHours));
        }
        return list_course;
    }
}
