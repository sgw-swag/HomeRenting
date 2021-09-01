package com.se.HomeRenting.information;

import com.se.HomeRenting.actions.Actions;
import com.se.HomeRenting.operations.GetInfo;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author ShenGW
 * @date 2021-09-01 10:28
 */

//管理员
@Component
@ToString
@Data
public class Administrator implements Actions, GetInfo {
    private int admin_number;
    private String admin_name;
    private char admin_sex;
    private String admin_password;


    @Override
    public void register() {
        System.out.println("管理员注册");
    }

    @Override
    public void login() {
        System.out.println("管理员登录");
    }

    @Override
    public void unsubscribe() {
        System.out.println("管理员注销账户");
    }

    @Override
    public Map<String, Object> getUserInfo(Object obj) {
        Map<String,Object> map = null;
        if (obj instanceof HouseOwner){
            System.out.println("获取房主的信息");
        }
        if (obj instanceof BasicUser){
            System.out.println("获取普通用户信息");
        }
        return map;
    }

    @Override
    public Map<String, Object> getHouseInfo() {
        Map<String,Object> map = null;
        return map;
    }

    public boolean check(Object obj){
        if (obj instanceof HouseOwner || obj instanceof BasicUser){
            System.out.println("审核用户");
            return true;
        }
        if (obj instanceof House){
            System.out.println("审核房屋信息");
            return true;
        }

        return false;
    }
}
