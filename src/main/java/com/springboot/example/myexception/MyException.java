package com.springboot.example.myexception;

/**
 * Created by shiyanfei on 2018-09-18
 */
public class MyException extends Exception {
    private static final long serialVersionUID = 7359656412861481365L;
    public MyException(String msg) {
        super(msg);
    }
}
