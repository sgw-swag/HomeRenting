package com.se.HomeRenting.controller;

import com.se.HomeRenting.util.Result;
import com.se.HomeRenting.entity.User;
import com.se.HomeRenting.service.UserService;
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
public class LoginController {
    @Autowired
    UserService userService;
//    @Autowired
//    UserDAO userDAO;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username, requestUser.getPassword());
        if (user != null) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> findAll(){
//        List<User> list = new ArrayList<>();
//        list = userDAO.findAll();
//        System.out.println(list);
//        return list;
        return userService.findAllUser();
    }
}
