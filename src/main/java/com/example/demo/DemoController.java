package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class DemoController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public String home() {


        return "home";
    }

    @GetMapping("/web")
    public String test() {


        return "test";
    }

    @GetMapping("/login")
    public String login() {

        System.out.println("여기가 로그인 페이지"); //서버에 데이터를 주기위해서 먼저 데이터를 받아야겠찌?.
        return "login";

    }
    @GetMapping("/signup")
    public  String signup() {
        System.out.println("여기가 회원가입 페이지"); // 05:30 왜 signup 페이지가 안뜨지 .

        return "signup";
    }

}
