package com.se.HomeRenting.service;

import com.se.HomeRenting.dao.HouseDAO;
import com.se.HomeRenting.entity.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ShenGW
 * @date 2021-09-08 10:29
 */

@Service
public class HouseService {

    @Autowired
    HouseDAO houseDAO;

    public House getByUserPhone(String userphone){
        return houseDAO.findByUserphone(userphone);
    }

    public List<House> getAllHouse(){
        return houseDAO.findAll();
    }
}
