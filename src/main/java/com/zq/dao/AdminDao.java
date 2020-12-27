package com.zq.dao;

import com.zq.bean.Admin;
import com.zq.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HYN
 * @create 2020/12/26
 **/
public  interface AdminDao {
    //增加管理员
    void insertAdmin(@Param("name") String name,@Param("password") String password);
    //找到某一个用户
    User selectUser(@Param("name")String name);
    //管理员登录
    Admin login(@Param("name") String AdminName, @Param("password") String passWord);
    //管理员修改密码
    void updataPassword(@Param("name") String AdminName,@Param("password") String NewPassword);
    //管理员修改用户状态
    void updataLockState(@Param("name") String UserName,@Param("lockState") String NewlockState);
    //展示所有用户
    ArrayList<User> showAll();
    //删除某一个用户
    void deleteUser(@Param("name")String name);

    List<Admin> allAdmin();
    Admin findAdmin(String name);
}
