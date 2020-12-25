package com.zq.controller;/**
 * @Author: YourName
 * @Date: Created in 2020/12/22 21:45
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.service.imp.BicyclesImp;
import com.zq.service.imp.GoodsCarImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *@author LZQ
 *@date 2020/12/22 21:45
 */
@Controller
public class GoodsCar {

   @Autowired
    private GoodsCarImp goodsCarImp;

   @Autowired
   private BicyclesImp bicycleService;


    @RequestMapping("/lookGoodsCar")
    public String lookGoodsCar(String username, Model model){


        List<com.zq.bean.GoodsCar> allGoodsCar = goodsCarImp.findAllGoodsCar(username);

        model.addAttribute("allGoodsCar", allGoodsCar);
        model.addAttribute("path","gouwuche");
        return "/view/person.jsp";

    }


    @RequestMapping("/removeBicycle")
    public String removeGoods(String id){


        goodsCarImp.removeBicycle(Integer.parseInt(id));

        return "/view/person.jsp";
    }

    @RequestMapping("/rentBicyclefromCar")
    public String rentBicyclefromCar(String username,String price,String id){

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间

        double jiage = Double.parseDouble(price);

        bicycleService.rentBicycle(username, jiage);
        goodsCarImp.removeBicycle(Integer.parseInt(id));
        return "/view/person.jsp";
    }
}
