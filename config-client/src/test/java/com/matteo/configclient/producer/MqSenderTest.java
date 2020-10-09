package com.matteo.configclient.producer;

import com.matteo.configclient.ConfigClientApplicationTests;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;


class MqSenderTest extends ConfigClientApplicationTests {

    @Resource
    private MqSender mqSender;

    @Test
    void sendMessage() {
        mqSender.sendMessage();
    }
}
