package com.example.team6.oose_sched_plan;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Thomas on 11/8/2017.
 */

public class ExpandableListData {
    public static LinkedHashMap<String, List<String>> getData(String year_instance) {


        Schedule schedule = ViewFragment.schedule;

        if (year_instance.equals("0")) {
            ArrayList<Course> transfer_Schedule = schedule.getCoursesInSemester(Term.TRANSFER, Integer.parseInt(year_instance));
            ArrayList<Course> highschool_Schedule = schedule.getCoursesInSemester(Term.HIGH_SCHOOL, Integer.parseInt(year_instance));
            ArrayList<Course> placement_Schedule = schedule.getCoursesInSemester(Term.PLACEMENT_EXAM, Integer.parseInt(year_instance));

            LinkedHashMap <String, List<String>> expandableListCourses = new LinkedHashMap<>();
            List<String> transfer_Converted = convertToList(transfer_Schedule);
            List<String> highschool_Converted = convertToList(highschool_Schedule);
            List<String> placement_Converted = convertToList(placement_Schedule);

            expandableListCourses.put("Transfer", transfer_Converted);
            expandableListCourses.put("High School", highschool_Converted);
            expandableListCourses.put("Placement Exam", placement_Converted);

            return expandableListCourses;
        }

        ArrayList<Course> spring_Schedule = schedule.getCoursesInSemester(Term.SPRING, Integer.parseInt(year_instance));
        ArrayList<Course> summer_Schedule = schedule.getCoursesInSemester(Term.SUMMER, Integer.parseInt(year_instance));
        ArrayList<Course> fall_Schedule = schedule.getCoursesInSemester(Term.FALL, Integer.parseInt(year_instance));

        LinkedHashMap <String, List<String>> expandableListCourses = new LinkedHashMap<>();
        List<String> spring_Converted = convertToList(spring_Schedule);
        List<String> summer_Converted = convertToList(summer_Schedule);
        List<String> fall_Converted = convertToList(fall_Schedule);

        expandableListCourses.put("SPRING", spring_Converted);
        expandableListCourses.put("SUMMER", summer_Converted);
        expandableListCourses.put("FALL", fall_Converted);

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
