package com.example.messagingsystem.consumer;

import com.example.messagingsystem.message.SalaryCreditMessage;
import com.example.messagingsystem.util.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SalaryCreditListenerImplRMQ implements SalaryCreditListener {

    @Override
    @RabbitListener(queues = Constant.SALARY_CREDIT_QUEUE)
    public void creditSalary(SalaryCreditMessage salaryCreditMessage) {
        log.info("Salary Credit Message has been received : {}", salaryCreditMessage);
    }
}
