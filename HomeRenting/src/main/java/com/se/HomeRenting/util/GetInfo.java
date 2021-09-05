package com.se.HomeRenting.util;

import java.util.Map;

/**
 * @author ShenGW
 * @date 2021-09-01 10:46
 */
public interface GetInfo {

    //获取用户基本信息
    Map<String,Object> getUserInfo(Object obj);

    //获取房屋信息
    Map<String,Object> getHouseInfo();
}
