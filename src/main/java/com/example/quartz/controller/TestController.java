package com.example.quartz.controller;

import com.example.quartz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dh
 * @version 1.0
 * @description: TODO
 * @date 2022/4/21 下午4:51
 */
@RestController
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public void  test(){
        userService.getUserList();
    }
}
