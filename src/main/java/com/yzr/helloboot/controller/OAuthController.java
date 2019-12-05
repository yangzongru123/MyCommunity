package com.yzr.helloboot.controller;

import com.yzr.helloboot.dao.UserMapper;
import com.yzr.helloboot.dto.AccessTokenDTO;
import com.yzr.helloboot.dto.GitHubUser;
import com.yzr.helloboot.provider.GitHubProvider;
import com.yzr.helloboot.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.UUID;

@Controller
public class OAuthController {
    @Autowired
    private GitHubProvider gitHubProvider;

    @Value("${github.client.id}")
    private String clientId;
    @Value("${github.client.secret}")
    private String clientSecret;
    @Value("${github.redirect.uri}")
    private String redirectUri;
    @Autowired
    private UserMapper userDao;

    @RequestMapping("/callback")
    public String callback(@RequestParam(name="code")String code, @RequestParam(name="state")String state,
                           HttpServletResponse response) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri(redirectUri);
        accessTokenDTO.setState(state);
        String accessToken = gitHubProvider.getAccesToken(accessTokenDTO);
        GitHubUser gitHubUser = gitHubProvider.getUser(accessToken);
        if(gitHubUser != null){
            User user = new User();
            user.setAccount(String.valueOf(gitHubUser.getId()));
            user.setName(gitHubUser.getName());
            String token = UUID.randomUUID().toString();
            user.setToken(token);
            user.setCreatTime(new Date());
            user.setModifiedTime(user.getCreatTime());
            userDao.insert(user);
            response.addCookie(new Cookie("token",token));
            return "redirect:/";
        }else{
            return "redirect:/";
        }
    }
}
