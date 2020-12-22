package com.zq.controller;

import com.zq.bean.User;
import com.zq.service.UserService;
import com.zq.service.imp.UserServiceImp;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

//用户管理
@Controller
public class UserController {

    //展示所有用户，用于用户管理的展示界面
    //超链接
    @RequestMapping("/user/list")
    public ModelAndView ShowAllUser( ModelAndView model){
        UserService userService = new UserServiceImp();
        //得到用户集合
        ArrayList<User> allusers = userService.showAll();
        model.addObject("AllUsers",allusers);
        //返回界面
        model.setViewName("");
        return model;
    }

    //用户更改密码
    //超链接
    @RequestMapping("/user/UpdatePasswd")
    public String doUpdatePasswd(String username,
                           String Oldpassword,
                           String Newpassword,
                           HttpServletRequest request) throws LoginException {
        UserService userService = new UserServiceImp();
        //查询
        User auser =userService.login(username,Oldpassword);
        if (auser==null){
            //返回一个失败界面
            System.out.println("旧密码输入错误");
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
    //超链接
    @RequestMapping("/user/UpdataStatus")
    public String doUpdataStatus(String username,
                                 String password,
                                 String NewStatus,
                                 HttpServletRequest request) throws LoginException {
        UserService userService = new UserServiceImp();
        //查询
        User auser =userService.login(username,password);
        if (auser==null){
            //返回一个失败界面
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
            //返回一个成功界面

            return "";
        }

    }

    //删除用户
    //按钮
    @RequestMapping("/user/DeleteUser")
    public String DeleteUser(String username,Model model){
        UserService userService = new UserServiceImp();
        User auser = userService.find(username);
        model.getAttribute("username");

        if (auser!=null){
            userService.deleteUser(username);
            //返回一个成功界面
            return "";
        }else {
            System.out.println("删除出错，用户不存在");
            //返回一个失败界面
            return "";
        }

    }
    //查找用户
    @RequestMapping("/user/FindUser")
    public String FindUser(String name, Model model, HttpServletRequest request){
        UserService userService = new UserServiceImp();
        User finduser= userService.find(name);
       //找到并返回一个user
       request.getSession().setAttribute("find",finduser);
        return "";
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
