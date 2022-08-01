package com.example.messagingsystem.producer;

import com.example.messagingsystem.message.EmiDebitMessage;

public interface LoanDebitProducerService {

    void debitLoanEmi(EmiDebitMessage loanEmi);

}
