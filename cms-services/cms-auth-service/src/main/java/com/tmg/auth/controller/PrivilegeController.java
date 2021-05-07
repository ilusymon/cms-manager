package com.tmg.auth.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tmg.auth.service.DictionaryService;
import com.tmg.auth.service.PrivilegeService;
import com.tmg.model.auth.Dictionary;
import com.tmg.model.auth.Privilege;
import com.tmg.util.JsonResult;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

    @Resource
    private DictionaryService dictionaryService;


    @GetMapping("/list")
    public JsonResult list(String searchName, Integer type, Integer siteId, Integer currentPage, Integer pageSize) {
        Privilege privilege = new Privilege();
        if (!StringUtils.isEmpty(searchName)) {
            privilege.setName(searchName);
        }
        if (type != null && type != 0) {
            privilege.setType(type);
        }
        if (siteId != null && siteId != 0) {
            privilege.setCategoryId(siteId);
        }
        HashMap<String, Object> data = new HashMap<>();
        List<Dictionary> sitemapCategoryList = dictionaryService.queryForTypeId(22);
        IPage<Privilege> privilegePage = privilegeService.getPrivilegePage(privilege, currentPage, pageSize);
        data.put("siteMaps", sitemapCategoryList);
        data.put("res", privilegePage);
        return JsonResult.build(JsonResult.SUCCESS, data);
    }

}
