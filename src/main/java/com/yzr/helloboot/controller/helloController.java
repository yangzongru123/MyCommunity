package com.yzr.helloboot.controller;

import com.yzr.helloboot.dao.UserMapper;
import com.yzr.helloboot.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class helloController {

    @Autowired
    private UserMapper uerDao;

    @RequestMapping("/")
    public String hello(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie:cookies) {
            if (cookie.getName().equals("token")){
                String token = cookie.getValue();
                User user = uerDao.findByToken(token);
                if (user != null){
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }
        return "hello";
   }

}
