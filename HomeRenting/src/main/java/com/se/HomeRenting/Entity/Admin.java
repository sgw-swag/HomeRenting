package com.se.HomeRenting.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name = "admin")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Admin {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer adminid;
    //管理员编号

    private String adminnickname;
    //管理员昵称

    private String adminname;
    //管理员姓名

    private String adminpassword;
    //管理员密码

    private String adminnumber;
    //管理员身份证号码

    private String adminsex;
    //管理员性别

    private String adminphone;
    //管理员电话号码
}
