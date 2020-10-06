package com.matteo.feign.controller;

import com.matteo.feign.callFeign.FeignMessageClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: holmes
 * @date: 2020/10/6 1:25 下午
 */
@RestController
public class MessageController {

    @Resource
    private FeignMessageClient feignMessageClient;

    @GetMapping("/msg")
    public String getMsg() {
        return feignMessageClient.getMsg();
    }

}
