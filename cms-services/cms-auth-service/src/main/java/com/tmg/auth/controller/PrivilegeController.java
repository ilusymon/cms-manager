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

    /*{
    "code": 20000,
    "data": {
        "token": "admin-token"
    }
}*/
    @RequestMapping("user/login")
    public String login() {
        return "{\n" +
                "    \"code\": 20000,\n" +
                "    \"data\": {\n" +
                "        \"token\": \"admin-token\"\n" +
                "    }\n" +
                "}";
    }

    @GetMapping("/list")
    public JsonResult list() {
        Privilege privilege = new Privilege();
        privilege.setSearchString("");
        IPage<Privilege> privilegePage = privilegeService.query(privilege);
        return JsonResult.build(JsonResult.SUCCESS, privilegePage);
    }

}
