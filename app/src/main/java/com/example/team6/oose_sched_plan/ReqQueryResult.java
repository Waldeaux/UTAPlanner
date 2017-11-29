package com.example.team6.oose_sched_plan;

import java.util.ArrayList;

/**
 * Created by Brand on 11/10/2017.
 */

public class ReqQueryResult {
    public ReqQueryResult() {
        //DISCUSSION: Set to -1 as code that there are no flags?
        flag = -1;
        reqs = new ArrayList<ArrayList<ReqCourseEntry>>();
    }
    public ArrayList<ArrayList<ReqCourseEntry>> reqs;
    public int flag;
}
