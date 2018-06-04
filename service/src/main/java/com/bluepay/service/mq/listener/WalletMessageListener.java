package com.bluepay.service.mq.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "${listen.queue.wallet.message}")
public class WalletMessageListener {
    private static final Logger logger = LoggerFactory.getLogger(WalletMessageListener.class);

    @Value("${listen.queue.wallet.message}")
    private String queueName;

    @RabbitHandler
    public void process(String message) {//监听消息
        logger.info("接收到消息：{}", message);
        processMessage(message, queueName);
    }

    public void processMessage(String content, String queueName) {
        System.out.println(content);
        //业务处理
    }

    public void printQueueName(){
        System.out.println(queueName);
    }
}
