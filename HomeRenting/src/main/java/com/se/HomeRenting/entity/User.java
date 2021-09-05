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
<<<<<<< HEAD
@Table(name = "user")
=======
@Table(name = "users")
>>>>>>> 12935a37aed6129e857172684a158a16da1fdfac
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    @Column(name = "userid")
    private int userid;
    @Column(name = "userphone")
    private String userphone;
    @Id
    @Column(name = "userpassword")
    private String userpassword;
=======
    @Column(name = "id")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
>>>>>>> 12935a37aed6129e857172684a158a16da1fdfac
}
