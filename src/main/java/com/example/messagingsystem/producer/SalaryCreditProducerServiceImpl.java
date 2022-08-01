package com.example.messagingsystem.producer;

import com.example.messagingsystem.message.SalaryCreditMessage;
import com.example.messagingsystem.util.Constant;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryCreditProducerServiceImpl implements SalaryCreditProducerService {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Override
    public void creditSalary(SalaryCreditMessage salaryCreditMessage) {
        rabbitTemplate.convertAndSend(Constant.EXCHANGE, Constant.SALARY_CREDIT_ROUTING_KEY, salaryCreditMessage);
    }
}
