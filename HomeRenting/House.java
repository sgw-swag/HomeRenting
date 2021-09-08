package com.se.HomeRenting.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author ShenGW
 * @date 2021-09-08 10:08
 */
@Entity
@Table(name = "houseinfo")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "houseid")
    private int houseid;//房屋编号
    @Column(name = "userphone")
    private String userphone;//房主电话
    @Column(name = "username")
    private String username;//房主姓名
    @Column(name = "houseaddress")
    private String houseaddress;//房屋地址
    @Column(name = "rentnotice")
    private String rentnotice;//租房须知
    @Column(name = "houseelevator")
    private boolean houseelevator;//是否有电梯
    @Column(name = "rentstate")
    private boolean rentstate;//出租状态
    @Column(name = "sellstate")
    private boolean sellstate;//出售状态
    @Column(name = "housepicture")
    private String housepicture;//房屋照片
    @Column(name = "houserent")
    private double houserent;//租金/月
    @Column(name = "houseprice")
    private double houseprice;//房价
    @Column(name = "housetype")
    private String housetype;//户型
    @Column(name = "houseorientation")
    private String houseorientation;//房屋朝向
    @Column(name = "houseage")
    private int houseage;//房龄
    @Column(name = "housearea")
    private double housearea;//面积
    @Column(name = "housechecked")
    private boolean housechecked;//是否已通过审核
    @Column(name = "housejoinrent")
    private boolean housejoinrent;//是否可以合租
    @Column(name = "houseproperty")
    private String houseproperty;//房屋产权

}
