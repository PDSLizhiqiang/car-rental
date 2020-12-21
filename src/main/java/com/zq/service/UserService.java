package com.zq.service;

import com.zq.bean.User;
import org.apache.ibatis.annotations.Param;

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
    User updataPasswd(String UserName, String NewPassword);
    User updataStatus(String UserName,String Status);
    User updataLockState( String UserName,String NewlockState);
}
