package com.se.HomeRenting.Service;

import com.se.HomeRenting.Entity.User;
import com.se.HomeRenting.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDAO;


    public List<User> findAll(){
        return userDAO.findAll();
    }

    public User getByUserid(Integer userid){
        return userDAO.findByUserid(userid);
    }

    public User get(String usernickname, String userpassword){
        return userDAO.getByUsernicknameAndUserpassword(usernickname, userpassword);
    }

    public void add(User user) {
        userDAO.save(user);
    }
}


