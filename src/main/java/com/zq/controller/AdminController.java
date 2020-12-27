package com.zq.controller;

import com.zq.bean.*;
import com.zq.service.imp.AdminServiceImp;
import com.zq.service.imp.BicyclesImp;
import com.zq.service.imp.DingdanServiceImp;
import com.zq.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author HYN
 * @create 2020/12/26
 **/
@Controller
public class AdminController {
    @Autowired
    private AdminServiceImp adminServiceImp;
    @Autowired
    private DingdanServiceImp dingdanServiceImp;
    @Autowired
    private BicyclesImp bicyclesImp;
    @Autowired
    private UserServiceImp userServiceImp;
    @Autowired
    @Qualifier("userValidator")
    private UserValidator userValidator;



    //删除用户
    //按钮 从request.getSession().getAttribute("username")获取需要删除的User
    @RequestMapping("/admin/DeleteUser")
    public String DeleteUser(String username,Model model, HttpServletRequest request){
       User auser= adminServiceImp.find(username);
        if (auser!=null){
            adminServiceImp.deleteUser(username);
            //返回一个成功界面
            return "/view/admin_person.jsp";
        }else {
            System.out.println("删除出错，用户不存在");
            //返回一个失败界面
            request.getSession().setAttribute("mess","删除出错");
            return "/view/admin_person.jsp";
        }

    }
    //查找用户
    //从HttpServletRequest得到要查找的用户名，将数据库查到的用户存入
    // request.getSession().setAttribute("find",finduser);
    @RequestMapping("/admin/FindUser")
    public String FindUser(String name, HttpServletRequest request){
        User finduser= adminServiceImp.find(name);
        //找到并存入一个finduser
        request.getSession().setAttribute("finduser",finduser);
        return "";
    }

    //修改账户状况（封，解封）
    //
    @RequestMapping("/admin/UpdataLockState")
    public String doUpdataLockState(String username,
                                   Model model){

        //查询
        User auser =adminServiceImp.find(username);
        String New;
        if (auser==null){
            return "/view/admin_person.jsp";
        }
        else{
        String  NewlockState= auser.getLockState();
        System.out.println(NewlockState);
        if(NewlockState.equals("0")){
            New="1";

        }else {
            New="0";
        }
        System.out.println(New);
         adminServiceImp.updataLockState(username,New);


            return "/view/admin_person.jsp";
        }

    }



    //展示所有用户
    @RequestMapping("/ShowAllUsers")
    public String ShowAllUsers(Model model){
               model.addAttribute("path","showalluser");
        List<User> userArrayList=adminServiceImp.showAll();
        model.addAttribute("userArrayList",userArrayList);
        return "/view/admin_person.jsp";
    }

    //展示所有订单
    @RequestMapping("/admin/ShowAllOrder")
    public String showAllOreder(Model model){
        List<Dingdan> alldingdan = dingdanServiceImp.getAll();
        model.addAttribute("alldingdan",alldingdan);
        model.addAttribute("path","showallorder");
        return "/view/admin_person.jsp";
    }
    //删除订单
    @RequestMapping("/admin/deleteDingdan")
    public String deleteDingdan(String id){
        int id1 = Integer.parseInt(id);
        dingdanServiceImp.deleteDingdan(id1);
        return "/view/admin_person.jsp";
    }


    //同意审核上传车辆，并将车辆放入商品数据库
    @RequestMapping("/admin/ShenHe")
    public String ShenHe(int id){
        int newstatus=1;
        OwnBicycle bicycle=bicyclesImp.getOwnBicycle(id);
        if(bicycle==null){
            return "/view/admin_person.jsp";
        }
        bicyclesImp.upbicycleinf(id);
        String name=bicycle.getOwner();
        String path=bicycle.getPath();
        String c =bicycle.getOwner();
        double price =100;
        bicyclesImp.addintoCar(name,path,c,price);
        bicyclesImp.del(id);
        return "/view/admin_person.jsp";
    }

    //展示上传车辆信息
    @RequestMapping("/admin/showinfo")
    public String showinfo(HttpServletRequest request,Model model){
        model.addAttribute("path","shenhe");
        List<OwnBicycle> bicycles = bicyclesImp.Allinfo();
        model.addAttribute("infoBicycles",bicycles);
        return "/view/admin_person.jsp";

    }

    //审核不符合标准
    @RequestMapping("/admin/QxShenHe")
    public  String QxShenHe(int id,Model model){
        bicyclesImp.del(id);
        return "/view/admin_person.jsp";
    }
    //首页展示商品
    @RequestMapping("/admin/getBicycleById")
    public String getGoods(int id,HttpServletRequest request, Model model){
        Bicycle bicycle= bicyclesImp.getBicycleById(id);
        request.getSession().setAttribute("bicycle",bicycle);
        return "/view/admin_goodsdetails.jsp";
    }

    //详细展示某个车辆，可查看或删除
    @RequestMapping("/admin/showcar")
    public String rentBicycle(HttpServletRequest request){
        String submit = request.getParameter("submit");
        Bicycle bicycle =(Bicycle)request.getSession().getAttribute("bicycle");
        if("删除".equals(submit)){
            bicyclesImp.delcar(bicycle.getId());
            return "/view/admin_home.jsp";
        }
        else if ("返回".equals(submit)){
            return "/view/admin_home.jsp";
        }
        else {
            return "/view/admin_home.jsp";
        }

    }
    //展示管理员的信息
    @RequestMapping("admin_all")
    public String showme(Model model,String name){
      Admin admin =adminServiceImp.findAdmin(name);
        model.addAttribute("allAdmin",admin);
        model.addAttribute("path","admin");
        return "/view/admin_person.jsp";
    }

    //注册管理员
    @RequestMapping("/admin/addadmin")
    public String addAdmin(Model model,HttpServletRequest request){
        model.addAttribute("path","zhuce");
      String name=request.getParameter("name");
      System.out.println(name);
        String password= request.getParameter("passwd");
        adminServiceImp.insertAdmin(name,password);
        return "/view/admin_person.jsp";
    }
    //修改密码
    @RequestMapping("/admin/xiugai")
    public String xiugaiAdmin(Model model,HttpServletRequest request){
       String name= request.getParameter("name");
        String password= request.getParameter("newpasswd");
        adminServiceImp.updataPasswd(name,password);
        return "redirect:/login.jsp";
    }

    //注册用户
    @RequestMapping("/Aadduser")
    public String Aadduser(Model model){
        User user = new User();
        model.addAttribute("user",user);
        System.out.println("xxx");
        return "/adduser.jsp";
    }
    @RequestMapping("/adduser")
    public String adduser(Model mv,@ModelAttribute User user,Errors errors){
        mv.addAttribute("user", user);
        userValidator.validate(user,errors);
        String name=  user.getName();
        String passwd= user.getPassword();
        String lockState="0";
        String phone=user.getPhone();
       String address= user.getAddress();
        if (errors.hasErrors()){
            return "/adduser.jsp";
        }else{
            userServiceImp.adduser(name,passwd,lockState,phone,address);
            return "redirect:/login.jsp";
        }


    }
}
