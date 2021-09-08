package com.se.HomeRenting.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

/**
 * @author ShenGW
 * @date 2021-09-01 18:17
 */
@Entity
@Table(name = "user")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private int userid;
    @Column(name = "username")
    private String username;//管理员编号
    @Column(name = "userphone")
    private String userphone;//姓名
    @Column(name = "usersex")
    private char usersex;//性别
    @Column(name = "usernickname")
    private String usernickname;//昵称
    @Column(name = "useraddress")
    private String useraddress;//管理员住址
    @Column(name = "userpassword")
    private String userpassword;//密码
    @Column(name = "usernumber")
    private String usernumber;//身份证号
}
