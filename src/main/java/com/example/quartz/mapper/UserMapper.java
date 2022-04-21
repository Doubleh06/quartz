package com.example.quartz.mapper;

import com.example.quartz.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    List<User> list();

    @Insert("insert into user values (#{id},#{userName})")
    void insert(String id,String userName);
}
