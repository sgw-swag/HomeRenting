package com.se.HomeRenting.dao;

import com.se.HomeRenting.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ShenGW
 * @date 2021-09-08 10:26
 */
public interface HouseDAO extends JpaRepository<House,Integer> {

    House findByUserphone(String userphone);

    List<House> findAll();
}
