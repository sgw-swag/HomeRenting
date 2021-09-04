package com.se.HomeRenting.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ShenGW
 * @date 2021-09-01 18:31
 */

//我们在 DAO 中只定义基础的增删改查操作，而具体的操作，需要由 Service 来完成
@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username) {
        return userDAO.findByUsername(username);
    }

    public User get(String username, String password){
        return userDAO.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDAO.save(user);
    }

    public List<User> findAllUser(){
        return userDAO.findAll();
    }
}
