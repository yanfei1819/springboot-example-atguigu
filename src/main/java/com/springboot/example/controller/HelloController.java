package com.springboot.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by shiyanfei on 2018-09-18
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Map<String,String> map){
        map.put("name","shiyanfei");
        return "thymeleaf";
    }
}
