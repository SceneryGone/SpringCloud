package com.matteo.feign.callFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: holmes
 * @date: 2020/10/6 1:21 下午
 */
@FeignClient(name = "FEIGN-CLIENT02")
public interface FeignMessageClient {

    @GetMapping("/feign-client02/message/query")
    String getMsg();

}
