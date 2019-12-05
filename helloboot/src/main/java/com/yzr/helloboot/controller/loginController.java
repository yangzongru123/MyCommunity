package com.yzr.helloboot.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yzr.helloboot.dto.User;
import com.yzr.helloboot.service.ILoginService;
import com.yzr.helloboot.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/login")
public class loginController {
	
	@Autowired
	private ILoginService loginService;
	
	@RequestMapping("/dengru")
	public String dengru(String userName ,String loginPwd,HttpServletRequest request,HttpServletResponse response)throws Exception {
		if (userName==null) {
			 return "index";
		}
		 User user=null;
		 try {
			 user=loginService.selectByUserName(userName);
			 //验证用户
			 if(user==null) {
				 request.setAttribute("msg","账号不存在，请重新输入");
				 return "index";
			 }
			 //验证密码是否正确
			 if(!MD5Util.getMD5(loginPwd).equals(user.getLoginPwd())) {
				 request.setAttribute("msg", "密码错误，请重新输入");
				 return "index";
			 }

			 //Cookie的setPath()方法，指定的是可访问该Cookie的目录！默认只有同一个Web服务器上同一个路径下设置了该cookie的网页读取！
			 //如果你想让这个cookie在多个页面中共享，那么需要使用Cookie的setPath()方法设置path
			 //cookie.setPath("/")，在Tomcat的webapps目录下的所有目录中共享这个cookie。
			 //cookie的路径指的是可以访问该cookie的顶层目录，该路径的子路径也可以访问该cookie。
			 String remember=request.getParameter("remember");
			 if(remember!=null&&remember.equals("1")) {
				 Cookie cookie=new Cookie("cookie-user",userName+"-"+loginPwd);
				 cookie.setPath("/");
				 cookie.setMaxAge(60*60*24);
				 response.addCookie(cookie);
				 
			 }else {
				 Cookie cookie=new Cookie("cookie-user",userName);
				 cookie.setMaxAge(60*60*24);
				 response.addCookie(cookie);
			 }
			 //将用户放入session
			 request.getSession().setAttribute("user", user);
			 return "mainFrm";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		 
	}
	
	@RequestMapping("/index")
	@ResponseBody
	public Map<String,Object> findPage(HttpServletRequest request){
		Map<String,Object> maps=new HashMap<String,Object>();
		Cookie[] cookies=request.getCookies();
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("cookie-user")) {
				String[] values=cookie.getValue().split("-");			
					maps.put("userName",values[0]);
					maps.put("loginPwd",values[1]);
			}
		}
		return maps;		
	}
	
	
	
	
}
