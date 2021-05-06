package com.tmg.user.controller;

import com.tmg.user.service.UserService;
import com.tmg.model.auth.User;
import com.tmg.util.JsonResult;
import com.tmg.util.JwtUtils;
import jodd.util.StringUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * @author Administrator
 * @version 1.0
 * @className com.tmg.user.controller.UserController
 * @description TODO
 * @date 2021/4/30 14:35
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /*{
    "code": 20000,
    "data": {
        "token": "admin-token"
    }
}*/
    @RequestMapping("/login")
    public JsonResult login(String username, String password, String code , HttpServletRequest request, HttpServletResponse response) {

        User user = userService.getUser(username, password);
        System.out.println(user);
        if (user != null) {
            HashMap<String, Object> tokenMap = new HashMap<>();
            String token = JwtUtils.geneJsonWebToken(user);
            tokenMap.put("token", token);
            return JsonResult.ok(tokenMap);
        }
        return JsonResult.err("账号或密码错误");
    }

    /**/
    @RequestMapping("/info")
    public JsonResult getUserInfo(HttpServletRequest req) {
        String userId = JwtUtils.getMemberIdByJwtToken(req);
        if (StringUtil.isNotEmpty(userId)) {
            // todo 在redis中查询token有没有过期，过期就map.put("newToken",newToken);更新redis中的token
            User user = userService.getUser(userId);
            HashMap<String, Object> data = new HashMap<>();
            data.put("introduction", user.getDescription());
            data.put("avatar", user.getHeadUrl());
            data.put("name", user.getUsername());
            data.put("roles", user.getRoleId());
            System.out.println("req.getHeader(\"CMS-Token\") = " + req.getHeader("CMS-Token"));
            return JsonResult.ok().data(data);
        }
        return JsonResult.err();
    }
}
