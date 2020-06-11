package com.example.demo;

import com.example.demo.account.AccountService;
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

        return "login";
    }
    @GetMapping("/signup")
    public  String signup() {

        return "signup";
    }
}
