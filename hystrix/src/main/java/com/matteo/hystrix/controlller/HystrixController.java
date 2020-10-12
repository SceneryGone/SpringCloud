package com.matteo.hystrix.controlller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: holmes
 * @date: 2020/10/12 1:32 下午
 */
@RestController
@RequestMapping(value = "/hystrix")
@DefaultProperties(defaultFallback = "defaultFallback")
public class HystrixController {

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping(value = "/test")
    public String testHystrix() {
        throw new RuntimeException("请求服务异常");
    }

    /**
     * @description: 超时配置
     * @return {@link String}
     * @author: holmes
     * @date: 2020/10/12 1:52 下午
     */
    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
    })
    @GetMapping(value = "/test2")
    public String testDefaultFallBack() throws InterruptedException {
        Thread.sleep(2000);
        return "";
    }

    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),
    })
    @GetMapping(value = "/test3")
    public String testCircuitBreaker(@RequestParam("n") Integer n) throws InterruptedException {
        if (n == 1) {
            return "success";
        } else {
            throw new RuntimeException("请求服务异常");
        }
    }

    public String fallback() {
        return "前方太拥挤 歇会再试～";
    }

    public String defaultFallback() {
        return "我好累啊";
    }

}
