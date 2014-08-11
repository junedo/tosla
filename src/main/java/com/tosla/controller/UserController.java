/*
 * Copyright (c) 2010-2013 meituan.com
 * All rights reserved.
 * 
 */
package com.tosla.controller;

import com.tosla.domain.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * TODO 在这里编写类的功能描述
 *
 * @author yuexiaojun
 * @version 1.0
 * @created 2014-08-12
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Object getAllUsers() {
        List<User> userList = new ArrayList<User>();
        User user1 = new User();
        user1.setId(1);
        user1.setAddTime(new Date());
        user1.setName("拉风少年");
        user1.setPassword("123456");

        User user2 = new User();
        user1.setId(2);
        user1.setAddTime(new Date());
        user1.setName("千字");
        user1.setPassword("123456");

        userList.add(user1);
        userList.add(user2);
        return userList;
    }
}