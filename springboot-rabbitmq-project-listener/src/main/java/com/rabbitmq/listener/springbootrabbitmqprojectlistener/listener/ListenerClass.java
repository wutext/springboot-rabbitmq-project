package com.rabbitmq.listener.springbootrabbitmqprojectlistener.listener;

import com.rabbitmq.client.Channel;
import com.rabbitmq.listener.springbootrabbitmqprojectlistener.config.RabbitmqConfig;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ListenerClass {

    @RabbitListener(queues = RabbitmqConfig.QUEUE_INFORM_EMAIL)
    public void listenerEmailMsg(String msg, Message message, Channel channel) {
        System.out.println(msg);
    }

    @RabbitListener(queues = RabbitmqConfig.QUEUE_INFORM_SMS)
    public void listenerSmsMsg(String msg, Message message, Channel channel) {
        System.out.println(msg);
    }
}
