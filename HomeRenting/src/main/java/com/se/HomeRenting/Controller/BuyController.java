package com.se.HomeRenting.Controller;

import com.se.HomeRenting.Entity.Buy;
import com.se.HomeRenting.Service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "")
public class BuyController {
    @Autowired
    BuyService buyService;
}
