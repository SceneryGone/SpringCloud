package com.matteo.configclient.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: holmes
 * @date: 2020/10/9 2:18 下午
 */
@Slf4j
@Component
public class MqReceiver {

    @RabbitListener(queuesToDeclare = @Queue("holmes"))
    public void process(String message) {
        log.info("receive messages:[{}]", message);
    }

}
