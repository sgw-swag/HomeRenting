package com.se.HomeRenting.Service;

import com.se.HomeRenting.Entity.House;
import com.se.HomeRenting.Dao.HouseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class HouseService {
    @Autowired
    HouseDAO houseDAO;

    public List<House> getByState(Integer state){
        return houseDAO.findByHousechecked(state);
    }

}
