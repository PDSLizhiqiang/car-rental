package com.zq.dao;

import com.zq.bean.Bicycle;
import org.apache.ibatis.annotations.Param;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author: YourName
 * @Date: Created in 2020/11/22 17:25
 * @Description: TODO
 * @Version: 1.0
 */
public interface BicycleDao {

    ArrayList<Bicycle> selectBicycles();

    Bicycle getBicycleById(int id);

    void addBicycleIntoCar(@Param("name") String name, @Param("path") String path, @Param("date") String date,@Param("price") double price);

}
