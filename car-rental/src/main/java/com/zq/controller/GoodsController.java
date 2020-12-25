package com.zq.controller;/**
 * @Author: YourName
 * @Date: Created in 2020/12/6 20:00
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.Bicycle;
import com.zq.bean.OwnBicycle;
import com.zq.bean.User;
import com.zq.service.imp.BicyclesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

    @RequestMapping("/addCar")
    public String addCar(Model model){

        model.addAttribute("path","addCar");


        return "/view/person.jsp";
    }

    @RequestMapping("/addInf")
    public String addInf(HttpServletRequest request,
                         @RequestParam("file")MultipartFile file) throws IOException {

        String filename = file.getOriginalFilename();

        if(!file.isEmpty()){
            String path1 = request.getSession().getServletContext().getRealPath("/");
            String path = path1.replace("\\target\\car-rental\\", "\\src\\main\\webapp\\images");
            File filepath =new File(path,filename);
            if(!filepath.getParentFile().exists()){
                filepath.getParentFile().mkdirs();
            }

            file.transferTo(new File(path+File.separator+filename));

            System.out.println("上传路径"+(path+File.separator+filename));

        }

        User users = (User)request.getSession().getAttribute("users");
        bicycleService.addbicycleInf(users.getName(),filename);
        return "/view/person.jsp";
    }

    @RequestMapping("/showOwnerCar")
    public String showOwnerCar(HttpServletRequest request,Model model){
        
        User users = (User)request.getSession().getAttribute("users");

        System.out.println("users------"+users);

        model.addAttribute("path","showOwnerCar");

        List<OwnBicycle> ownBicycles = bicycleService.getOwnBicycles(users.getName());
        System.out.println(ownBicycles);
        model.addAttribute("ownBicycles",ownBicycles);


        return "/view/person.jsp";

    }

}
