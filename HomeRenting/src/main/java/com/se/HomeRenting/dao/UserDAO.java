package com.se.HomeRenting.dao;

import com.se.HomeRenting.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ShenGW
 * @date 2021-09-01 18:28
 */

//在 DAO 中只定义基础的增删改查操作
public interface UserDAO extends JpaRepository<User,Integer> {

    List<User> findAll();

<<<<<<< HEAD
    User findByUserid(int userid);

    User findByUserphone(String userphone);

    User getByUserphoneAndUserpassword(String userphone,String password);
=======
//    User findById(int id);

    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
>>>>>>> 12935a37aed6129e857172684a158a16da1fdfac
}
