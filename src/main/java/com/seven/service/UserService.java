package com.seven.service;

import com.seven.bean.User;

public interface UserService {

    User login(Integer idcard, String name);
}
