package com.example.community1.service.Impl;

import com.example.community1.dao.UserMapper;
import com.example.community1.entity.User;
import com.example.community1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserMapper userMapper;
    @Override
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
