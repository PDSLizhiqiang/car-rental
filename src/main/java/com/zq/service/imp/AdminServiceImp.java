package com.zq.service.imp;

import com.zq.bean.Admin;
import com.zq.bean.User;
import com.zq.dao.AdminDao;
import com.zq.dao.UserDao;
import com.zq.service.AdminService;
import com.zq.utils.SqlSessionUti;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HYN
 * @create 2020/12/26
 **/
@Service
public class AdminServiceImp implements AdminService {
    //管理员登录
    @Override
    public Admin login(String loginName, String loginPwd) throws LoginException{

        AdminDao adminDao = SqlSessionUti.getSqlSession().getMapper(AdminDao.class);

        Admin admin = adminDao.login(loginName,loginPwd);

        if(admin==null){
            return null;
        }

        return admin;
    }

    //管理员查询某一个用户
    @Override
    public User find(String name) {
        AdminDao userDaoSq = SqlSessionUti.getSqlSession().getMapper(AdminDao.class);
        User user = userDaoSq.selectUser(name);
        return user;
    }


    //管理员修改密码
    @Override
    public  void updataPasswd(String UserName, String NewPassword){
        AdminDao userDaoSq = SqlSessionUti.getSqlSession().getMapper(AdminDao.class);
      userDaoSq.updataPassword(UserName,NewPassword);

    }


    //管理员封，解封用户
    @Override
    public void updataLockState(String UserName, String NewlockState) {
        AdminDao userDaoSq = SqlSessionUti.getSqlSession().getMapper(AdminDao.class);
        userDaoSq.updataLockState(UserName,NewlockState);

    }

    //管理员查看所有用户
    @Override
    public ArrayList<User> showAll() {
        AdminDao userDao = SqlSessionUti.getSqlSession().getMapper(AdminDao.class);
        ArrayList<User> users =userDao.showAll();
        return users;
    }

    //管理员删除用户
    @Override
    public void deleteUser(String name) {
        AdminDao userDao = SqlSessionUti.getSqlSession().getMapper(AdminDao.class);
        userDao.deleteUser(name);
    }

    //增加管理员
    //管理员不能同名
    @Override
    public void insertAdmin(String name,String password) {
        AdminDao adminDao = SqlSessionUti.getSqlSession().getMapper(AdminDao.class);
        adminDao.insertAdmin(name,password);

    }

    @Override
    public List<Admin> allAdmin(){
        AdminDao userDaoSq = SqlSessionUti.getSqlSession().getMapper(AdminDao.class);
        List<Admin> admins = userDaoSq.allAdmin();
        return admins;
    }

    @Override
    public Admin findAdmin(String name){
        AdminDao userDaoSq = SqlSessionUti.getSqlSession().getMapper(AdminDao.class);
        Admin admin = userDaoSq.findAdmin(name);
        return admin;
    }


}
