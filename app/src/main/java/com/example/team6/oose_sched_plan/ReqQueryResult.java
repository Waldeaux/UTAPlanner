package com.example.tswal.skeletonprojecttest;

import java.util.ArrayList;

/**
 * Created by Brand on 11/10/2017.
 */

public class ReqQueryResult {
    public ReqQueryResult() {
        reqs = new ArrayList<ArrayList<ReqCourseEntry>>();
    }
    public ArrayList<ArrayList<ReqCourseEntry>> reqs;
    public int flag;
}
