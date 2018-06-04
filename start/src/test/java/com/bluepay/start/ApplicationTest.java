package com.bluepay.start;

import com.bluepay.service.mq.listener.WalletMessageListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@TestPropertySource("classpath:rabbitmq.properties")
public class ApplicationTest {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Resource
    WalletMessageListener walletMessageListener;

    @Test
    public void test(){
        walletMessageListener.printQueueName();
    }
}