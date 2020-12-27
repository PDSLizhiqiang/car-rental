package cn.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.team.factory.SqlExecute;
import cn.team.pojos.User;

@Controller
public class UserLoginController {
	@GetMapping("/loginForm")
	public String goLoginForm() {
		return "login";
	}
	@PostMapping("/login")
	public String Login(
			@RequestParam(value="username", required=false)  String username,
			@RequestParam(value="password",required=false) String password,
			@RequestParam(value="status",required=false)  String status,
			Model model) {
		System.out.println("username："+username);
		System.out.println("password："+password);
		System.out.println("status："+status);
		User user = new User();
		if(username!=null && !username.equals("") &&password!=null && !password.equals("")) {
			if(status.equals("user") ||status.equals("admin")) {
				user.setUsername(username);
				user.setPassword(password);
				user.setStatus(status);
				SqlExecute sqlExecute = new SqlExecute();
				if(sqlExecute.isExist(user)) {
					model.addAttribute("user", user);
					return "success";
				}else {
					System.out.println("账号不正确");
					return "login";
				}
			}else {
				System.out.println("身份未选择");
				return "login";
			}
		}else {
			System.out.println("用户名或者密码未选择");
			return "login";
		}
		
	}
}
