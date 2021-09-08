package com.se.HomeRenting.service;

import com.se.HomeRenting.dao.UserDAO;
import com.se.HomeRenting.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ShenGW
 * @date 2021-09-06 15:20
 */

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public boolean isExist(String userphone) {
        User user = getByPhone(userphone);
        return null!=user;
    }

    public User getByPhone(String userphone) {
        return userDAO.findByUserphone(userphone);
    }

    public User getByUserNickname(String usernickname){
        return userDAO.findByUsernickname(usernickname);
    }

    public User get(String userphone, String userpassword) {
        return userDAO.getByUserphoneAndUserpassword(userphone, userpassword);
    }

    public void add(User user) {
        userDAO.save(user);
    }

    public List<User> findAllUser(){
        return userDAO.findAll();
    }
}
