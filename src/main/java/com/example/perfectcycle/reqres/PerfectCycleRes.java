package com.example.perfectcycle.reqres;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class PerfectCycleRes {

    private Map<String, Boolean> output;
}
