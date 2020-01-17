package com.xhpro.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 用户控制器
 *
 * @author xh
 * @since 2020-01-16
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequiresPermissions("user:show")
    @ResponseBody
    @RequestMapping("/show")
    public String showUser() {
        return "这是学生信息";
    }
}
