package com.springboot.example.myexception;

/**
 * Created by shiyanfei on 2018-09-18
 */
public class MyRuntimeException extends RuntimeException{
    private static final long serialVersionUID = 180953119442875469L;
    public MyRuntimeException(String message) {
        super(message);
    }
}
