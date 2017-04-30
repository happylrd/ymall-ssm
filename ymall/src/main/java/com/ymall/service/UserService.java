package com.ymall.service;

import com.ymall.common.ServerResponse;
import com.ymall.pojo.User;

public interface UserService {

    ServerResponse<User> login(String username, String password);
}
