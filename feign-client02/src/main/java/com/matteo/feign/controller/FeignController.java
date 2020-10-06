package com.matteo.feign.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author: holmes
 * @date: 2020/10/6 1:19 下午
 */
@Slf4j
@RestController
@RequestMapping("/message")
public class FeignController {

    @GetMapping(value = "/query")
    public String getMsg() {
        return "this message from feign" + new Random().nextInt(10);
    }

}
