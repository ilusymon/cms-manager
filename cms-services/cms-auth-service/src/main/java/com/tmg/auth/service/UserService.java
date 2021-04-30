package com.tmg.auth.service;

import com.tmg.entity.auth.User;

/**
 * @author Administrator
 * @version 1.0
 * @className UserService
 * @description TODO
 * @date 2021/4/30 14:38
 */
public interface UserService {


    User getUser(String username, String password);

    User getUser(String id);
}
