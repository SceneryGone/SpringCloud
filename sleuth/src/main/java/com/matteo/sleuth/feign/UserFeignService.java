package com.matteo.sleuth.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: holmes
 * @date: 2020/10/12 4:07 下午
 */
@FeignClient(name = "USER")
public interface UserFeignService {

    @GetMapping("/user/info")
    String getMsg();

}
