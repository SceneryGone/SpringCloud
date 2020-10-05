package com.matteo.eureka.controller;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author: holmes
 * @date: 2020/10/5 7:46 下午
 */
@Slf4j
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @GetMapping("/query")
    public List<Integer> query() {
        return Arrays.asList(1, 2, 3, 4, 5);
    }

}
