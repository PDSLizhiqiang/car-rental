package com.zq.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @Author: YourName
 * @Date: Created in 2020/12/21 17:26
 * @Description: TODO
 * @Version: 1.0
 */
public interface RentBicycle {

    void rentBicycle(@Param("username") String username, @Param("price") double price);
}
