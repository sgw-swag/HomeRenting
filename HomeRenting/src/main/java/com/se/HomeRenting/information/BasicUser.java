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
 * @date 2021-09-01 10:23
 */

//普通用户
@EqualsAndHashCode(callSuper = true)
@Component
@ToString
@Data
public class BasicUser extends User implements Actions, GetInfo {
    private int user_number;
    private String user_falseName;
    private String user_password;
    private String user_trueName;
    private char user_sex;
    private String user_phone;
    private String user_id;


    @Override
    public void register() {
        System.out.println("用户注册");
    }

    @Override
    public void login() {
        System.out.println("用户登录");
    }

    @Override
    public void unsubscribe() {
        System.out.println("用户注销账户");
    }

    @Override
    public Map<String, Object> getUserInfo(Object obj) {
        Map<String,Object> map = null;
        if (obj instanceof HouseOwner){
            System.out.println("获取房主信息");
        }
        if (obj instanceof BasicUser){
            System.out.println("获取用户自己的信息");
        }
        return map;
    }

    @Override
    public Map<String, Object> getHouseInfo() {
        Map<String,Object> map = null;
        return map;
    }

    public void modifyUserInfo(){
        System.out.println("修改个人信息");
    }

    public void rent(){
        System.out.println("租房");
    }
    public void buy(){
        System.out.println("买房");
    }
}
