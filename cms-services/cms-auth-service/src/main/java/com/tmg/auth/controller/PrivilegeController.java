package com.tmg.auth.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tmg.auth.service.PrivilegeService;
import com.tmg.entity.auth.Privilege;
import com.tmg.util.JsonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;


/**
 * @author Administrator
 * @version 1.0
 * @className PrivilegeController
 * @description TODO
 * @date 2021/4/28 9:58
 */
@CrossOrigin
@RestController
@RequestMapping("/privilege")
public class PrivilegeController {

    @Resource
    private PrivilegeService privilegeService;



    @GetMapping("/list")
    public JsonResult list(HttpServletRequest req) {
        Privilege privilege = new Privilege();
        privilege.setSearchString("");
        IPage<Privilege> privilegePage = privilegeService.query(privilege);
        System.out.println("req.getHeader(\"vue_admin_template_token\") = " + req.getHeader("vue_admin_template_token"));
        System.out.println("req.getHeader(\"X-Token\") = " + req.getHeader("X-Token"));

        return JsonResult.build(JsonResult.SUCCESS, privilegePage);
    }

}
