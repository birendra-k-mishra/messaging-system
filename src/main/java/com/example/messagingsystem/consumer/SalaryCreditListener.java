package com.example.messagingsystem.consumer;

import com.example.messagingsystem.message.SalaryCreditMessage;

public interface SalaryCreditListener {

    void creditSalary(SalaryCreditMessage salaryCreditMessage);
}
