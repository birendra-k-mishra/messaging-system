package com.example.messagingsystem.consumer;

import com.example.messagingsystem.message.EmiDebitMessage;
import com.example.messagingsystem.util.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmiDebitListenerImplRMQ implements EmiDebitListener {

    @Override
    @RabbitListener(queues = Constant.EMI_DEBIT_QUEUE)
    public void debitEmi(EmiDebitMessage emiDebitMessage) {
      log.info("Emi Debit Request has been received successfully : {}", emiDebitMessage);
    }
}
