package com.zq.controller;/**
 * @Author: YourName
 * @Date: Created in 2020/11/7 20:45
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.User;
import com.zq.service.UserService;
import com.zq.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;


/**
 *@author LZQ
 *@date 2020/11/7 20:45
 */
@Controller
public class LoginController {
    @Autowired
    private UserServiceImp userService;

    @RequestMapping("/user/login")
    public String doUserLogin(String username,
                              String password,
                              String lockState,
                              HttpServletRequest request) throws LoginException {

        User user = userService.login(username, password);
        if(user==null) {
            request.getSession().setAttribute("mess","用户名密码错误");
            return "/login.jsp";
        }
        else {
            if("0".equals(user.getLockState())){
                request.getSession().setAttribute("mess","该账户被冻结");
                return "/login.jsp";
            }

//            response
            User user1 = new User();
            user1.setName(username);

            user1.setPassword(password);
            request.getSession().setAttribute("users",user);

            user1.setPassword(password);
            request.getSession().setAttribute("users",user1);

            //管理员身份
            if (user1.getStatus().equals("admin")){
                return "/view/home.jsp";
            }else
                //用户身份

//            登录成功后还需设置用户信息
            return "/view/home.jsp";
        }
    }


    public LoginController() {
        System.out.println("controller 创建了");
    }
}
