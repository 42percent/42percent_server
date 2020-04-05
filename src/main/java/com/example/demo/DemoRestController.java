package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


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
