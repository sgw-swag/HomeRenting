package com.se.HomeRenting.controller;

import com.se.HomeRenting.entity.Admin;
import com.se.HomeRenting.entity.User;
import com.se.HomeRenting.service.AdminService;
import com.se.HomeRenting.service.UserService;
import com.se.HomeRenting.service.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.List;

/**
 * @author ShenGW
 * @date 2021-09-05 17:27
 */
@RestController
public class loginController {

    @Autowired
    UserService userService;
    @Autowired
    AdminService adminService;

    @CrossOrigin
    @PostMapping(value = "/api/admin/login")
    @ResponseBody
    public Result adminLogin(@RequestBody Admin requestAdmin) {
        String adminName = requestAdmin.getAdminname();
        adminName = HtmlUtils.htmlEscape(adminName);

        Admin admin = adminService.get(adminName, requestAdmin.getAdminpassword());
        if (admin != null) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }

    @PostMapping(value = "/api/admin/register")
    @ResponseBody
    public Result adminregister(@RequestBody Admin requestAdmin) {
        return null;
    }


    @RequestMapping("/getAllAdmin")
    @ResponseBody
    public List<Admin> findAllAdmin(){
        return adminService.findAllAdmin();
    }

    @CrossOrigin
    @PostMapping(value = "/api/user")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        String userphone = requestUser.getUserphone();
        userphone = HtmlUtils.htmlEscape(userphone);

        User user = userService.get(userphone, requestUser.getUserpassword());
        if (user != null) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }

    @PostMapping(value = "/api/user/register")
    @ResponseBody
    public Result register(@RequestBody User requestUser) {
        return null;
    }


    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
}
