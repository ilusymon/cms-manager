package com.tmg.auth.controller;

import com.tmg.auth.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author Administrator
 * @version 1.0
 * @className PrivilegeController
 * @description TODO
 * @date 2021/4/28 9:58
 */
@RestController
@RequestMapping("/privilege")
public class PrivilegeController {


    @Resource
    TestService testService;

    @GetMapping("/list")
    public String list() {

        testService.insertStu();
        return "hello";
    }

}
