package com.se.HomeRenting.example;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ShenGW
 * @date 2021-09-01 18:28
 */

//在 DAO 中只定义基础的增删改查操作
public interface UserDAO extends JpaRepository<User,Integer> {

    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
