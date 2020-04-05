package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class DemoController {

    @GetMapping("/")
    public String home() {

        return "home";
    }

    @GetMapping("/web")
    public String test() {


        return "test";
    }

}
