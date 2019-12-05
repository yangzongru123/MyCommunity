package com.yzr.helloboot.controller;

import com.yzr.helloboot.dto.AccessTokenDTO;
import com.yzr.helloboot.dto.GitHubUser;
import com.yzr.helloboot.provider.GitHubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/callback")
    public String callback(@RequestParam(name="code")String code, @RequestParam(name="state")String state, HttpServletRequest request) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri(redirectUri);
        accessTokenDTO.setState(state);
        String accessToken = gitHubProvider.getAccesToken(accessTokenDTO);
        GitHubUser user = gitHubProvider.getUser(accessToken);
        if(user != null){
            request.getSession().setAttribute("user",user);
            return "redirect:/";
        }else{
            return "redirect:/";
        }
    }
}
