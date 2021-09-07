package com.se.HomeRenting.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name = "userbuy")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Forbuy {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer userid;
    //用户编码

    private Integer houseid;
    //房屋编码

    private String houseproperty;
    //房屋产权

    private Double houseprice;
    //房价

    private Integer houseelevator;
    //有无电梯
}
