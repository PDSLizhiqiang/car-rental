package com.zq.service;

import com.zq.bean.Bicycle;
import com.zq.bean.GoodsCar;

import java.util.List;

/**
 * @Author: YourName
 * @Date: Created in 2020/12/22 21:50
 * @Description: TODO
 * @Version: 1.0
 */
public interface GoodsCarService {

    List<GoodsCar> findAllGoodsCar(String username);

    void removeBicycle(int id);
}
