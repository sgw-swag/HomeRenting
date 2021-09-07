package com.se.HomeRenting.Service;


import com.se.HomeRenting.Dao.AdminDAO;
import com.se.HomeRenting.Entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminDAO adminDAO;

    public List<Admin> findAll(){
        return adminDAO.findAll();
    }
}
