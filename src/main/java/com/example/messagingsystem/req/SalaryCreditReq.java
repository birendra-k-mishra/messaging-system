package com.example.messagingsystem.req;

import lombok.Data;

@Data
public class SalaryCreditReq {

    private String accountNo;
    private Long salaryAmount;
    private boolean hasLoan;
}
