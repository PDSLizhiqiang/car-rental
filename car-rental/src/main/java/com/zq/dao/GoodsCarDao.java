package com.zq.dao;

import com.zq.bean.GoodsCar;

import java.util.List;

/**
 * @Author: YourName
 * @Date: Created in 2020/12/22 21:53
 * @Description: TODO
 * @Version: 1.0
 */
public interface GoodsCarDao {
    List<GoodsCar> findAllGoodsCar(String name);

    void removeBicycle(int id);
}
