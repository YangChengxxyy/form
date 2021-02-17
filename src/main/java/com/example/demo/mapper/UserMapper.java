package com.example.demo.mapper;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.User;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    User selectOneByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
