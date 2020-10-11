package com.matteo.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @descriptions: 权限拦截
 * @author: holmes
 * @date: 2020/10/11 2:29 下午
 */
@Slf4j
@Component
public class AuthFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return FilterConstants.AUTH_FILTER;
    }

    @Override
    public Object run() throws ZuulException {
        // 不同用户得到的权限应该是不一样的
        
        return null;
    }
}
