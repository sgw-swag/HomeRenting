package com.se.HomeRenting.controller;

import com.se.HomeRenting.entity.User;
import com.se.HomeRenting.service.AdminResult;
import com.se.HomeRenting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.List;

/**
 * @author ShenGW
 * @date 2021-09-07 14:27
 */
@RestController
public class UserLoginController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @RequestMapping(value = "/api/user/login",method = RequestMethod.POST)
    @ResponseBody
    public String Login(@RequestBody User requestUser) {

        System.out.println("前端传来的电话号码和密码：");
        System.out.print(requestUser.getUserphone() + " ; " + requestUser.getUserpassword());
        System.out.println();

        String userphone = requestUser.getUserphone();
        userphone = HtmlUtils.htmlEscape(userphone);

        User user = userService.get(userphone, requestUser.getUserpassword());
        System.out.println(user);

        if (user == null) {
            System.out.println("账号或密码错误");
            return "-1";
        } else {
            System.out.println("登陆成功");
            return ("1 " + user.getUsernickname());
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/api/user/register",method = RequestMethod.POST)
    @ResponseBody
    public AdminResult register(@RequestBody User requestUser) {
        userService.add(requestUser);
        return null;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/user/logout",method = RequestMethod.GET)
    @ResponseBody
    public AdminResult logout(@RequestBody User requestUser) {
        return null;
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> findAll(){
        return userService.findAllUser();
    }
}
