package com.matteo.configclient.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @author: holmes
 * @date: 2020/10/9 2:18 下午
 */
@Slf4j
@Component
public class MqReceiver {

    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date parse = format.parse("20201008");
        System.out.println(parse.before(now));
    }

    @RabbitListener(queuesToDeclare = @Queue("holmes"))
    public void process(String message) {
        log.info("receive messages:[{}]", message);
    }

}
