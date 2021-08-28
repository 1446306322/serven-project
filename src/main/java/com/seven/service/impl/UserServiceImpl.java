package com.seven.service.impl;

import com.seven.bean.User;
import com.seven.mapper.UserMapper;
import com.seven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(Integer idcard, String name) {
        return userMapper.login(idcard,name);
    }
}
