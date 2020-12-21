package com.zq.controller;/**
 * @Author: YourName
 * @Date: Created in 2020/12/6 20:00
 * @Description: TODO
 * @Version: 1.0
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@author LZQ
 *@date 2020/12/6 20:00
 */
@Controller
public class GoodsController {
    @RequestMapping("/getgood")
    public String getGoods(){


        return "/view/dianche.jsp";
    }

}
