package com.example.perfectcycle.service;

import com.example.perfectcycle.reqres.PerfectCycleReq;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class PerfectCycleServiceImpl implements PerfectCycleService {

    @Override
    public Map<String, Boolean> checkPerfectCycle(PerfectCycleReq perfectCycleReq) {
        Map<String, Boolean> output = new HashMap<>();
        for(int[] eachEntry : perfectCycleReq.getInput()) {
            output.put(Arrays.toString(eachEntry), perfectCycle(eachEntry));
        }
        return output;
    }

    public static boolean perfectCycle(int[] input) {
        int visited = 0;
        int arrIndex = 0;

        if (input[0] == 0) {
            return false;
        }
        if (getMaxNum(input) >= input.length) {
            return false;
        }
        while (visited != input.length) {
            ++visited;
            arrIndex = input[arrIndex];
        }
        return arrIndex == 0;
    }

    private static int getMaxNum(int[] input) {
        Arrays.sort(input);
        return input[input.length - 1];
    }
}
