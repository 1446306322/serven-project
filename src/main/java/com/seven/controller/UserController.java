package com.seven.controller;

import com.seven.bean.User;
import com.seven.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
@Api
public class UserController {

    @Autowired
    private UserService userservice;


    @GetMapping("/login")
    @ApiOperation("登录验证接口")
    public User userLogin(Integer login_idcard,String login_password){
        User user = userservice.login(login_idcard,login_password);
        if(user!=null){
            return user;
        }
        return null;
    }

    @GetMapping("/register")
    @ApiOperation("注册接口")
    public int userRigister(User user){
        return userservice.register(user);
    }
}
