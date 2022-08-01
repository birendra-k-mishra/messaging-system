package com.example.messagingsystem.service;

import com.example.messagingsystem.message.SalaryCreditMessage;
import com.example.messagingsystem.message.EmiDebitMessage;
import com.example.messagingsystem.producer.LoanDebitProducerService;
import com.example.messagingsystem.producer.SalaryCreditProducerService;
import com.example.messagingsystem.req.SalaryCreditReq;
import com.example.messagingsystem.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private LoanDebitProducerService loanDebitProducerService;

    @Autowired
    private SalaryCreditProducerService salaryCreditProducerService;

    @Override
    public String processSalary(SalaryCreditReq salaryCreditReqDto) {

        salaryCreditProducerService.creditSalary
                (SalaryCreditMessage.builder().accountNo(salaryCreditReqDto.getAccountNo())
                        .amount(salaryCreditReqDto.getSalaryAmount()).build());

        loanDebitProducerService.debitLoanEmi(EmiDebitMessage.builder().id(UUID.randomUUID().toString())
                .emiAmount(Constant.EMI_AMT).accountId(salaryCreditReqDto.getAccountNo()).build());

        return "SUCCESS";
    }
}
