package com.se.HomeRenting.Dao;

import com.se.HomeRenting.Entity.House;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HouseDAO extends JpaRepository<House,Integer>{

    List<House> findByHousechecked(Integer housechecked);
}
