package com.se.HomeRenting.dao;

import com.se.HomeRenting.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ShenGW
 * @date 2021-09-05 22:24
 */
public interface AdminDAO extends JpaRepository<Admin,Integer> {

    List<Admin> findAll();

    Admin findByAdminid(int adminid);

    Admin findByAdminname(String adminname);

    Admin findByAdminphone(String adminphone);

    Admin getByAdminphoneAndAdminpassword(String adminname,String adminpassword);
}
