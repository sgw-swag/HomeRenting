package com.se.HomeRenting.information;

import com.se.HomeRenting.actions.Actions;
import com.se.HomeRenting.example.User;
import com.se.HomeRenting.operations.GetInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author ShenGW
 * @date 2021-09-01 10:16
 */

//房主
@EqualsAndHashCode(callSuper = true)
@Component
@ToString
@Data
public class HouseOwner extends User implements Actions, GetInfo {
    private int owner_number;
    private String owner_falseName;
    private String owner_password;
    private String owner_trueName;
    private char owner_sex;
    private String owner_phone;
    private String owner_id;
    private String owner_address;

    public void register(){
        System.out.println("房主注册");
    }

    public void login(){
        System.out.println("房主登录");
    }

    public void unsubscribe(){
        System.out.println("房主注销账号");
    }

    @Override
    public Map<String, Object> getUserInfo(Object obj) {
        Map<String,Object> map = null;
        if (obj instanceof HouseOwner){
            System.out.println("获取房主自己的信息");
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

    public void pushHouseInfo(){
        System.out.println("发布房屋信息");
    }

    public void modifyUserInfo(){
        System.out.println("修改个人信息");
    }

    public void modifyHouseInfo(){
        System.out.println("修改房屋信息");
    }
}
