package com.example.perfectcycle.controller;

import com.example.perfectcycle.reqres.PerfectCycleReq;
import com.example.perfectcycle.reqres.PerfectCycleRes;
import com.example.perfectcycle.service.PerfectCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/perfect-cycle")
public class PerfectCycleController {

    @Autowired
    private PerfectCycleService perfectCycleService;

    @PostMapping("/check")
    public PerfectCycleRes checkPerfectCycle(@RequestBody PerfectCycleReq perfectCycleReq) {
        return PerfectCycleRes.builder().output(perfectCycleService.checkPerfectCycle(perfectCycleReq)).build();
    }
}
