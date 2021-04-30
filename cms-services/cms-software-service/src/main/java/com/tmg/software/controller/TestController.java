package com.tmg.software.controller;

import com.tmg.util.JsonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @author Administrator
 * @version 1.0
 * @className TestController
 * @description TODO
 * @date 2021/4/30 16:34
 */
@RestController
@CrossOrigin
public class TestController {

    @RequestMapping("/test")
    public JsonResult test(HttpServletRequest request) {
        System.out.println(request.getHeader("CMS-Token"));
        HashMap<String, Object> map = new HashMap<>();

        return JsonResult.ok().data(map);
    }
}
