package com.zq.dao;

import com.zq.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YourName
 * @Date: Created in 2020/11/7 20:00
 * @Description: TODO
 * @Version: 1.0
 */
public interface UserDao {
    User insertUser(User user);

    User selectUser(@Param("name")String name);
    User login(@Param("name") String userName, @Param("password") String passWord);
    User updataPassword(@Param("name") String UserName,@Param("password") String NewPassword);
    User updataStatus(@Param("name") String UserName,@Param("status") String NewStatus);
    User updataLockState(@Param("name") String UserName,@Param("lockState") String NewlockState);
    ArrayList<User> showAll();
    void deleteUser(@Param("name")String name);
}
