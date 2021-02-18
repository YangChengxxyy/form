package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * 前端控制器
 * @author YangChengxxyy
 * @since 2021-02-01
 */
@RestController
@RequestMapping("/api")
public class UserController {


    @Qualifier("userServiceImpl")
    @Autowired
    IUserService iUserService = new UserServiceImpl();

    @RequestMapping(value = "/login")
    User login(@RequestParam("username")String userName, @RequestParam("password") String password) {
        return iUserService.login(userName, password);
    }
}