package com.seven.controller;

import com.seven.bean.User;
import com.seven.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping("/login")
    @ApiOperation("登录验证接口")
    public User userLogin(Integer idcard,String name){
        User user = userservice.login(idcard,name);
        return user;
    }
}
