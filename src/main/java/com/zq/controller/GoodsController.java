package com.zq.controller;/**
 * @Author: YourName
 * @Date: Created in 2020/12/6 20:00
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.Bicycle;
import com.zq.service.BicycleService;
import com.zq.service.RentBicycleService;
import com.zq.service.imp.BicyclesImp;
import com.zq.service.imp.RentBicycleImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 *@author LZQ
 *@date 2020/12/6 20:00
 */
@Controller
public class GoodsController {
    @RequestMapping("/getBicycleById")
    public String getGoods(int id, Model model){
        BicycleService bicycleService = new BicyclesImp();
        Bicycle bicycle= bicycleService.getBicycleById(id);
        model.addAttribute("bicycle",bicycle);

        return "/view/goodsdetails.jsp";
    }

    @RequestMapping("/rentBicycle")
    public String renCar(String username,String price){

        double jiage = Double.parseDouble(price);
        RentBicycleImp rentBicycleImp = new RentBicycleImp();
        rentBicycleImp.rentBicycle(username, jiage);
        return "/view/home.jsp";
    }
}
