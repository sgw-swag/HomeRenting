package com.se.HomeRenting.Controller;


import com.se.HomeRenting.Entity.Admin;
import com.se.HomeRenting.Service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping(path="/api/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping(value = "/resources")
    public List<Admin> listAdmins(){
        return adminService.findAll();
    }
}
