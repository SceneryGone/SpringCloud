package com.matteo.sleuth.controller;

import com.matteo.sleuth.feign.UserFeignService;
import org.springframework.cloud.sleuth.sampler.SamplerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: holmes
 * @date: 2020/10/12 4:01 下午
 */
@RestController
@RequestMapping(value = "/sleuth")
public class SleuthController {

    @Resource
    private UserFeignService userFeignService;

    @GetMapping(value = "")
    public String getSleuth() {
        return userFeignService.getMsg();
    }

    @GetMapping(value = "/test")
    public String getName() {
        try {
            Thread.sleep(1000 * 3);
            return userFeignService.getMsg();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "sleuth";
    }

}
