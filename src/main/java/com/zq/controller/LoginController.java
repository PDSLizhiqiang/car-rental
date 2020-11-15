package com.zq.controller;/**
 * @Author: YourName
 * @Date: Created in 2020/11/7 20:45
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.User;
import com.zq.service.UserService;
import com.zq.service.imp.UserServiceImp;
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

    @RequestMapping("/user/login.do")
    @ResponseBody
    public String doUserLogin(String username,
                              String password,
                              HttpServletResponse response) throws LoginException {
      /*  System.out.println("douserLogin 被访问了");
        System.out.println("ajax访问发送成功了");
        System.out.println(username);
        System.out.println(password);*/

        UserService userService = new UserServiceImp();
        User user = userService.login(username, password);
        System.out.println(user);
        if(user==null) {
            return "密码错误";
        }
        else {
            if("0".equals(user.getLockState())){
                return "账户被冻结";
            }
//            response

//            登录成功后还需设置用户信息
            return "/view/home.jsp";
        }
    }


    public LoginController() {
        System.out.println("controller 创建了");
    }
}
