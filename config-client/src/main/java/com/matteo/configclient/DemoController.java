package com.matteo.configclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: holmes
 * @date: 2020/10/9 11:52 上午
 */
@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping(value = "/demo")
    public String testSpringCloudConfig() {
        return demoService.show();
    }

}
