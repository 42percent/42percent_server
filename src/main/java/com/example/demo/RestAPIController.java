package com.example.demo;

import org.hibernate.annotations.SelectBeforeUpdate;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

    @RequestMapping(value = "/user/login")
    public String getLoginInfo(@RequestParam("username") String username, String password){
        System.out.println("아이디 :" + username);
        System.out.println("패스워드 :" + password);
        return "login";
    }

    @PostMapping("/signup")
    public String infoLogin2(String identify, String password,String password_confirm,String name,String number,String user_email) {
        System.out.println("아  이  디   :" + identify);
        System.out.println("패 스 워 드  :" + password);
        System.out.println("패스워드 확인 :" + password_confirm);
        System.out.println("이      름  :" + name);
        System.out.println("전 화 번 호  :"  + number);
        System.out.println("이   메  일  :" + user_email);
        return "/signup";
    }

    public interface PageMapper{
        
    }
}
