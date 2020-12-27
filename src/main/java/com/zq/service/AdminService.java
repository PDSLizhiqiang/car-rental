package com.zq.service;

import com.zq.bean.Admin;
import com.zq.bean.User;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HYN
 * @create 2020/12/26
 **/
public interface AdminService {
    Admin login(String loginName, String loginPwd) throws LoginException;
    User find(String name);
    void updataPasswd(String UserName, String NewPassword);
    void updataLockState( String UserName,String NewlockState);
    ArrayList<User> showAll();
    void deleteUser(String name);
    void insertAdmin(String name,String password);
    List<Admin> allAdmin();
    Admin findAdmin(String name);
}
