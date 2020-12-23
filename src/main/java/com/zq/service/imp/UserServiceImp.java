package com.zq.service.imp;/**
 * @Author: YourName
 * @Date: Created in 2020/11/15 18:03
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.User;
import com.zq.dao.UserDao;
import com.zq.service.UserService;
import com.zq.utils.SqlSessionUti;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *@author hyn LZQ
 *@date 2020/11/15 18:03
 */
@Service
public class UserServiceImp implements UserService {
    @Override
    public User login(String loginName, String loginPwd) throws LoginException {

        UserDao userDaoSq = SqlSessionUti.getSqlSession().getMapper(UserDao.class);

        User user = userDaoSq.login(loginName,loginPwd);

        if(user==null){
            return null;
        }
       /* //判断锁定状态
        String lockState = user.getLockState();
        if("0".equals(lockState)){

            throw new LoginException("账号已锁定");
        }*/
        return user;
    }

    @Override
    public User find(String name) {
        UserDao userDaoSq = SqlSessionUti.getSqlSession().getMapper(UserDao.class);
        User user = userDaoSq.selectUser(name);
        return user;
    }


    @Override
    public  User updataPasswd(String UserName, String NewPassword){
        UserDao userDaoSq = SqlSessionUti.getSqlSession().getMapper(UserDao.class);
        User user = userDaoSq.updataPassword(UserName,NewPassword);
        return user;
    }

    @Override
    public User updataStatus(String UserName,String Status) {
        UserDao userDaoSq = SqlSessionUti.getSqlSession().getMapper(UserDao.class);
        User user = userDaoSq.updataStatus(UserName,Status);
        return user;
    }

    @Override
    public User updataLockState(String UserName, String NewlockState) {
        UserDao userDaoSq = SqlSessionUti.getSqlSession().getMapper(UserDao.class);
        User user = userDaoSq.updataLockState(UserName,NewlockState);
        return user;
    }

    @Override
    public ArrayList<User> showAll() {
        UserDao userDao = SqlSessionUti.getSqlSession().getMapper(UserDao.class);
        ArrayList<User> users =userDao.showAll();
        return users;
    }

    @Override
    public void deleteUser(String name) {
        UserDao userDao = SqlSessionUti.getSqlSession().getMapper(UserDao.class);
        userDao.deleteUser(name);
    }

    @Override
    public User addUser() {
        return null;
    }


}
