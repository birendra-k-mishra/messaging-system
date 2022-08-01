package com.example.messagingsystem.config;

import com.example.messagingsystem.util.Constant;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(Constant.EXCHANGE);
    }

    @Bean
    @Qualifier("emiDebitQueue")
    public Queue emiDebitQueue() { return new Queue(Constant.EMI_DEBIT_QUEUE);}

    @Bean
    @Qualifier("salaryCreditQueue")
    public Queue salaryCreditQueue() { return new Queue(Constant.SALARY_CREDIT_QUEUE);}


    @Bean
    public Binding bindingLoanDebit(@Qualifier("emiDebitQueue") Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(Constant.EMI_DEBIT_ROUTING_KEY);
    }

    @Bean
    public Binding bindingSalaryCredit(@Qualifier("salaryCreditQueue") Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(Constant.SALARY_CREDIT_ROUTING_KEY);
    }

    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(messageConverter());
        return template;
    }

}
