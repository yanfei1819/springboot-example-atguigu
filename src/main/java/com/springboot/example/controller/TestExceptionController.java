package com.springboot.example.controller;

import com.springboot.example.myexception.MyException;
import com.springboot.example.myexception.MyRuntimeException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shiyanfei on 2018-09-18
 */
@Controller
@RequestMapping("/exception")
public class TestExceptionController {

    @GetMapping("/{id}")
    public String test(@PathVariable(name = "id") Integer id) throws MyException {

        if (id == 1) {
            throw new MyException("id不能为1");
        } else if (id == 2) {
            throw new MyRuntimeException("id不能为2");
        }

        return "SUCCESS";
    }

}
