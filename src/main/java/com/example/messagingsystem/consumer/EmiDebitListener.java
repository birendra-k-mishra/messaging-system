package com.example.messagingsystem.consumer;

import com.example.messagingsystem.message.EmiDebitMessage;
import org.springframework.stereotype.Service;

@Service
public interface EmiDebitListener {

    void debitEmi(EmiDebitMessage emiDebitMessage);
}
