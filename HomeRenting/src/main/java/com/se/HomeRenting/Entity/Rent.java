package com.se.HomeRenting.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name = "rentinfo")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Rent {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer userid;
    //用户编号

    private String username;
    //用户真实姓名

    private String usersex;
    //用户性别

    private String userphone;
    //用户电话号码

    private Integer houseid;
    //房屋编号

    private Integer joinrent;
    //是否合租

    private Integer rentstate;
    //租房状态

}
