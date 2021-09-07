package com.se.HomeRenting.Dao;

import com.se.HomeRenting.Entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentDAO extends JpaRepository<Rent,Integer>{

    Rent findByHouseid(Integer houseid);

}
