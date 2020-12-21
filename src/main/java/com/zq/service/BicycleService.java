package com.zq.service;

import com.zq.bean.Bicycle;

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
}
