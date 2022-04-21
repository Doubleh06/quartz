package com.example.quartz.controller;

import cn.hutool.core.date.DateUtil;
import com.example.quartz.quartz.QuartzManager;
import com.example.quartz.quartz.jobs.AddUserJobs;
import com.example.quartz.service.UserService;

import org.quartz.JobDataMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    @Autowired
    private QuartzManager quartzManager;

    @RequestMapping("test")
    public void  test(){
        userService.getUserList();
    }

    @RequestMapping("addUser")
    public void addUser(@RequestParam String userName){
        userService.addUser(userName);
    }


    @RequestMapping("quartzAddUser")
    public void testQuartz() throws Exception {
        JobDataMap map = new JobDataMap();
        map.put("userName","test-"+new SimpleDateFormat("SSS").format(new Date()));
        Date date = DateUtil.offsetSecond(new Date(),30);
        quartzManager.startAt("testQuartz","testQuartz",date, AddUserJobs.class,map);
    }

}
