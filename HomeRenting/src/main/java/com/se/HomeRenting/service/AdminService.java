package com.se.HomeRenting.service;

import com.se.HomeRenting.dao.AdminDAO;
import com.se.HomeRenting.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ShenGW
 * @date 2021-09-05 22:36
 */
@Service
public class AdminService {

    @Autowired
    AdminDAO adminDAO;

    public boolean isExist(String adminName) {
        Admin admin = getByName(adminName);
        return null!=admin;
    }

    public Admin getByName(String adminName) {
        return adminDAO.findByAdminname(adminName);
    }

    public Admin get(String adminName, String adminPassword){
        return adminDAO.getByAdminnameAndAdminpassword(adminName, adminPassword);
    }

    public void add(Admin admin) {
        adminDAO.save(admin);
    }

    public List<Admin> findAllAdmin(){
        return adminDAO.findAll();
    }
}
