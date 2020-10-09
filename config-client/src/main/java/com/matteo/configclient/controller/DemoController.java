package com.matteo.configclient.controller;

import com.matteo.configclient.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author: holmes
 * @date: 2020/10/9 11:52 上午
 */
@Slf4j
@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping(value = "/demo")
    public String testSpringCloudConfig() {
        return demoService.show();
    }

}
