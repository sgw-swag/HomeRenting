package com.se.HomeRenting.controller;

import com.se.HomeRenting.entity.Admin;
import com.se.HomeRenting.service.AdminResult;
import com.se.HomeRenting.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.List;


/**
 * @author ShenGW
 * @date 2021-09-01 18:34
 */

//接收前端发送的数据，通过调用 Service 获得处理后的数据并返回
@RestController
public class AdminLoginController {

    @Autowired
    AdminService adminService;

    @CrossOrigin
    @RequestMapping(value = "/api/admin/login",method = RequestMethod.POST)
    @ResponseBody
    public AdminResult Login(@RequestBody Admin requestAdmin) {

        System.out.println("前端传来的电话号码和密码：");
        System.out.print(requestAdmin.getAdminphone() + " ; " + requestAdmin.getAdminpassword());
        System.out.println();

        String adminphone = requestAdmin.getAdminphone();
        adminphone = HtmlUtils.htmlEscape(adminphone);

        Admin admin = adminService.get(adminphone, requestAdmin.getAdminpassword());
        System.out.println(admin);

        if (admin == null) {
            System.out.println("账号或密码错误");
            return new AdminResult("400");
        } else {
            System.out.println("登陆成功");
            return new AdminResult("200");
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/api/admin/register",method = RequestMethod.POST)
    @ResponseBody
    public AdminResult register(@RequestBody Admin requestAdmin) {
        adminService.add(requestAdmin);
        return null;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/admin/logout",method = RequestMethod.GET)
    @ResponseBody
    public AdminResult logout(@RequestBody Admin requestAdmin) {
        return null;
    }

    @RequestMapping("/getAllAdmin")
    @ResponseBody
    public List<Admin> findAll(){
        return adminService.findAllAdmin();
    }
}
