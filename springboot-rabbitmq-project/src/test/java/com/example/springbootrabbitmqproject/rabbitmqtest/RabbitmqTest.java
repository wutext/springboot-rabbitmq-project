package com.example.springbootrabbitmqproject.rabbitmqtest;

import com.example.springbootrabbitmqproject.config.RabbitmqConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void producer_send_msg_test() {
        String msg = "send one email message";
        rabbitTemplate.convertAndSend(RabbitmqConfig.EXCHANGE_TOPIC_INFORM, "inform.email", msg);
        String sms = "send one sms message";
        rabbitTemplate.convertAndSend(RabbitmqConfig.EXCHANGE_TOPIC_INFORM, "inform.sms", msg);
    }

}
