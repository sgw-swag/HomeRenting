package com.se.HomeRenting.Dao;

import com.se.HomeRenting.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

    User getByUsernicknameAndUserpassword(String usernickname,String userpassword);

    User findByUserid(Integer userid);
}
