package com.se.HomeRenting.Controller;

import com.se.HomeRenting.Entity.House;
import com.se.HomeRenting.Service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/house")
public class HouseController {
    @Autowired
    HouseService houseService;

    @GetMapping("/resources/{state}")
    public List<House> listHouses(@PathVariable("state") int state){
        return houseService.getByState(state);
    }
}
