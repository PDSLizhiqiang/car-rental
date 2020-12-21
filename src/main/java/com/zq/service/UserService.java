package com.zq.service;

import com.zq.bean.User;

import javax.security.auth.login.LoginException;

/**
 * @Author: YourName
 * @Date: Created in 2020/11/15 18:03
 * @Description: TODO
 * @Version: 1.0
 */
public interface UserService {
    User login(String loginAct, String loginPwd) throws LoginException;
    User find(String name);
    User updata(String UserName, String NewPassword);
}
