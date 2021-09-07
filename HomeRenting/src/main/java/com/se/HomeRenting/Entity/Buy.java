package com.se.HomeRenting.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name = "buyinfo")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Buy {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer userid;
    //用户编码

    private String username;
    //用户名称

    private String userphone;
    //用户电话

    private String usersex;
    //用户性别

    private Integer houseid;
    //房屋编号

    private Integer buystate;
    //出售状态

}
