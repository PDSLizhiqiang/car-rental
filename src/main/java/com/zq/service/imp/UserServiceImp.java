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

import javax.security.auth.login.LoginException;
import java.util.HashMap;
import java.util.Map;

/**
 *@author LZQ
 *@date 2020/11/15 18:03
 */
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
    public  User updata(String UserName, String NewPassword){
        UserDao userDaoSq = SqlSessionUti.getSqlSession().getMapper(UserDao.class);
        User user0 = userDaoSq.selectUser(UserName);
        if(user0==null){

            return null;
        }
        User user1 = userDaoSq.updata(UserName,NewPassword);
        return user1;
    }


}
