package com.zq.service.imp;/**
 * @Author: YourName
 * @Date: Created in 2020/11/15 18:03
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.Admin;
import com.zq.bean.User;
import com.zq.dao.UserDao;
import com.zq.service.UserService;
import com.zq.utils.SqlSessionUti;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *@author LZQ
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




}
