package com.zq.controller;/**
 * @Author: YourName
 * @Date: Created in 2020/12/21 17:50
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.Dingdan;
import com.zq.service.imp.DingdanServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
