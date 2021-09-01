package com.se.HomeRenting.information;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author ShenGW
 * @date 2021-09-01 10:33
 */
//房屋
@Component
@ToString
@Data
public class House {
    private int house_number;
    private String owner_trueName;
    private String owner_phone;
    private String house_address;
    private double house_price;
    private double house_rent;
    private String house_type;
    private String house_orientation;
    private boolean house_elevator;
    private int house_age;
    private double house_area;
    private String house_rentNotice;
    private String house_state;
    private String house_property;
}
