package com.zq.controller;/**
 * @Author: YourName
 * @Date: Created in 2020/12/6 20:00
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.Bicycle;
import com.zq.service.imp.BicyclesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *@author LZQ
 *@date 2020/12/6 20:00
 */
@Controller
public class GoodsController {

    @Autowired
    private BicyclesImp bicycleService;



    @RequestMapping("/getBicycleById")
    public String getGoods(int id,HttpServletRequest request, Model model){


        Bicycle bicycle= bicycleService.getBicycleById(id);

        request.getSession().setAttribute("bicycle",bicycle);

        return "/view/goodsdetails.jsp";
    }

    @RequestMapping("/rentBicycle")
    public String renCar(HttpServletRequest request,String username,String price){
        String submit = request.getParameter("submit");

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间

        Bicycle bicycle =(Bicycle)request.getSession().getAttribute("bicycle");

        if("租用".equals(submit)){
            double jiage = Double.parseDouble(price);
            bicycleService.rentBicycle(username, jiage);
            return "/view/home.jsp";
        }
        else if("加入购物车".equals(submit)){

            bicycleService.addBicycleIntoCar(username,bicycle.getPath(), date,bicycle.getPrice());


            return "/view/home.jsp";
        }
        else {
            return "/view/home.jsp";
        }

    }
}
