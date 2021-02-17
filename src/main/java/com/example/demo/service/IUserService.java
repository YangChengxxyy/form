package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.User;

/**
 * 服务类
 *
 * @author YangChengxxyy
 * @since 2021-02-01
 */
public interface IUserService extends IService<User> {
    User login(String userName, String password);
}