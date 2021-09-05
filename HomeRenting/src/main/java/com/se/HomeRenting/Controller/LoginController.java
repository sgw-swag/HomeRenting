package com.se.HomeRenting.Controller;

import com.se.HomeRenting.Dao.UserDao;
import com.se.HomeRenting.Entity.User;
import com.se.HomeRenting.Result.result;
import com.se.HomeRenting.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

@RestController
@RequestMapping(path="/api/user")
public class LoginController {

    @Autowired
    UserService userService;

//    @PostMapping(value = "/login")
//    @ResponseBody
//    public result login(@RequestBody User requestUser) {
//
//    }

}


