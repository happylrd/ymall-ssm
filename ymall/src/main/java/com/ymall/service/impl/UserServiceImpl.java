package com.ymall.service.impl;

import com.ymall.common.ServerResponse;
import com.ymall.dao.UserMapper;
import com.ymall.pojo.User;
import com.ymall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse<User> login(String username, String password) {
        return null;
    }
}
