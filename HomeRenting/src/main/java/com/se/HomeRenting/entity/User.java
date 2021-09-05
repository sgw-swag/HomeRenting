package com.se.HomeRenting.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    @Column(name = "userphone")
    private String userphone;
    @Id
    @Column(name = "userpassword")
    private String userpassword;
}
