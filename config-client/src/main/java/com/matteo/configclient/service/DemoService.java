package com.matteo.configclient.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * @author: holmes
 * @date: 2020/10/6 4:45 下午
 */
@Slf4j
@Service
@RefreshScope
public class DemoService {

    @Value("${name}")
    private String name;

    public String show() {
        log.info("name:{}", name);
        return name;
    }

}
