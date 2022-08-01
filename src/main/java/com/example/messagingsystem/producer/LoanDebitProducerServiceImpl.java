package com.example.messagingsystem.producer;

import com.example.messagingsystem.message.EmiDebitMessage;
import com.example.messagingsystem.req.SalaryCreditRes;
import com.example.messagingsystem.util.Constant;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanDebitProducerServiceImpl implements LoanDebitProducerService {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Override
    public void debitLoanEmi(EmiDebitMessage loanEmi) {
        rabbitTemplate.convertAndSend(Constant.EXCHANGE, Constant.EMI_DEBIT_ROUTING_KEY, loanEmi);
    }
}
