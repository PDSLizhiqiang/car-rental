package com.zq.controller;/**
 * @Author: YourName
 * @Date: Created in 2020/11/7 20:45
 * @Description: TODO
 * @Version: 1.0
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@author LZQ
 *@date 2020/11/7 20:45
 */
@Controller
public class LoginController {

    @RequestMapping("/user/login.do")
    public String doUserLogin(){

        System.out.println("douserLogin 被访问了");
        return "";
    }

    public LoginController() {
        System.out.println("controller 创建了");
    }
}
