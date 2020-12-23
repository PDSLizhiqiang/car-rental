package com.zq.dao;

import com.zq.bean.Dingdan;

import java.util.List;

/**
 * @Author: YourName
 * @Date: Created in 2020/12/22 15:21
 * @Description: TODO
 * @Version: 1.0
 */
public interface DingdanDao {
    List<Dingdan> getAlldingdanByUsername(String username);
}
