package com.se.HomeRenting.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name = "houseinfo")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class House {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int houseid;
    //房屋编号

    private String username;
    //用户名称

    private String userphone;
    //用户电话

    private String houseaddress;
    //房屋地址

    private String rentnotice;
    //租赁注意事项

    private int houseelevator;
    //有无电梯

    private int rentstate;
    //出租状态

    private int sellstate;
    //出售状态

    private String housepicture;
    //房屋图片

    private double houserent;
    //租金

    private double houseprice;
    //售价

    private String housetype;
    //户型

    private String houseorientation;
    //房屋朝向

    private int houseage;
    //房龄

    private double housearea;
    //房屋面积

    private int housechecked;
    //审核状态

    private int housejoinrent;
    //是否合租

    private String houseproperty;
    //房屋产权
}
