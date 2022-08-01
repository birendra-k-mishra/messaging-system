package com.example.perfectcycle.reqres;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class PerfectCycleReq {

    private List<int[]> input;
}
