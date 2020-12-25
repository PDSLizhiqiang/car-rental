package com.zq.service;

import com.zq.bean.Bicycle;
import com.zq.bean.OwnBicycle;

import java.util.List;

/**
 * @Author: YourName
 * @Date: Created in 2020/12/6 18:10
 * @Description: TODO
 * @Version: 1.0
 */
public interface BicycleService {
    List<Bicycle> getAllbicycles();
    Bicycle getBicycleById(int id);
    void  addBicycleIntoCar(String name,String path,String date,double price);

    void  rentBicycle(String username,double price);

    void  addbicycleInf(String owner,String path);

    List<OwnBicycle> getOwnBicycles(String name);
}
