package com.se.HomeRenting.Controller;

import com.se.HomeRenting.Entity.User;
import com.se.HomeRenting.Result.result;
import com.se.HomeRenting.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.shiro.*;

import java.util.List;


@RestController
@RequestMapping(path="/api/user")
public class UserController {
    @Autowired
    UserService userService;

//    @GetMapping("login")
//    public result Login(@RequestBody User requestUser){
//        String userphone = requestUser.getUserphone();
//
//    }

    @GetMapping(value = "/resources")
    public List<User> listUsers(){
        return userService.findAll();
    }

    @GetMapping("/resources/{uid}")
    public User getUser(@PathVariable("uid") int uid){
        return userService.getByUserid(uid);
    }
}
