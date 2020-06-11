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


}
