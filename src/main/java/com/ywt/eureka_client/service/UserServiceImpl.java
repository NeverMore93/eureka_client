package com.ywt.eureka_client.service;

import com.ywt.eureka_client.dao.UserDao;
import com.ywt.eureka_client.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;
    @Override
    public User createUser(User user) {
        return userDao.saveAndFlush(user);
    }
}
