package com.matteo.eureka.controller;

import com.matteo.eureka.EurekaApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.util.List;

public class DemoControllerTest extends EurekaApplicationTests {

    @Resource
    public DemoController demoController;

    @Test
    void query() {
        List<Integer> list = demoController.query();
        Assert.assertTrue(list.size() > 0);
    }
}
