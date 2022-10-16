package com.example.lab2_sspr;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Marat";
    }

    @RequestMapping("/2")
    public String home2() {
        return "Dudin";
    }

    @RequestMapping("/3")
    public String home3() {
        return "lab2";
    }
}
