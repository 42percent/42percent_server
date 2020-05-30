package com.example.demo;

import org.hibernate.annotations.SelectBeforeUpdate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

    @RequestMapping(value = "/user/login")
    public String Login_info_get(@RequestParam("username") String username, String password){
        System.out.println("아이디 :" +username);
        System.out.println("패스워드 :" + password);
        return "login";
    }

    @RequestMapping(value = "/user/signup")
    public String info_for_login(@RequestParam("username") String username, String name) {
        System.out.println("아이디 :" + username);
        System.out.println("아이11디 :" + name);
        return "signup";
    }

    public interface PageMapper{
        
    }
}
