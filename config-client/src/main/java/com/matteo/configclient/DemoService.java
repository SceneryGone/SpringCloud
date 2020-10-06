package com.matteo.configclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author: holmes
 * @date: 2020/10/6 4:45 下午
 */
@Slf4j
@Service
public class DemoService {

    @Value("${name}")
    private String name;

    public void show() {
        log.info("name:{}", name);
    }

}
