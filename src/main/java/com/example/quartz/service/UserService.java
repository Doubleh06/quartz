package com.example.quartz.service;

import com.example.quartz.entity.User;
import com.example.quartz.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dh
 * @version 1.0
 * @description: TODO
 * @date 2022/4/21 下午5:07
 */

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void getUserList(){
        List<User> list = userMapper.list();
        for (User user : list) {
            System.out.println(user.toString());
        }
    }
}
