package com.seven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InboxController {

    @RequestMapping("registration.do")
    public String registration(){
        return "registration.html";
    }

    @RequestMapping("model.do")
    public String model(){
        return "model.html";
    }

    @RequestMapping("house.do")
    public String house(){
        return "house.html";
    }

    @RequestMapping("government.do")
    public String government(){
        return "government.html";
    }

    @RequestMapping("archives.do")
    public String archives(){
        return "archives.html";
    }
}
