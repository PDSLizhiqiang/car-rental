package com.zq.dao;

import com.zq.bean.User;

/**
 * @Author: YourName
 * @Date: Created in 2020/11/7 20:00
 * @Description: TODO
 * @Version: 1.0
 */
public interface UserDao {
    User insertUser(User user);
    User selectUser(String name);
}
