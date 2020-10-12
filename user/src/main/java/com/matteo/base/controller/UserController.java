package com.matteo.base.controller;

import com.matteo.base.entity.User;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: holmes
 * @date: 2020/10/11 3:32 下午
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "/info")
    public User getUserInfo(){
        User user = new User();
        user.setId(1);
        user.setName("holmes");
        user.setAddress("shanghai");
        return user;
    }
}
