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
    @RequestMapping("/user/UpdatePw")
    public String doUpdatePw(String username,
                           String Newpassword,
                           String lockState,
                           HttpServletRequest request){
        UserService userService = new UserServiceImp();
        User user =userService.updata(username,Newpassword);
        System.out.println(user+"请重新登录");

//            response
        User user1 = new User();
        user1.setName(username);
        user1.setPassword(Newpassword);
        request.getSession().setAttribute("users",user1);
        return "/login.jsp";
    }

    @RequestMapping("/user/UpdataStatus")
    public String doUpdataStatus(){

        return "";
    }
}
