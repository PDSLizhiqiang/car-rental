package com.zq.service;

import com.zq.bean.Dingdan;

import java.util.List;

/**
 * @Author: YourName
 * @Date: Created in 2020/12/22 15:16
 * @Description: TODO
 * @Version: 1.0
 */
public interface DingdanService {
    List<Dingdan> getAlldingdanByUsername(String username);
}
