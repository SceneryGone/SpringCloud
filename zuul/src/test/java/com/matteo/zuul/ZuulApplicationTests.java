package com.matteo.zuul;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;

@Slf4j
@SpringBootTest
class ZuulApplicationTests {

    @Test
    void contextLoads() {
        RestTemplate restTemplate = new RestTemplate();
        for (int i = 0; i < 200; i++) {
            ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8010/config-client/demo", String.class);
            log.info("response:{}", forEntity);
        }
    }

}
