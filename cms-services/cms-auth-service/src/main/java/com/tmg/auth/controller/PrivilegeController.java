package com.tmg.auth.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tmg.auth.service.PrivilegeService;
import com.tmg.model.auth.Privilege;
import com.tmg.util.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


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
    private PrivilegeService privilegeService;



    @GetMapping("/list")
    public JsonResult list() {
        Privilege privilege = new Privilege();
        privilege.setSearchString("");
        IPage<Privilege> privilegePage = privilegeService.query(privilege);

        return JsonResult.build(JsonResult.SUCCESS, privilegePage);
    }

}
