package com.zq.controller;


import com.zq.bean.User;
import com.zq.service.UserService;
import com.zq.service.imp.UserServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

//用户管理
@Controller
public class UserController {
    
    //用户更改密码
    @RequestMapping("/user/UpdatePasswd")
    public String doUpdatePasswd(String username,
                           String Oldpassword,
                           String Newpassword,
                           String lockState,
                           HttpServletRequest request){
        UserService userService = new UserServiceImp();
        //查询
        User auser =userService.find(username);
        if (auser==null){
            return "";
        }
        else{
            User user =userService.updataPasswd(username,Newpassword);
//      response
            User user1 = new User();
            user1.setName(username);
            user1.setPassword(Newpassword);
            request.getSession().setAttribute("users",user1);
            System.out.println(user+"密码修改成功，请重新登录");
            return "/login.jsp";
        }

    }
    //修改身份权限
    @RequestMapping("/user/UpdataStatus")
    public String doUpdataStatus(String username,
                                 String password,
                                 String NewStatus,
                                 HttpServletRequest request){
        UserService userService = new UserServiceImp();
        //查询
        User auser =userService.find(username);
        if (auser==null){
            return "";
        }
        else{
            User user =userService.updataStatus(username,NewStatus);
//      response
            User user1 = new User();
            user1.setName(username);
            user1.setStatus(NewStatus);
            request.getSession().setAttribute("users",user1);
            System.out.println(user+"身份权限修改成功");
            return "";
        }

    }

    //修改账户状况（封，解封）
    @RequestMapping("/user/UpdataLockState")
    public String doUpdataLockState(String username,
                                 String NewlockState,
                                 HttpServletRequest request){
        UserService userService = new UserServiceImp();
        //查询
        User auser =userService.find(username);
        if (auser==null){
            return "";
        }
        else{
            User user =userService.updataLockState(username,NewlockState);
//      response
            User user1 = new User();
            user1.setName(username);
            user1.setLockState(NewlockState);
            request.getSession().setAttribute("users",user1);
            System.out.println(user+"身份修改成功");
            return "";
        }

    }


}
