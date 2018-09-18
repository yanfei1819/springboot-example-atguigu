package com.springboot.example.entity;

/**
 * Created by shiyanfei on 2018-09-18
 */
public class Friends {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
