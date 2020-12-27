package com.zq.controller;/**
 * @Author: YourName
 * @Date: Created in 2020/12/21 17:50
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.Dingdan;
import com.zq.bean.User;
import com.zq.service.imp.DingdanServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *@author LZQ
 *@date 2020/12/21 17:50
 */

@Controller
public class DingdanController {

    @Autowired
    private DingdanServiceImp dingdanServiceImp;

    @RequestMapping("/selectDingdan")
    public String doSelectdingdan()
    {
        return "";
    }
    @RequestMapping("/addview")
    public String doAddView(String username,Model model){

        List<Dingdan> dingdanlist = dingdanServiceImp.getAlldingdanByUsername(username);
        model.addAttribute("path","dingdan");
        model.addAttribute("dingdanlist",dingdanlist);
        return "/view/person.jsp";
    }

    @RequestMapping("/deleteDingdan")
    public String deleteDingdan(String id){
        int id1 = Integer.parseInt(id);
        dingdanServiceImp.deleteDingdan(id1);
        return "/view/person.jsp";
    }

    @GetMapping(value = "/showinfo")
    public String findUserInfo(
            @RequestParam("name")
             String username,
            Model model,
            HttpServletRequest request){
        User user = new User();
        System.out.println(username);
        model.addAttribute("name",username);
        //根据username，从数据库获取user对象
        List<String> sexList = new ArrayList<String>();
        sexList.add("男");
        sexList.add("女");
        user.setSex("nan");
        model.addAttribute("sexList",sexList);
        model.addAttribute("user",user);
        model.addAttribute("path","showuserinfo");
        return "/view/person.jsp";
    }
}
