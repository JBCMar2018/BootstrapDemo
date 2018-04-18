package com.example.car.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String showIndex()
    {
        return "index";
    }
    @RequestMapping("/comingsoon")
    public String comingSoon()
    {
        return "comingsoon";
    }
}
