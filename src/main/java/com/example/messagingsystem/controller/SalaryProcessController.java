package com.example.messagingsystem.controller;

import com.example.messagingsystem.req.SalaryCreditReq;
import com.example.messagingsystem.req.SalaryCreditRes;
import com.example.messagingsystem.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/salary")
public class SalaryProcessController {

    @Autowired
    private SalaryService salaryService;

    @PostMapping("/credit")
    public SalaryCreditRes processSalary(@RequestBody SalaryCreditReq salaryCreditReq) {
        String message = salaryService.processSalary(salaryCreditReq);
        return SalaryCreditRes.builder().status(message).build();
    }

}
