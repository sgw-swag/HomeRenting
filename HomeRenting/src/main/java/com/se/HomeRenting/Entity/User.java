package com.se.HomeRenting.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    private Integer userid;
    //用户编号

    @NotEmpty(message = "用户昵称不能为空")
    private String usernickname;

    private String userpassword;

    private String username;
    //用户真实姓名

    private String usernumber;
    //用户身份证号码

    private String usersex;
    //用户性别

    private String userphone;
    //用户电话号码

    private String useraddress;
    //用户地址
}
