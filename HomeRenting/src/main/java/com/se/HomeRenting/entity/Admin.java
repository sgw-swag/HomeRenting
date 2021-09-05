package com.se.HomeRenting.entity;

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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adminid")
    private int adminid;
    @Column(name = "adminname")
    private String adminname;
    @Column(name = "adminpassword")
    private String adminpassword;
}
