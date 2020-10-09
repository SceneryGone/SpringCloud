package com.matteo.configclient.producer;

import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: holmes
 * @date: 2020/10/9 2:20 下午
 */
@Slf4j
@Component
public class MqSender {

    @Resource
    private AmqpTemplate amqpTemplate;

    public void sendMessage() {
        String message = "hello world";
        log.info("send message:[{}]", message);
        amqpTemplate.convertAndSend("holmes", message);
    }

}
