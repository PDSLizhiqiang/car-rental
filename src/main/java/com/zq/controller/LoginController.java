package com.zq.controller;/**
 * @Author: YourName
 * @Date: Created in 2020/11/7 20:45
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.Admin;
import com.zq.bean.User;
import com.zq.service.AdminService;
import com.zq.service.UserService;
import com.zq.service.imp.AdminServiceImp;
import com.zq.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *@author LZQ
 *@date 2020/11/7 20:45
 */
@Controller
public class LoginController {
    @Autowired
    private UserServiceImp userService;
    @Autowired
    private AdminServiceImp adminServiceImp;

    @RequestMapping("/user/login")
    public String doUserLogin(String username,
                              String password,
                              HttpServletRequest request) throws LoginException {
        System.out.println("douserLogin 被访问了");
       System.out.println("ajax访问发送成功了");
       System.out.println(username);
       System.out.println(password);

        User user = userService.login(username, password);

        if(user==null) {
            request.getSession().setAttribute("mess","用户名密码错误");
            return "redirect:/login.jsp";
        }
        else {
            if("0".equals(user.getLockState())){
                request.getSession().setAttribute("mess","该账户被冻结");
                return "redirect:/login.jsp";
            }
//            response
           /* User user1 = new User();
            user1.setName(username);
            user1.setPassword(password)*/;
            request.getSession().setAttribute("users",user);
//            登录成功后还需设置用户信息
            return "/view/home.jsp";
        }
    }
    @RequestMapping("/admin/login")
    public String doAdminLogin(String adminname,
                              String password,
                              HttpServletRequest request) throws LoginException {

        Admin admin = adminServiceImp.login(adminname, password);
        System.out.println(admin);
        if(admin==null) {
            request.getSession().setAttribute("mess","用户名密码错误");
            return "redirect:/view/admin_login.jsp";
        }
        request.getSession().setAttribute("admin",admin);
        return "/view/admin_home.jsp";
    }

    public LoginController() {
        System.out.println("controller 创建了");
    }
}
