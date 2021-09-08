package com.se.HomeRenting.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author ShenGW
 * @date 2021-09-05 22:18
 */
@Entity
@Table(name = "admin")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adminid")
    private int adminid;//管理员编号
    @Column(name = "adminname")
    private String adminname;//姓名
    @Column(name = "adminsex")
    private char adminsex;//性别
    @Column(name = "adminnickname")
    private String adminnickname;//昵称
    @Column(name = "adminpassword")
    private String adminpassword;//密码
    @Column(name = "adminphone")
    private String adminphone;//电话
    @Column(name = "adminnumber")
    private String adminnumber;//身份证号
}
