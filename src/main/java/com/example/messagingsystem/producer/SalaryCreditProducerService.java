package com.example.messagingsystem.producer;

import com.example.messagingsystem.message.SalaryCreditMessage;

public interface SalaryCreditProducerService {

    void creditSalary(SalaryCreditMessage salaryCreditDto);

}
