package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@RestController
public class DemoRestController {

    @GetMapping("/greeting")
    public String test() {

        System.out.println("TT");
        System.out.println("TT");
        System.out.println("TT");
        return "test";
    }
    @RequestMapping(value = "/user/login")
    public String Login_info_get(@RequestParam("username") String username,String password){
        System.out.println("로그인 페이지 데이터 전달");
        System.out.println("아이디 :" +username);
        System.out.println("패스워드 :" + password);
        return "login";
    }

    @RequestMapping(value = "/user/signup")
    public String info_for_login(@RequestParam("username") String username, String name) {
        System.out.println("회원 가입 페이지 데이터 전달");
        System.out.println("아이디 :" + username);
        System.out.println("아이디 :" + name);
        return "signup";
    }
}
