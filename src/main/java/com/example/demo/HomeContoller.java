package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContoller {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/about")
    public String page2(){
        return "about";
    }

    @RequestMapping("/contact")
    public String page3(){
        return "contactus";
    }
}
