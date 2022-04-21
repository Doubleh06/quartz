package com.example.quartz.quartz.jobs;

import com.example.quartz.mapper.UserMapper;
import com.example.quartz.service.UserService;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddUserJobs implements Job {
    @Autowired
    private UserService userService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap map = jobExecutionContext.getMergedJobDataMap();
        String userName = map.getString("userName");
        userService.addUser(userName);
        System.out.println("------------定时任务执行完成-------------");
    }
}
