package com.tmg.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tmg.model.auth.User;
import com.tmg.user.mapper.UserMapper;
import com.tmg.user.service.UserService;
import com.tmg.util.Md5Utils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @version 1.0
 * @className com.tmg.user.service.impl.UserServiceImpl
 * @description TODO
 * @date 2021/4/30 14:38
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User getUser(String username, String password) {
        password = Md5Utils.MD5Encode(password, "UTF-8", false);
        System.out.println(password);
        return userMapper.selectOne(new QueryWrapper<User>().eq("pin", username).eq("password", password));
    }

    @Override
    public User getUser(String id) {
        return userMapper.selectOne(new QueryWrapper<User>().eq("id", id));
    }
}
