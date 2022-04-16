package com.jiker.dubbo.demo.mock;

import com.jiker.dubbo.demo.User;
import com.jiker.dubbo.demo.UserService;

public class UserServiceMock implements UserService {

    @Override
    public User getUserByUserName(String userName) {

        //降级实现
        return new User(1L, "mock_username", "mock_password");
    }
}
