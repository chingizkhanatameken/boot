package com.arocketman.github.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping(value="/")
    public String akmola(){
        return "mainMap";
    }
    @GetMapping(value="/akmola/zerendy")
    public String zer(){
        return "zerendy";
    }
    @GetMapping(value="/akmola/kokshetau")
    public String kokshetau(){
        return "kokshetau";
    }

    @GetMapping(value="/akmola/burabay")
    public String burabay(){
        return "burabay";
    }



    @GetMapping(value="/registration")
    public String register(){
        return "register";
    }

    @GetMapping(value="/login")
    public String login(){
        return "login";
    }

    @GetMapping(value="post/{id}")
    public String singlePost(){
        return "post";
    }

}
