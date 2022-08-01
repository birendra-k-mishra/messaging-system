package com.example.perfectcycle.service;

import com.example.perfectcycle.reqres.PerfectCycleReq;

import java.util.Map;

public interface PerfectCycleService {

    Map<String, Boolean> checkPerfectCycle(PerfectCycleReq perfectCycleReq);
}
